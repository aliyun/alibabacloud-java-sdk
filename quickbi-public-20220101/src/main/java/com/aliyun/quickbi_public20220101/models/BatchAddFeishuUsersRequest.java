// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class BatchAddFeishuUsersRequest extends TeaModel {
    /**
     * <p>Information of the users to be added</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ad<strong><strong>fd&quot;: &quot;TEST&quot;, &quot;82</strong></strong>5a&quot;: &quot;TEST&quot;}&quot;</p>
     */
    @NameInMap("FeishuUsers")
    public String feishuUsers;

    /**
     * <p>Whether the user is an admin user:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default is false if not provided</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    /**
     * <p>Whether the user is an authorization administrator</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default is false if not provided</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAuthAdmin")
    public Boolean isAuthAdmin;

    /**
     * <p>User group ID(s)</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0d5fb19b-5555-41f0-99da-1248fc27ca51,0f868dd6_68dd_4d13_8422_c5dca3bd4b61&quot;</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>User type</p>
     * <ul>
     * <li>Developer: 1</li>
     * <li>Visitor: 2</li>
     * <li>Analyst: 3</li>
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
