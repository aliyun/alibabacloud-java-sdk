// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchUserRequest extends TeaModel {
    /**
     * <p>The user\&quot;s email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@pds.com">123@pds.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The maximum number of users to return per page. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination marker. Results are returned in alphabetical order, starting from the entry that follows the marker. If this parameter is not specified, the query starts from the beginning of the list.<br>Default value: None<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The user\&quot;s nickname. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuer</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>A keyword for a fuzzy search of nicknames. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>la</p>
     */
    @NameInMap("nick_name_for_fuzzy")
    public String nickNameForFuzzy;

    /**
     * <p>The user\&quot;s phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001111</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role of the user. Valid values:</p>
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
     * <p>The status of the user.</p>
     * <ul>
     * <li><p><code>disabled</code>: The user is disabled.</p>
     * </li>
     * <li><p><code>enabled</code>: The user is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The user\&quot;s name. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pds</p>
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
