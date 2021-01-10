// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecAKSPlanResponseBody body;

    public static ExecAKSPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSPlanResponse self = new ExecAKSPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecAKSPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecAKSPlanResponse setBody(ExecAKSPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecAKSPlanResponseBody getBody() {
        return this.body;
    }

}
