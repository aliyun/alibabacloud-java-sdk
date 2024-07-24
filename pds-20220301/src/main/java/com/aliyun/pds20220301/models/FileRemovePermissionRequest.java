// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileRemovePermissionRequest extends TeaModel {
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
     * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The identities with whom the file is shared.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The identity to whom the permissions are granted, which is a user or a group.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("identity")
        public Identity identity;

        /**
         * <p>The role ID. You can grant permissions by assigning roles to identities, or you can customize the permissions. To grant permissions by assigning roles to identities, specify role_id. role_id and action_list are mutually exclusive. If both parameters are specified, role_id has a higher priority.</p>
         * <p>Valid values:</p>
         * <p>SystemFileOwner: collaborator.</p>
         * <p>SystemFileDownloader: downloader.</p>
         * <p>SystemFileEditor: editor.</p>
         * <p>SystemFileEditorWithoutDelete: editor without permissions to delete the file.</p>
         * <p>SystemFileEditorWithoutShareLink: editor without permissions to share the file.</p>
         * <p>SystemFileMetaViewer: viewer of lists.</p>
         * <p>SystemFileUploader: uploader. SystemFileUploaderAndDownloader: uploader and downloader.</p>
         * <p>SystemFileDownloaderWithShareLink: downloader and sharer.</p>
         * <p>SystemFileUploaderAndDownloaderWithShareLink: uploader, downloader, and sharer.</p>
         * <p>SystemFileUploaderAndViewer: viewer and uploader.</p>
         * <p>SystemFileUploaderWithShareLink: uploader and sharer.</p>
         * <p>SystemFileViewer: viewer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemFileDownloader</p>
         */
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
