// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetExampleQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExampleQueryResponseBody body;

    public static GetExampleQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExampleQueryResponse self = new GetExampleQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetExampleQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExampleQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExampleQueryResponse setBody(GetExampleQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExampleQueryResponseBody getBody() {
        return this.body;
    }

}
