// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDialogueFlowsResponseBody body;

    public static ListDialogueFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueFlowsResponse self = new ListDialogueFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListDialogueFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDialogueFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDialogueFlowsResponse setBody(ListDialogueFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDialogueFlowsResponseBody getBody() {
        return this.body;
    }

}
