// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScriptsByFlowResponseBody body;

    public static ListScriptsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsByFlowResponse self = new ListScriptsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptsByFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptsByFlowResponse setBody(ListScriptsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptsByFlowResponseBody getBody() {
        return this.body;
    }

}
