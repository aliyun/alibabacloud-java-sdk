// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account name or Alibaba Cloud ID to query.</p>
     * <ul>
     * <li>When you enter an account name:<ul>
     * <li>If the organization user is a primary account (for example, main_account), the query account format is the primary account. That is, enter the primary account main_account. </li>
     * <li>If the organization user is a RAM user (for example, <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>), the query account format is the prefix of the RAM user. That is, enter zhangsan.</li>
     * </ul>
     * </li>
     * <li>When you enter an Alibaba Cloud ID:<ul>
     * <li>Enter the complete account UID to query the corresponding account information.</li>
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
     * <p>The account name of the primary account when a duplicate error occurs during RAM user query. For example, <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>.</p>
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
