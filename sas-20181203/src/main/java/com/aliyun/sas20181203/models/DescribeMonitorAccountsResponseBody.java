// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMonitorAccountsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the members.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
     */
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
