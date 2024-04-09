// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetH5PageTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetH5PageTrendResponseBody body;

    public static GetH5PageTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetH5PageTrendResponse self = new GetH5PageTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetH5PageTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetH5PageTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetH5PageTrendResponse setBody(GetH5PageTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetH5PageTrendResponseBody getBody() {
        return this.body;
    }

}
