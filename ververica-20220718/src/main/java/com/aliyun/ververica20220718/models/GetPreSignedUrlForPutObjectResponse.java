// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlForPutObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPreSignedUrlForPutObjectResponseBody body;

    public static GetPreSignedUrlForPutObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlForPutObjectResponse self = new GetPreSignedUrlForPutObjectResponse();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlForPutObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPreSignedUrlForPutObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPreSignedUrlForPutObjectResponse setBody(GetPreSignedUrlForPutObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPreSignedUrlForPutObjectResponseBody getBody() {
        return this.body;
    }

}
