// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphSchemaDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGraphSchemaDetailResponseBody body;

    public static GetGraphSchemaDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaDetailResponse self = new GetGraphSchemaDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGraphSchemaDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGraphSchemaDetailResponse setBody(GetGraphSchemaDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGraphSchemaDetailResponseBody getBody() {
        return this.body;
    }

}
