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
     * <p>The members whose permissions you want to remove.</p>
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
         * <p>The identity from which to revoke the permission. An identity can be a user or a user group.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("identity")
        public Identity identity;

        /**
         * <p>The ID of the role to remove. This parameter is mutually exclusive with <code>action_list</code>. If both are specified, <code>role_id</code> takes precedence.</p>
         * <p>Valid values:</p>
         * <p><code>SystemFileOwner</code> (file collaborator)</p>
         * <p><code>SystemFileDownloader</code> (downloader)</p>
         * <p><code>SystemFileEditor</code> (editor)</p>
         * <p><code>SystemFileEditorWithoutDelete</code> (editor without delete permission)</p>
         * <p><code>SystemFileEditorWithoutShareLink</code> (editor without share permission)</p>
         * <p><code>SystemFileMetaViewer</code> (list viewer)</p>
         * <p><code>SystemFileUploader</code> (uploader), and <code>SystemFileUploaderAndDownloader</code> (uploader/downloader)</p>
         * <p><code>SystemFileDownloaderWithShareLink</code> (downloader/sharer)</p>
         * <p><code>SystemFileUploaderAndDownloaderWithShareLink</code> (uploader/downloader/sharer)</p>
         * <p><code>SystemFileUploaderAndViewer</code> (viewer/uploader)</p>
         * <p><code>SystemFileUploaderWithShareLink</code> (uploader/sharer)</p>
         * <p><code>SystemFileViewer</code> (viewer)</p>
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
