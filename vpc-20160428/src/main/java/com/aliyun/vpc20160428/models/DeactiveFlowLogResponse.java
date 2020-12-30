// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeactiveFlowLogResponseBody body;

    public static DeactiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveFlowLogResponse self = new DeactiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactiveFlowLogResponse setBody(DeactiveFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveFlowLogResponseBody getBody() {
        return this.body;
    }

}
