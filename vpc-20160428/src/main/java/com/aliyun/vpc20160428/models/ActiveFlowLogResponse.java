// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveFlowLogResponseBody body;

    public static ActiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponse self = new ActiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public ActiveFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveFlowLogResponse setBody(ActiveFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveFlowLogResponseBody getBody() {
        return this.body;
    }

}
