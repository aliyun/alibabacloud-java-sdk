// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuditPbcInvokeReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CatalogCommonResult result;

    public static AuditPbcInvokeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuditPbcInvokeReviewResponseBody self = new AuditPbcInvokeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public AuditPbcInvokeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuditPbcInvokeReviewResponseBody setResult(CatalogCommonResult result) {
        this.result = result;
        return this;
    }
    public CatalogCommonResult getResult() {
        return this.result;
    }

}
