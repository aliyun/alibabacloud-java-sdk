// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetConsumeProcessorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConsumeProcessor body;

    public static GetConsumeProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumeProcessorResponse self = new GetConsumeProcessorResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumeProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumeProcessorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumeProcessorResponse setBody(ConsumeProcessor body) {
        this.body = body;
        return this;
    }
    public ConsumeProcessor getBody() {
        return this.body;
    }

}
