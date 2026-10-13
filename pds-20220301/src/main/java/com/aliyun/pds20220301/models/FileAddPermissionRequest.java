// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileAddPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the folder. To authorize an entire team drive, set this parameter to root. Setting this parameter to root is not supported for personal drive sharing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The list of members to be authorized.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("member_list")
    public java.util.List<FilePermissionMember> memberList;

    public static FileAddPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        FileAddPermissionRequest self = new FileAddPermissionRequest();
        return TeaModel.build(map, self);
    }

    public FileAddPermissionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileAddPermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileAddPermissionRequest setMemberList(java.util.List<FilePermissionMember> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<FilePermissionMember> getMemberList() {
        return this.memberList;
    }

}
