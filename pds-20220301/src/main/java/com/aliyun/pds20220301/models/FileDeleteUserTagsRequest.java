// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileDeleteUserTagsRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The tags that you want to remove from a file. You cannot leave this parameter empty. You can specify up to 1,000 tags.</p>
     * <br>
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
