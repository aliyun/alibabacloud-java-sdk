// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadUrlResponseBody body;

    public static GetUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadUrlResponse self = new GetUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadUrlResponse setBody(GetUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadUrlResponseBody getBody() {
        return this.body;
    }

}
