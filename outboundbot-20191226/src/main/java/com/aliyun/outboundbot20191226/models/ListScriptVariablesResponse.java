// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScriptVariablesResponseBody body;

    public static ListScriptVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptVariablesResponse self = new ListScriptVariablesResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptVariablesResponse setBody(ListScriptVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptVariablesResponseBody getBody() {
        return this.body;
    }

}
