// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseUserResponse extends TeaModel {
    /**
     * <p>The URL of the user\&quot;s avatar.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.b.c/ccp.jpg">http://a.b.c/ccp.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The time the user account was created, formatted as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1567407718386</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The entity that created the user account. For example, <code>system</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The ID of the user\&quot;s default drive.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("default_drive_id")
    public String defaultDriveId;

    /**
     * <p>The default storage location for the user\&quot;s data.</p>
     */
    @NameInMap("default_location")
    public String defaultLocation;

    /**
     * <p>Specifies if the user is prohibited from changing their own password. If <code>true</code>, the user cannot change their password.</p>
     */
    @NameInMap("deny_change_password_by_self")
    public Boolean denyChangePasswordBySelf;

    /**
     * <p>The user\&quot;s custom description.</p>
     * 
     * <strong>example:</strong>
     * <p>ccp team user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The unique ID of the domain to which the user belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hz999</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The user\&quot;s primary email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@ccp.com">123@ccp.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The time when the user account expires, specified as a UNIX timestamp in milliseconds. A value of <code>0</code> indicates the account never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("expired_at")
    public Long expiredAt;

    /**
     * <p>Specifies if the user account is synchronized from an external source, such as Active Directory.</p>
     */
    @NameInMap("is_sync")
    public Boolean isSync;

    /**
     * <p>The time the user last logged in, specified as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("last_login_time")
    public Long lastLoginTime;

    /**
     * <p>The time when the user\&quot;s refresh token was last used, specified as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("last_refresh_token_time")
    public Long lastRefreshTokenTime;

    /**
     * <p>Specifies if the user must change their password at the next login. If <code>true</code>, a password change is required.</p>
     */
    @NameInMap("need_change_password_next_login")
    public Boolean needChangePasswordNextLogin;

    /**
     * <p>The user\&quot;s display name or nickname.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The status of the user\&quot;s home directory. For example, <code>available</code>.</p>
     */
    @NameInMap("path_status")
    public String pathStatus;

    /**
     * <p>An array of permission strings for the corresponding key.</p>
     */
    @NameInMap("permission")
    public java.util.Map<String, IDPermission> permission;

    /**
     * <p>The user\&quot;s mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>13700000000</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The country calling code for the user\&quot;s mobile phone number. For example, <code>86</code> for China.</p>
     */
    @NameInMap("phone_region")
    public String phoneRegion;

    /**
     * <p>The user\&quot;s role. For example, <code>user</code> or <code>admin</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The status of the user account. Valid values: <code>enabled</code> and <code>disabled</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time the user account was last updated, formatted as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1567407718386</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>A map of custom key-value pairs for storing additional user data.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    /**
     * <p>The user\&quot;s unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ccpuserid</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The user\&quot;s name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
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

    public BaseUserResponse setLastRefreshTokenTime(Long lastRefreshTokenTime) {
        this.lastRefreshTokenTime = lastRefreshTokenTime;
        return this;
    }
    public Long getLastRefreshTokenTime() {
        return this.lastRefreshTokenTime;
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
