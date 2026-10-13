// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The URL of the avatar.</p>
     * <p>HTTP URLs must start with <code>http://</code> or <code>https://</code> and be 4 KB or smaller.</p>
     * <p>Data URLs must start with <code>data://</code>, be Base64-encoded, and be 300 KB or smaller.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.b.c/pds.jpg">http://a.b.c/pds.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The description. The maximum length is 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Vip user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:a@aliyunpds.com">a@aliyunpds.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The group list.</p>
     */
    @NameInMap("group_info_list")
    public java.util.List<UpdateUserRequestGroupInfoList> groupInfoList;

    /**
     * <p>The nickname. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuer</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The mobile number.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001111</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role. Valid values:</p>
     * <ul>
     * <li><p><code>superadmin</code>: super administrator</p>
     * </li>
     * <li><p><code>admin</code>: administrator</p>
     * </li>
     * <li><p><code>user</code>: regular user</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The user status. Valid values:</p>
     * <ul>
     * <li><p><code>disabled</code></p>
     * </li>
     * <li><p><code>enabled</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The custom user data. The maximum length is 1,024 characters.</p>
     */
    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

    /**
     * <p>The user ID. The maximum length is 64 characters. The value cannot contain the <code>#</code> character.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
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
         * 
         * <strong>example:</strong>
         * <p>g123</p>
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
