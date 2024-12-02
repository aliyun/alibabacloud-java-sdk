// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseFileUserPermissionResponse extends TeaModel {
    @NameInMap("can_access")
    public Boolean canAccess;

    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("disinherit_sub_group")
    public Boolean disinheritSubGroup;

    /**
     * <strong>example:</strong>
     * <p>bj23</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("expire_time")
    public Long expireTime;

    @NameInMap("file_full_path")
    public String fileFullPath;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("identity")
    public Identity identity;

    @NameInMap("role_id")
    public String roleId;

    public static BaseFileUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseFileUserPermissionResponse self = new BaseFileUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public BaseFileUserPermissionResponse setCanAccess(Boolean canAccess) {
        this.canAccess = canAccess;
        return this;
    }
    public Boolean getCanAccess() {
        return this.canAccess;
    }

    public BaseFileUserPermissionResponse setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public BaseFileUserPermissionResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseFileUserPermissionResponse setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public BaseFileUserPermissionResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseFileUserPermissionResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public BaseFileUserPermissionResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public BaseFileUserPermissionResponse setFileFullPath(String fileFullPath) {
        this.fileFullPath = fileFullPath;
        return this;
    }
    public String getFileFullPath() {
        return this.fileFullPath;
    }

    public BaseFileUserPermissionResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public BaseFileUserPermissionResponse setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public BaseFileUserPermissionResponse setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
