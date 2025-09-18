// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommandResponseBody body;

    public static ListCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommandResponse self = new ListCommandResponse();
        return TeaModel.build(map, self);
    }

    public ListCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommandResponse setBody(ListCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommandResponseBody getBody() {
        return this.body;
    }

}
