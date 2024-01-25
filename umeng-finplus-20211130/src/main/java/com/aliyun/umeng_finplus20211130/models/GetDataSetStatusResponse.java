// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSetStatusResponseBody body;

    public static GetDataSetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSetStatusResponse self = new GetDataSetStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSetStatusResponse setBody(GetDataSetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSetStatusResponseBody getBody() {
        return this.body;
    }

}
