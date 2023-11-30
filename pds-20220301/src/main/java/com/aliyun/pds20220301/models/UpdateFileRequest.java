// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The processing method that is used if the file that you want to modify has the same name as an existing file on the cloud. Valid values:</p>
     * <br>
     * <p>ignore: allows you to modify the file by using the same name as an existing file on the cloud.</p>
     * <br>
     * <p>auto_rename: automatically renames the file that has the same name on the cloud. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405.</p>
     * <br>
     * <p>refuse: does not modify the file that you want to modify but returns the information about the file that has the same name on the cloud.</p>
     * <br>
     * <p>Default value: ignore.</p>
     */
    @NameInMap("check_name_mode")
    public String checkNameMode;

    /**
     * <p>The description of the file. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether to hide the file.</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>The tags of the file. You can specify up to 100 tags.</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    /**
     * <p>The local time when the file was modified. The time is in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.</p>
     */
    @NameInMap("local_modified_at")
    public String localModifiedAt;

    /**
     * <p>The name of the file. The name can be up to 1,024 bytes in length based on the UTF-8 encoding rule.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to add the file to favorites.</p>
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
