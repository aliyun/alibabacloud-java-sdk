// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account name or Alibaba Cloud ID of the user.</p>
     * <ul>
     * <li><p>If you enter an account name:</p>
     * <ul>
     * <li><p>If the organization member is a root account, such as <code>main_account</code>, enter the root account name. For example, <code>main_account</code>.</p>
     * </li>
     * <li><p>If the organization member is a RAM user, such as <code>zhangsan@test.onaliyun.com</code>, enter the prefix of the username before the at sign (@). For example, <code>zhangsan</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If you enter an Alibaba Cloud ID:</p>
     * <ul>
     * <li>Enter the complete user ID (UID) of the account.</li>
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

    /**
     * <p>To resolve a &quot;duplicate user&quot; error when querying a RAM user, specify the name of the root account to which the user belongs.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a></p>
     */
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
