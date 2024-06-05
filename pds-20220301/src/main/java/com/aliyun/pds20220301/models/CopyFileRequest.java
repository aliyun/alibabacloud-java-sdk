// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CopyFileRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically rename the file if the file name already exists in the destination folder. Default value: false.</p>
     */
    @NameInMap("auto_rename")
    public Boolean autoRename;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID or folder ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The ID of the drive to which you want to copy the file or folder. Default value: the value of drive_id.</p>
     */
    @NameInMap("to_drive_id")
    public String toDriveId;

    /**
     * <p>The ID of the destination parent folder. If you want to copy the file or folder to a root directory, set this parameter to root.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("to_parent_file_id")
    public String toParentFileId;

    public static CopyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyFileRequest self = new CopyFileRequest();
        return TeaModel.build(map, self);
    }

    public CopyFileRequest setAutoRename(Boolean autoRename) {
        this.autoRename = autoRename;
        return this;
    }
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    public CopyFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CopyFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CopyFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CopyFileRequest setToDriveId(String toDriveId) {
        this.toDriveId = toDriveId;
        return this;
    }
    public String getToDriveId() {
        return this.toDriveId;
    }

    public CopyFileRequest setToParentFileId(String toParentFileId) {
        this.toParentFileId = toParentFileId;
        return this;
    }
    public String getToParentFileId() {
        return this.toParentFileId;
    }

}
