// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileDeleteUserTagsRequest extends TeaModel {
    /**
     * <p>Space ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>File ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>List of tags to delete.
     * The array must not be empty and can contain up to 1,000 items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("key_list")
    public java.util.List<String> keyList;

    public static FileDeleteUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        FileDeleteUserTagsRequest self = new FileDeleteUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public FileDeleteUserTagsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileDeleteUserTagsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileDeleteUserTagsRequest setKeyList(java.util.List<String> keyList) {
        this.keyList = keyList;
        return this;
    }
    public java.util.List<String> getKeyList() {
        return this.keyList;
    }

}
