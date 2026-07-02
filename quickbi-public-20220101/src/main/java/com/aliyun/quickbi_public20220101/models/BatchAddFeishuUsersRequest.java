// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class BatchAddFeishuUsersRequest extends TeaModel {
    /**
     * <p>The information about the users to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ad<strong><strong>fd&quot;: &quot;test&quot;, &quot;82</strong></strong>5a&quot;: &quot;t\&quot;t&quot;}&quot;</p>
     */
    @NameInMap("FeishuUsers")
    public String feishuUsers;

    /**
     * <p>Specifies whether the user is an admin user. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    /**
     * <p>Specifies whether the user is a permission management administrator. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAuthAdmin")
    public Boolean isAuthAdmin;

    /**
     * <p>The user groups to which the users belong.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0d5fb19b-5555-41f0-99da-1248fc27ca51,0f868dd6_68dd_4d13_8422_c5dca3bd4b61&quot;</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>The user type. Valid values:</p>
     * <ul>
     * <li>1: developer</li>
     * <li>2: visitor</li>
     * <li>3: analyst</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserType")
    public Integer userType;

    public static BatchAddFeishuUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFeishuUsersRequest self = new BatchAddFeishuUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFeishuUsersRequest setFeishuUsers(String feishuUsers) {
        this.feishuUsers = feishuUsers;
        return this;
    }
    public String getFeishuUsers() {
        return this.feishuUsers;
    }

    public BatchAddFeishuUsersRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public BatchAddFeishuUsersRequest setIsAuthAdmin(Boolean isAuthAdmin) {
        this.isAuthAdmin = isAuthAdmin;
        return this;
    }
    public Boolean getIsAuthAdmin() {
        return this.isAuthAdmin;
    }

    public BatchAddFeishuUsersRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public BatchAddFeishuUsersRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
