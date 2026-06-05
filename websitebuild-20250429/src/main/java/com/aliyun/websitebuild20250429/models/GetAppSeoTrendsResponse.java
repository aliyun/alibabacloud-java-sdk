// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSeoTrendsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSeoTrendsResponseBody body;

    public static GetAppSeoTrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSeoTrendsResponse self = new GetAppSeoTrendsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSeoTrendsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSeoTrendsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSeoTrendsResponse setBody(GetAppSeoTrendsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSeoTrendsResponseBody getBody() {
        return this.body;
    }

}
