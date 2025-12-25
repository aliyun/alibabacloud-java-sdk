// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetLayoutDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLayoutDataResponseBody body;

    public static GetLayoutDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayoutDataResponse self = new GetLayoutDataResponse();
        return TeaModel.build(map, self);
    }

    public GetLayoutDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayoutDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLayoutDataResponse setBody(GetLayoutDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLayoutDataResponseBody getBody() {
        return this.body;
    }

}
