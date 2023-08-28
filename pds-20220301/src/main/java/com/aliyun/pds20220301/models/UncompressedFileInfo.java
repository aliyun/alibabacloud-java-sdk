// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UncompressedFileInfo extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("is_folder")
    public Boolean isFolder;

    @NameInMap("items")
    public java.util.List<UncompressedFileInfo> items;

    @NameInMap("name")
    public String name;

    @NameInMap("size")
    public Long size;

    @NameInMap("updated_at")
    public Long updatedAt;

    public static UncompressedFileInfo build(java.util.Map<String, ?> map) throws Exception {
        UncompressedFileInfo self = new UncompressedFileInfo();
        return TeaModel.build(map, self);
    }

    public UncompressedFileInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UncompressedFileInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UncompressedFileInfo setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
        return this;
    }
    public Boolean getIsFolder() {
        return this.isFolder;
    }

    public UncompressedFileInfo setItems(java.util.List<UncompressedFileInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<UncompressedFileInfo> getItems() {
        return this.items;
    }

    public UncompressedFileInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UncompressedFileInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public UncompressedFileInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
