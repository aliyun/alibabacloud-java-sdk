// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeInputSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeInputSchemaResponseBody body;

    public static GetNodeInputSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeInputSchemaResponse self = new GetNodeInputSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeInputSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeInputSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeInputSchemaResponse setBody(GetNodeInputSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeInputSchemaResponseBody getBody() {
        return this.body;
    }

}
