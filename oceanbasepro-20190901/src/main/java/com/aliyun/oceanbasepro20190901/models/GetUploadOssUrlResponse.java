// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetUploadOssUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadOssUrlResponseBody body;

    public static GetUploadOssUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadOssUrlResponse self = new GetUploadOssUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadOssUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadOssUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadOssUrlResponse setBody(GetUploadOssUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadOssUrlResponseBody getBody() {
        return this.body;
    }

}
