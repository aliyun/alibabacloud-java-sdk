// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteDialogueFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDialogueFlowResponseBody body;

    public static DeleteDialogueFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDialogueFlowResponse self = new DeleteDialogueFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDialogueFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDialogueFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDialogueFlowResponse setBody(DeleteDialogueFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDialogueFlowResponseBody getBody() {
        return this.body;
    }

}
