// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSdkListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSdkListResponseBody body;

    public static GetSdkListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSdkListResponse self = new GetSdkListResponse();
        return TeaModel.build(map, self);
    }

    public GetSdkListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSdkListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSdkListResponse setBody(GetSdkListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSdkListResponseBody getBody() {
        return this.body;
    }

}
