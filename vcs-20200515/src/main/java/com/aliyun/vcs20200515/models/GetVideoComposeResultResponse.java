// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetVideoComposeResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoComposeResultResponseBody body;

    public static GetVideoComposeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoComposeResultResponse self = new GetVideoComposeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoComposeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoComposeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoComposeResultResponse setBody(GetVideoComposeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoComposeResultResponseBody getBody() {
        return this.body;
    }

}
