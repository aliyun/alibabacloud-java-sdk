// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceStoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceStoreInfoResponseBody body;

    public static GetInstanceStoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStoreInfoResponse self = new GetInstanceStoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStoreInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceStoreInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceStoreInfoResponse setBody(GetInstanceStoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceStoreInfoResponseBody getBody() {
        return this.body;
    }

}
