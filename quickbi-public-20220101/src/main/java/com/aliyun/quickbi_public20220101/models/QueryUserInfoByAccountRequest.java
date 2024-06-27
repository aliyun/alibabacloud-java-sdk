// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountRequest extends TeaModel {
    /**
     * <p>Enter the name or ID of the Alibaba Cloud account that you want to query.</p>
     * <ul>
     * <li><p>When you enter an account name:</p>
     * <ul>
     * <li>If the organization user is a master account, such as main_account, the query account format is master account. That is, the main account main_account to be entered.</li>
     * <li>If the organization user is a RAM user, such as a <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>, the query account format is the head of the RAM user, that is, the RAM user to be entered is zhangsan.</li>
     * </ul>
     * </li>
     * <li><p>ID：</p>
     * <ul>
     * <li>Enter the UID of the account to query the account information.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1386587****@163.com</p>
     */
    @NameInMap("Account")
    public String account;

    @NameInMap("ParentAccountName")
    public String parentAccountName;

    public static QueryUserInfoByAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByAccountRequest self = new QueryUserInfoByAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public QueryUserInfoByAccountRequest setParentAccountName(String parentAccountName) {
        this.parentAccountName = parentAccountName;
        return this;
    }
    public String getParentAccountName() {
        return this.parentAccountName;
    }

}
