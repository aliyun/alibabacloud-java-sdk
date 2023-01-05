// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateDialogueFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDialogueFlowResponseBody body;

    public static CreateDialogueFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogueFlowResponse self = new CreateDialogueFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateDialogueFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDialogueFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDialogueFlowResponse setBody(CreateDialogueFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDialogueFlowResponseBody getBody() {
        return this.body;
    }

}
