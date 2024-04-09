// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNativePageTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNativePageTrendResponseBody body;

    public static GetNativePageTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNativePageTrendResponse self = new GetNativePageTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetNativePageTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNativePageTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNativePageTrendResponse setBody(GetNativePageTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNativePageTrendResponseBody getBody() {
        return this.body;
    }

}
