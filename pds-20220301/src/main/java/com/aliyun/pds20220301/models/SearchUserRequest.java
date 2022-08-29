// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchUserRequest extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("nick_name_for_fuzzy")
    public String nickNameForFuzzy;

    @NameInMap("phone")
    public String phone;

    @NameInMap("role")
    public String role;

    @NameInMap("status")
    public String status;

    @NameInMap("user_name")
    public String userName;

    public static SearchUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchUserRequest self = new SearchUserRequest();
        return TeaModel.build(map, self);
    }

    public SearchUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SearchUserRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchUserRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public SearchUserRequest setNickNameForFuzzy(String nickNameForFuzzy) {
        this.nickNameForFuzzy = nickNameForFuzzy;
        return this;
    }
    public String getNickNameForFuzzy() {
        return this.nickNameForFuzzy;
    }

    public SearchUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SearchUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public SearchUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
