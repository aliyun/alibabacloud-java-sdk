// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileRemovePermissionRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("member_list")
    public java.util.List<FileRemovePermissionRequestMemberList> memberList;

    public static FileRemovePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        FileRemovePermissionRequest self = new FileRemovePermissionRequest();
        return TeaModel.build(map, self);
    }

    public FileRemovePermissionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileRemovePermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileRemovePermissionRequest setMemberList(java.util.List<FileRemovePermissionRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<FileRemovePermissionRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public static class FileRemovePermissionRequestMemberList extends TeaModel {
        @NameInMap("identity")
        public Identity identity;

        @NameInMap("role_id")
        public String roleId;

        public static FileRemovePermissionRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            FileRemovePermissionRequestMemberList self = new FileRemovePermissionRequestMemberList();
            return TeaModel.build(map, self);
        }

        public FileRemovePermissionRequestMemberList setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }
        public Identity getIdentity() {
            return this.identity;
        }

        public FileRemovePermissionRequestMemberList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
