// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyDialogueFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDialogueFlowResponseBody body;

    public static ModifyDialogueFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDialogueFlowResponse self = new ModifyDialogueFlowResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDialogueFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDialogueFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDialogueFlowResponse setBody(ModifyDialogueFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDialogueFlowResponseBody getBody() {
        return this.body;
    }

}
