// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserVpcsResponseBody body;

    public static GetUserVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcsResponse self = new GetUserVpcsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserVpcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserVpcsResponse setBody(GetUserVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserVpcsResponseBody getBody() {
        return this.body;
    }

}
