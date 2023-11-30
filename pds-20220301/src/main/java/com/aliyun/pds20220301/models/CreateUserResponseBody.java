// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    /**
     * <p>The URL of the profile picture.</p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The time when the user was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>The user who created the user.</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The ID of the default drive.</p>
     */
    @NameInMap("default_drive_id")
    public String defaultDriveId;

    /**
     * <p>The description of the user.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The email address.</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The nickname of the user.</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role of the user. Valid values:</p>
     * <br>
     * <p>*   superadmin</p>
     * <p>*   admin</p>
     * <p>*   user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The state of the user. Valid values:</p>
     * <br>
     * <p>*   disabled: The user is prohibited from logon.</p>
     * <p>*   enabled: The user is in a normal state.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the user was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("updated_at")
    public Long updatedAt;

    /**
     * <p>The custom data.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    /**
     * <p>The user ID.</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The username.</p>
     */
    @NameInMap("user_name")
    public String userName;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public CreateUserResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public CreateUserResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateUserResponseBody setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public CreateUserResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateUserResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public CreateUserResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateUserResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateUserResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUserResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateUserResponseBody setUserData(java.util.Map<String, ?> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, ?> getUserData() {
        return this.userData;
    }

    public CreateUserResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateUserResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
