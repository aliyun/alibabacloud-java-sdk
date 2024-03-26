// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAccountDelegatedStatusResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DelegatedStatus")
    public Boolean delegatedStatus;

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
