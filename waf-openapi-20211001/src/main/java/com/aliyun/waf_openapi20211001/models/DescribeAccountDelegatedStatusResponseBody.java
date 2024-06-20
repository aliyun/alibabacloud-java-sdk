// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAccountDelegatedStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>10***********34</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The name of the Alibaba Cloud account. This parameter is returned only if the account is the delegated administrator account.</p>
     * 
     * <strong>example:</strong>
     * <p>account_test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Indicates whether the Alibaba Cloud account is the delegated administrator account of the WAF instance.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DelegatedStatus")
    public Boolean delegatedStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8161375D-5958-5627-BFDE-DF14****3E87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountDelegatedStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountDelegatedStatusResponseBody self = new DescribeAccountDelegatedStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountDelegatedStatusResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeAccountDelegatedStatusResponseBody setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountDelegatedStatusResponseBody setDelegatedStatus(Boolean delegatedStatus) {
        this.delegatedStatus = delegatedStatus;
        return this;
    }
    public Boolean getDelegatedStatus() {
        return this.delegatedStatus;
    }

    public DescribeAccountDelegatedStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
