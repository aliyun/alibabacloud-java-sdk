// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPayerForAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the settlement account.</p>
     * 
     * <strong>example:</strong>
     * <p>172841235500****</p>
     */
    @NameInMap("PayerAccountId")
    public String payerAccountId;

    /**
     * <p>The name of the settlement account.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("PayerAccountName")
    public String payerAccountName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPayerForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPayerForAccountResponseBody self = new GetPayerForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPayerForAccountResponseBody setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public GetPayerForAccountResponseBody setPayerAccountName(String payerAccountName) {
        this.payerAccountName = payerAccountName;
        return this;
    }
    public String getPayerAccountName() {
        return this.payerAccountName;
    }

    public GetPayerForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
