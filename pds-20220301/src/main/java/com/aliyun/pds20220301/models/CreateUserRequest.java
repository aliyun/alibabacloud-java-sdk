// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The user\&quot;s avatar.</p>
     * <p>HTTP URLs must start with <code>http://</code> or <code>https://</code> and must not exceed 4 KB.</p>
     * <p>Data URIs must start with <code>data://</code>, be Base64-encoded, and must not exceed 300 KB.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.b.c/pds.jpg">http://a.b.c/pds.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The user description. It can be up to 1,024 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>VIP user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The user\&quot;s email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@pds.com">123@pds.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The group information.</p>
     */
    @NameInMap("group_info_list")
    public java.util.List<CreateUserRequestGroupInfoList> groupInfoList;

    /**
     * <p>The user\&quot;s nickname. The nickname cannot exceed 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuer</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The user\&quot;s phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001111</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The user\&quot;s role. The default value is <code>user</code>.</p>
     * <ul>
     * <li><p><code>superadmin</code>: The super administrator.</p>
     * </li>
     * <li><p><code>admin</code>: An administrator.</p>
     * </li>
     * <li><p><code>user</code>: A standard user.</p>
     * </li>
     * </ul>
     * <p>If the current domain supports subdomains, the <code>subdomain_super_admin</code> and <code>subdomain_admin</code> roles are also available.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The user status. The default value is <code>enabled</code>.</p>
     * <ul>
     * <li><p><code>enabled</code> (The user is active)</p>
     * </li>
     * <li><p><code>disabled</code> (The user cannot log in)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>User-defined data, which can be up to 1,024 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>md</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    /**
     * <p>The user ID. The ID can be up to 64 characters long and must not contain the &quot;#&quot; character.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuserid1</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The username. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsusername</p>
     */
    @NameInMap("user_name")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setGroupInfoList(java.util.List<CreateUserRequestGroupInfoList> groupInfoList) {
        this.groupInfoList = groupInfoList;
        return this;
    }
    public java.util.List<CreateUserRequestGroupInfoList> getGroupInfoList() {
        return this.groupInfoList;
    }

    public CreateUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public CreateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUserRequest setUserData(java.util.Map<String, ?> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, ?> getUserData() {
        return this.userData;
    }

    public CreateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class CreateUserRequestGroupInfoList extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g123</p>
         */
        @NameInMap("group_id")
        public String groupId;

        public static CreateUserRequestGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestGroupInfoList self = new CreateUserRequestGroupInfoList();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestGroupInfoList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
