// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSitemapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSitemapResponseBody body;

    public static GetAppSitemapResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSitemapResponse self = new GetAppSitemapResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSitemapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSitemapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSitemapResponse setBody(GetAppSitemapResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSitemapResponseBody getBody() {
        return this.body;
    }

}
