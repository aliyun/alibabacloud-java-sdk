// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPageByCondAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageByCondAppInfoResponseBody body;

    public static GetPageByCondAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageByCondAppInfoResponse self = new GetPageByCondAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPageByCondAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageByCondAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageByCondAppInfoResponse setBody(GetPageByCondAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageByCondAppInfoResponseBody getBody() {
        return this.body;
    }

}
