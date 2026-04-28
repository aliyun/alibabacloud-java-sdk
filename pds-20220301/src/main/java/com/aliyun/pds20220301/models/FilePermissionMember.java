// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePermissionMember extends TeaModel {
    /**
     * <p>The list of permissions to grant. You can grant permissions by assigning roles to identities, or you can customize the permissions. To grant permissions by assigning roles to identities, specify role_id. role_id and action_list are mutually exclusive. If both parameters are specified, the value of role_id prevails. When you specify action_list, the system automatically generates a temporary role_id. You can use this role_id to revoke the permissions.</p>
     */
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    /**
     * <p>Specifies whether the users of subgroups can inherit the permissions. For example, a user named user1 belongs to the group1 group, and a user named user2 belongs to the group2 group. group2 is the subgroup of group1. If you set disinherit_sub_group to true, only user1 is granted the permissions. user2 is not granted the permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disinherit_sub_group")
    public Boolean disinheritSubGroup;

    /**
     * <p>The time when the permissions expire. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. A value of 4775500800000 indicates that the permissions never expire.</p>
     * 
     * <strong>example:</strong>
     * <p>1633598085642</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

    /**
     * <p>The identity to which the permissions are granted, which is a user or a group.</p>
     */
    @NameInMap("identity")
    public Identity identity;

    /**
     * <p>The role ID. You can grant permissions by assigning roles to identities, or you can customize the permissions. To grant permissions by assigning roles to identities, specify role_id. role_id and action_list are mutually exclusive. If both parameters are specified, the value of role_id prevails.</p>
     * <p>Valid values:</p>
     * <p>SystemFileOwner: collaborator</p>
     * <p>SystemFileDownloader: downloader</p>
     * <p>SystemFileEditor: editor</p>
     * <p>SystemFileEditorWithoutDelete: editor without permissions to delete the file</p>
     * <p>SystemFileEditorWithoutShareLink: editor without permissions to share the file</p>
     * <p>SystemFileMetaViewer: viewer of lists</p>
     * <p>SystemFileUploader: uploader. SystemFileUploaderAndDownloader: uploader and downloader</p>
     * <p>SystemFileDownloaderWithShareLink: downloader and sharer</p>
     * <p>SystemFileUploaderAndDownloaderWithShareLink: uploader, downloader, and sharer</p>
     * <p>SystemFileUploaderAndViewer: viewer and uploader</p>
     * <p>SystemFileUploaderWithShareLink: uploader and sharer</p>
     * <p>SystemFileViewer: viewer</p>
     * 
     * <strong>example:</strong>
     * <p>SystemFileDownloader</p>
     */
    @NameInMap("role_id")
    public String roleId;

    public static FilePermissionMember build(java.util.Map<String, ?> map) throws Exception {
        FilePermissionMember self = new FilePermissionMember();
        return TeaModel.build(map, self);
    }

    public FilePermissionMember setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public FilePermissionMember setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public FilePermissionMember setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public FilePermissionMember setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public FilePermissionMember setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
