// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcApiSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcApiSchema body;

    public static CreatePbcApiSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcApiSchemaResponse self = new CreatePbcApiSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcApiSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcApiSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcApiSchemaResponse setBody(PbcApiSchema body) {
        this.body = body;
        return this;
    }
    public PbcApiSchema getBody() {
        return this.body;
    }

}
