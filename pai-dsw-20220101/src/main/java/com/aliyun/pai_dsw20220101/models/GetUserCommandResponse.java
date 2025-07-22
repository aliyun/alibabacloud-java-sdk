// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserCommandResponseBody body;

    public static GetUserCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserCommandResponse self = new GetUserCommandResponse();
        return TeaModel.build(map, self);
    }

    public GetUserCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserCommandResponse setBody(GetUserCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserCommandResponseBody getBody() {
        return this.body;
    }

}
