// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcApiSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcApiSchema body;

    public static GetPbcApiSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcApiSchemaResponse self = new GetPbcApiSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcApiSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcApiSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcApiSchemaResponse setBody(PbcApiSchema body) {
        this.body = body;
        return this;
    }
    public PbcApiSchema getBody() {
        return this.body;
    }

}
