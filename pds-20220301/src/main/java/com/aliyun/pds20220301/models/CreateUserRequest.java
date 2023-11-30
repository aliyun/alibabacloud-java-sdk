// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The URL of the profile picture.</p>
     * <br>
     * <p>If you specify the parameter in the HTTP URL format, the URL must start with http:// or https:// and can be up to 4 KB in size.</p>
     * <br>
     * <p>If you specify the parameter in the data URL format, the URL must start with data:// and be encoded in Base64. The URL can be up to 300 KB in size.</p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The description of the user. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The email address.</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The information about the group.</p>
     */
    @NameInMap("group_info_list")
    public java.util.List<CreateUserRequestGroupInfoList> groupInfoList;

    /**
     * <p>The nickname of the user. The nickname can be up to 128 characters in length.</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role of the user. Default value: user. Valid values:</p>
     * <br>
     * <p>*   superadmin</p>
     * <p>*   admin</p>
     * <p>*   user</p>
     * <br>
     * <p>If the domain can be divided into subdomains, the subdomain_super_admin and subdomain_admin roles are also supported.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   subdomain_super_admin</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   subdomain_admin</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   superadmin</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   admin</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   user</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The state of the user. Default value: enabled. Valid values:</p>
     * <br>
     * <p>*   enabled: The user is in a normal state.</p>
     * <p>*   disabled: The user is prohibited from logon.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The custom data. The data can be up to 1,024 characters in length.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    /**
     * <p>The user ID. The ID can be up to 64 characters in length and cannot contain number signs (#).</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The username. The username can be up to 128 characters in length.</p>
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
