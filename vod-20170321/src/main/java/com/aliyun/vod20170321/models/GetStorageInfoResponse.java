// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageInfoResponseBody body;

    public static GetStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageInfoResponse self = new GetStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageInfoResponse setBody(GetStorageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageInfoResponseBody getBody() {
        return this.body;
    }

}
