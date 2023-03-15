// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcVersion body;

    public static UpdatePbcVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcVersionResponse self = new UpdatePbcVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePbcVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePbcVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePbcVersionResponse setBody(PbcVersion body) {
        this.body = body;
        return this;
    }
    public PbcVersion getBody() {
        return this.body;
    }

}
