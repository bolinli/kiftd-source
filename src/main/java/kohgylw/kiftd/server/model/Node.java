package kohgylw.kiftd.server.model;

import lombok.Data;

@Data
public class Node
{
    private String fileId;
    private String fileName;
    private String fileSize;
    private String fileParentFolder;
    private String fileCreationDate;
    private String fileCreator;
    private String filePath;
}
