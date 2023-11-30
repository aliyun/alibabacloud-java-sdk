// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchUserRequest extends TeaModel {
    /**
     * <p>The email address of the user.</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\</p>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The nickname of the user. The nickname can be up to 128 characters in length.</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The nickname used for fuzzy searches. The nickname can be up to 128 characters in length.</p>
     */
    @NameInMap("nick_name_for_fuzzy")
    public String nickNameForFuzzy;

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
     * <p>The name of the user. The name can be up to 128 characters in length.</p>
     */
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
