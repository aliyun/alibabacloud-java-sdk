// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowLogResponseBody body;

    public static CreateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponse self = new CreateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowLogResponse setBody(CreateFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowLogResponseBody getBody() {
        return this.body;
    }

}
