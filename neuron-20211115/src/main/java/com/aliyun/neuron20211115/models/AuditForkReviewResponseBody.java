// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuditForkReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static AuditForkReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuditForkReviewResponseBody self = new AuditForkReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public AuditForkReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuditForkReviewResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
