package com.geekbrains.cloud.jan.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileMessage extends AbstractMessage {

    private String fileName;
    private byte[] bytes;

    public FileMessage(String fileName, byte[] bytes){
        this.fileName = fileName;
        this.bytes = bytes;
    }
    public FileMessage(Path path) throws IOException {
        fileName = path.getFileName().toString();
        bytes = Files.readAllBytes(path);
    }

    @Override
    public CommandType getType() {
        return CommandType.FILE_MESSAGE;
    }
}
