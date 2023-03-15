// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcVersion body;

    public static GetPbcVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcVersionResponse self = new GetPbcVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcVersionResponse setBody(PbcVersion body) {
        this.body = body;
        return this;
    }
    public PbcVersion getBody() {
        return this.body;
    }

}
