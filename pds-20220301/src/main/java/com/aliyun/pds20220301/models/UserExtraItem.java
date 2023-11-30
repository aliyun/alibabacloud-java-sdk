// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UserExtraItem extends TeaModel {
    @NameInMap("account")
    public java.util.List<AccountLinkInfo> account;

    @NameInMap("avatar")
    public String avatar;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("default_drive")
    public BaseDriveResponse defaultDrive;

    @NameInMap("default_drive_id")
    public String defaultDriveId;

    @NameInMap("default_location")
    public String defaultLocation;

    @NameInMap("deny_change_password_by_self")
    public Boolean denyChangePasswordBySelf;

    @NameInMap("description")
    public String description;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("email")
    public String email;

    @NameInMap("expired_at")
    public Long expiredAt;

    @NameInMap("is_sync")
    public Boolean isSync;

    @NameInMap("last_login_time")
    public Long lastLoginTime;

    @NameInMap("need_change_password_next_login")
    public Boolean needChangePasswordNextLogin;

    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("parent_group")
    public java.util.List<BaseDriveResponse> parentGroup;

    @NameInMap("path_status")
    public String pathStatus;

    @NameInMap("permission")
    public java.util.Map<String, IDPermission> permission;

    @NameInMap("phone")
    public String phone;

    @NameInMap("phone_region")
    public String phoneRegion;

    @NameInMap("role")
    public String role;

    @NameInMap("status")
    public String status;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static UserExtraItem build(java.util.Map<String, ?> map) throws Exception {
        UserExtraItem self = new UserExtraItem();
        return TeaModel.build(map, self);
    }

    public UserExtraItem setAccount(java.util.List<AccountLinkInfo> account) {
        this.account = account;
        return this;
    }
    public java.util.List<AccountLinkInfo> getAccount() {
        return this.account;
    }

    public UserExtraItem setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UserExtraItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UserExtraItem setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UserExtraItem setDefaultDrive(BaseDriveResponse defaultDrive) {
        this.defaultDrive = defaultDrive;
        return this;
    }
    public BaseDriveResponse getDefaultDrive() {
        return this.defaultDrive;
    }

    public UserExtraItem setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public UserExtraItem setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
        return this;
    }
    public String getDefaultLocation() {
        return this.defaultLocation;
    }

    public UserExtraItem setDenyChangePasswordBySelf(Boolean denyChangePasswordBySelf) {
        this.denyChangePasswordBySelf = denyChangePasswordBySelf;
        return this;
    }
    public Boolean getDenyChangePasswordBySelf() {
        return this.denyChangePasswordBySelf;
    }

    public UserExtraItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UserExtraItem setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public UserExtraItem setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserExtraItem setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    public UserExtraItem setIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }
    public Boolean getIsSync() {
        return this.isSync;
    }

    public UserExtraItem setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public UserExtraItem setNeedChangePasswordNextLogin(Boolean needChangePasswordNextLogin) {
        this.needChangePasswordNextLogin = needChangePasswordNextLogin;
        return this;
    }
    public Boolean getNeedChangePasswordNextLogin() {
        return this.needChangePasswordNextLogin;
    }

    public UserExtraItem setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UserExtraItem setParentGroup(java.util.List<BaseDriveResponse> parentGroup) {
        this.parentGroup = parentGroup;
        return this;
    }
    public java.util.List<BaseDriveResponse> getParentGroup() {
        return this.parentGroup;
    }

    public UserExtraItem setPathStatus(String pathStatus) {
        this.pathStatus = pathStatus;
        return this;
    }
    public String getPathStatus() {
        return this.pathStatus;
    }

    public UserExtraItem setPermission(java.util.Map<String, IDPermission> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, IDPermission> getPermission() {
        return this.permission;
    }

    public UserExtraItem setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UserExtraItem setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public UserExtraItem setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UserExtraItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserExtraItem setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UserExtraItem setUserData(java.util.Map<String, ?> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, ?> getUserData() {
        return this.userData;
    }

    public UserExtraItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserExtraItem setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
