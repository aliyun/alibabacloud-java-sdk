// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The naming policy to apply when a file with the same name already exists. Valid values:</p>
     * <p><code>ignore</code>: Allow the duplicate file name.</p>
     * <p><code>auto_rename</code>: Automatically rename the file by appending a timestamp. Example: <code>xxx_20060102_150405</code>.</p>
     * <p><code>refuse</code>: Reject the request and return the details of the existing file.</p>
     * <p>Default value: <code>ignore</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("check_name_mode")
    public String checkNameMode;

    /**
     * <p>The description of the file. Maximum length: 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>VIP user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether the file is hidden.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>The labels of the file. A maximum of 100 labels are allowed.</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    /**
     * <p>The modification time of the file on the local device. Specify a UTC timestamp in ISO 8601 format: <code>YYYY-MM-DDTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("local_modified_at")
    public String localModifiedAt;

    /**
     * <p>The name of the file. The value must be UTF-8 encoded and no longer than 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>a.jpg</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether the file is starred.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("starred")
    public Boolean starred;

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileRequest setCheckNameMode(String checkNameMode) {
        this.checkNameMode = checkNameMode;
        return this;
    }
    public String getCheckNameMode() {
        return this.checkNameMode;
    }

    public UpdateFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateFileRequest setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public UpdateFileRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public UpdateFileRequest setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public UpdateFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFileRequest setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

}
