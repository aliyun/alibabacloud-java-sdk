// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseUserResponse extends TeaModel {
    @NameInMap("avatar")
    public String avatar;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

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

    public static BaseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseUserResponse self = new BaseUserResponse();
        return TeaModel.build(map, self);
    }

    public BaseUserResponse setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public BaseUserResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseUserResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseUserResponse setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public BaseUserResponse setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
        return this;
    }
    public String getDefaultLocation() {
        return this.defaultLocation;
    }

    public BaseUserResponse setDenyChangePasswordBySelf(Boolean denyChangePasswordBySelf) {
        this.denyChangePasswordBySelf = denyChangePasswordBySelf;
        return this;
    }
    public Boolean getDenyChangePasswordBySelf() {
        return this.denyChangePasswordBySelf;
    }

    public BaseUserResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseUserResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseUserResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public BaseUserResponse setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    public BaseUserResponse setIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }
    public Boolean getIsSync() {
        return this.isSync;
    }

    public BaseUserResponse setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public BaseUserResponse setNeedChangePasswordNextLogin(Boolean needChangePasswordNextLogin) {
        this.needChangePasswordNextLogin = needChangePasswordNextLogin;
        return this;
    }
    public Boolean getNeedChangePasswordNextLogin() {
        return this.needChangePasswordNextLogin;
    }

    public BaseUserResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public BaseUserResponse setPathStatus(String pathStatus) {
        this.pathStatus = pathStatus;
        return this;
    }
    public String getPathStatus() {
        return this.pathStatus;
    }

    public BaseUserResponse setPermission(java.util.Map<String, IDPermission> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, IDPermission> getPermission() {
        return this.permission;
    }

    public BaseUserResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public BaseUserResponse setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public BaseUserResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public BaseUserResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BaseUserResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public BaseUserResponse setUserData(java.util.Map<String, ?> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, ?> getUserData() {
        return this.userData;
    }

    public BaseUserResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BaseUserResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
