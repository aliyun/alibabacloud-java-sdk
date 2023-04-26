// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileRemovePermissionRequest extends TeaModel {
    /**
     * <p>空间id</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>文件id</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>共享的用户对象集合</p>
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
         * <p>可授权对象，表示一个用户或者一个群组</p>
         */
        @NameInMap("identity")
        public Identity identity;

        /**
         * <p>目前支持两种方式设置权限，一种是通过指定角色设置权限，另一种是自定义操作权限，此字段用于指定角色设置权限，与action\_list互斥，当两个字段同时设置时，以此字段为准</p>
         * <br>
         * <p>目前支持：</p>
         * <br>
         * <p>SystemFileOwner（文件协同）</p>
         * <br>
         * <p>SystemFileDownloader（下载者）</p>
         * <br>
         * <p>SystemFileEditor（编辑者）</p>
         * <br>
         * <p>SystemFileEditorWithoutDelete（无删除编辑者）</p>
         * <br>
         * <p>SystemFileEditorWithoutShareLink（无分享编辑者）</p>
         * <br>
         * <p>SystemFileMetaViewer（可见列表）</p>
         * <br>
         * <p>SystemFileUploader（上传者）、SystemFileUploaderAndDownloader（上传/下载者）</p>
         * <br>
         * <p>SystemFileDownloaderWithShareLink（下载/分享者）</p>
         * <br>
         * <p>SystemFileUploaderAndDownloaderWithShareLink（上传/下载/分享者）</p>
         * <br>
         * <p>SystemFileUploaderAndViewer（预览/上传者）</p>
         * <br>
         * <p>SystemFileUploaderWithShareLink（上传/分享者）</p>
         * <br>
         * <p>SystemFileViewer（预览者）</p>
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
