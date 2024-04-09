// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetLaunchTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLaunchTrendResponseBody body;

    public static GetLaunchTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLaunchTrendResponse self = new GetLaunchTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetLaunchTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLaunchTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLaunchTrendResponse setBody(GetLaunchTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLaunchTrendResponseBody getBody() {
        return this.body;
    }

}
