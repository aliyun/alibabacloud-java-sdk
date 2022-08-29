// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("avatar")
    public String avatar;

    @NameInMap("description")
    public String description;

    @NameInMap("email")
    public String email;

    @NameInMap("group_info_list")
    public java.util.List<UpdateUserRequestGroupInfoList> groupInfoList;

    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("phone")
    public String phone;

    @NameInMap("role")
    public String role;

    @NameInMap("status")
    public String status;

    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

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
