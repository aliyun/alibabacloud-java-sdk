// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeactiveFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactiveFlowLogResponse setBody(DeactiveFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveFlowLogResponseBody getBody() {
        return this.body;
    }

}
