// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListScriptsResponseBody body;

    public static ListScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsResponse self = new ListScriptsResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptsResponse setBody(ListScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptsResponseBody getBody() {
        return this.body;
    }

}
