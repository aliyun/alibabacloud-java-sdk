// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetTempDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTempDownloadUrlResponseBody body;

    public static GetTempDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTempDownloadUrlResponse self = new GetTempDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTempDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTempDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTempDownloadUrlResponse setBody(GetTempDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTempDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
