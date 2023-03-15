// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcSchema body;

    public static UpdatePbcSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcSchemaResponse self = new UpdatePbcSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePbcSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePbcSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePbcSchemaResponse setBody(PbcSchema body) {
        this.body = body;
        return this;
    }
    public PbcSchema getBody() {
        return this.body;
    }

}
