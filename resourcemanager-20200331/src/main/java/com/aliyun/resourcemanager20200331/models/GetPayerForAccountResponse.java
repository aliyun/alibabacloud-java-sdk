// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPayerForAccountResponse extends TeaModel {
    @NameInMap("PayerAccountName")
    @Validation(required = true)
    public String payerAccountName;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PayerAccountId")
    @Validation(required = true)
    public String payerAccountId;

    public static GetPayerForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPayerForAccountResponse self = new GetPayerForAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetPayerForAccountResponse setPayerAccountName(String payerAccountName) {
        this.payerAccountName = payerAccountName;
        return this;
    }
    public String getPayerAccountName() {
        return this.payerAccountName;
    }

    public GetPayerForAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPayerForAccountResponse setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

}
