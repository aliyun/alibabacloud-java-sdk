// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMonitorAccountsResponseBody extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMonitorAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorAccountsResponseBody self = new DescribeMonitorAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorAccountsResponseBody setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public DescribeMonitorAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
