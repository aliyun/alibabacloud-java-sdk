// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The URL of the profile picture.</p>
     * <br>
     * <p>If you specify the parameter in the HTTP URL format, the URL must start with http:// or https:// and can be up to 4 KB in size.</p>
     * <br>
     * <p>If you specify the parameter in the DATA URL format, the URL must start with data:// and be encoded in Base64. The URL can be up to 300 KB in size.</p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The description of the user. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The email address of the user.</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The information about the group.</p>
     */
    @NameInMap("group_info_list")
    public java.util.List<UpdateUserRequestGroupInfoList> groupInfoList;

    /**
     * <p>The nickname of the user. The nickname can be up to 128 characters in length.</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The mobile number of the user.</p>
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
     * <p>The custom data. The data can be up to 1,024 characters in length.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

    /**
     * <p>The user ID. The ID can be up to 64 characters in length and cannot contain a number sign (#).</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserRequest setGroupInfoList(java.util.List<UpdateUserRequestGroupInfoList> groupInfoList) {
        this.groupInfoList = groupInfoList;
        return this;
    }
    public java.util.List<UpdateUserRequestGroupInfoList> getGroupInfoList() {
        return this.groupInfoList;
    }

    public UpdateUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UpdateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateUserRequest setUserData(java.util.Map<String, String> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class UpdateUserRequestGroupInfoList extends TeaModel {
        /**
         * <p>The group ID.</p>
         */
        @NameInMap("group_id")
        public String groupId;

        public static UpdateUserRequestGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserRequestGroupInfoList self = new UpdateUserRequestGroupInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateUserRequestGroupInfoList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
