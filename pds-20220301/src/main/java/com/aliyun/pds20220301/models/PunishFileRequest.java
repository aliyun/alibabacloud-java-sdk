// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PunishFileRequest extends TeaModel {
    /**
     * <p>The penalty action. Valid values:<code>pds_file_meta_frozen</code>: Freezes the file.<code>pds_file_meta_share_forbidden</code>: Disables sharing for the file.<code>pds_file_meta_remove_punish</code>: Removes the penalty from the file.<code>pds_file_frozen</code>: Freezes the file at the content level.<code>pds_fileshare_forbidden</code>: Disables sharing for the file at the content level.<code>pds_file_remove_punish</code>: Removes the penalty from the file at the content level.A content-level penalty affects all files that have the same content. A non-content-level penalty affects only the specified file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pds_file_meta_frozen</p>
     */
    @NameInMap("action_code")
    public String actionCode;

    /**
     * <p>The ID of the drive that contains the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2498DZ2</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The reason for the penalty.</p>
     * 
     * <strong>example:</strong>
     * <p>illegal</p>
     */
    @NameInMap("punish_reason")
    public String punishReason;

    public static PunishFileRequest build(java.util.Map<String, ?> map) throws Exception {
        PunishFileRequest self = new PunishFileRequest();
        return TeaModel.build(map, self);
    }

    public PunishFileRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public PunishFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public PunishFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PunishFileRequest setPunishReason(String punishReason) {
        this.punishReason = punishReason;
        return this;
    }
    public String getPunishReason() {
        return this.punishReason;
    }

}
