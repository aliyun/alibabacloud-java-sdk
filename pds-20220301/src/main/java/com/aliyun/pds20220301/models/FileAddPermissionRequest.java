// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileAddPermissionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the folder. If you want to authorize a user or group to access a team drive, set this parameter to root. If you want to authorize a user or group to access an individual drive, you cannot set this parameter to root.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The members that are authorized to access files.</p>
     * <br>
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
