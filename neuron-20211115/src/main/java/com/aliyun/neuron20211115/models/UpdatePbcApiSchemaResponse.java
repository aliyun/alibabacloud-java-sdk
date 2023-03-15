// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcApiSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcApiSchema body;

    public static UpdatePbcApiSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcApiSchemaResponse self = new UpdatePbcApiSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePbcApiSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePbcApiSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePbcApiSchemaResponse setBody(PbcApiSchema body) {
        this.body = body;
        return this;
    }
    public PbcApiSchema getBody() {
        return this.body;
    }

}
