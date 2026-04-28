// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    /**
     * <p>The profile picture.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://aa.com/1.jpg">http://aa.com/1.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The time when the user was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1639762579768</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>The user who created the user.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The default drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("default_drive_id")
    public String defaultDriveId;

    /**
     * <p>The description of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>vipuser</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The email address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:a@aliyunpds.com">a@aliyunpds.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The nickname of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The mobile number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001111</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role of the user. Valid values:</p>
     * <ul>
     * <li>superadmin</li>
     * <li>admin</li>
     * <li>user</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li>disabled: The user is prohibited from logon.</li>
     * <li>enabled: The user is in a normal state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the user was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1639762579768</p>
     */
    @NameInMap("updated_at")
    public Long updatedAt;

    /**
     * <p>The custom data of the user.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The name of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>pds</p>
     */
    @NameInMap("user_name")
    public String userName;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public User setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public User setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public User setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public User setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public User setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public User setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public User setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public User setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public User setUserData(java.util.Map<String, String> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
