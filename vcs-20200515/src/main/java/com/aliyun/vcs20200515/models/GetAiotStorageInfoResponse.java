// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetAiotStorageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiotStorageInfoResponseBody body;

    public static GetAiotStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiotStorageInfoResponse self = new GetAiotStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAiotStorageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiotStorageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiotStorageInfoResponse setBody(GetAiotStorageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiotStorageInfoResponseBody getBody() {
        return this.body;
    }

}
