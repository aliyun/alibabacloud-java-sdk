// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceTempShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppInstanceTempShortUrlResponseBody body;

    public static GetAppInstanceTempShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceTempShortUrlResponse self = new GetAppInstanceTempShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceTempShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceTempShortUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceTempShortUrlResponse setBody(GetAppInstanceTempShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceTempShortUrlResponseBody getBody() {
        return this.body;
    }

}
