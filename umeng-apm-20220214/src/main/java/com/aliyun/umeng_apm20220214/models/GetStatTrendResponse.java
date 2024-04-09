// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetStatTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStatTrendResponseBody body;

    public static GetStatTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatTrendResponse self = new GetStatTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetStatTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStatTrendResponse setBody(GetStatTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatTrendResponseBody getBody() {
        return this.body;
    }

}
