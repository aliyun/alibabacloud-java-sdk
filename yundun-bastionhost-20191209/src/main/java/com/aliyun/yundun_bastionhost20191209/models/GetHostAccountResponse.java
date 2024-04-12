// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHostAccountResponseBody body;

    public static GetHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostAccountResponse self = new GetHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHostAccountResponse setBody(GetHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostAccountResponseBody getBody() {
        return this.body;
    }

}
