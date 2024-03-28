// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebTerminalResponseBody body;

    public static GetWebTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalResponse self = new GetWebTerminalResponse();
        return TeaModel.build(map, self);
    }

    public GetWebTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebTerminalResponse setBody(GetWebTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebTerminalResponseBody getBody() {
        return this.body;
    }

}
