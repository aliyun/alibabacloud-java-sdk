// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardSharedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTensorboardSharedUrlResponseBody body;

    public static GetTensorboardSharedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardSharedUrlResponse self = new GetTensorboardSharedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTensorboardSharedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTensorboardSharedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTensorboardSharedUrlResponse setBody(GetTensorboardSharedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTensorboardSharedUrlResponseBody getBody() {
        return this.body;
    }

}
