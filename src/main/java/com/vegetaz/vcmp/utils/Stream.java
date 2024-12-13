package com.vegetaz.vcmp.util;

import static com.vegetaz.vcmp.controllers.MainController.server;

import com.google.common.io.LittleEndianDataOutputStream;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.plugin.integration.server.Server;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Stream {

    private final ByteArrayOutputStream byteArrayOutputStream;
    private final LittleEndianDataOutputStream dataOutputStream;

    public Stream(int code) throws IOException {
        byteArrayOutputStream = new ByteArrayOutputStream();
        dataOutputStream = new LittleEndianDataOutputStream(byteArrayOutputStream);

        writeInt(code);
    }

    public Stream(byte code) throws IOException {
        byteArrayOutputStream = new ByteArrayOutputStream();
        dataOutputStream = new LittleEndianDataOutputStream(byteArrayOutputStream);

        writeByte(code);
    }

    public Stream writeString(String data) throws IOException {
        dataOutputStream.writeUTF(data);
        return this;
    }

    public Stream writeByte(int data) throws IOException {
        dataOutputStream.write(data);
        return this;
    }

    public Stream writeInt(int data) throws IOException {
        dataOutputStream.writeInt(data);
        return this;
    }

    public Stream writeFloat(float data) throws IOException {
        dataOutputStream.writeFloat(data);
        return this;
    }

    public void send(Player player) throws IOException {
        dataOutputStream.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();
        boolean result = server.sendScriptData(player, bytes);
    }
}
