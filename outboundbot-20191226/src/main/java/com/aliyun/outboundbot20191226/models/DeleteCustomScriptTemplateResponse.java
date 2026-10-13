// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteCustomScriptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomScriptTemplateResponseBody body;

    public static DeleteCustomScriptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomScriptTemplateResponse self = new DeleteCustomScriptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomScriptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomScriptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomScriptTemplateResponse setBody(DeleteCustomScriptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomScriptTemplateResponseBody getBody() {
        return this.body;
    }

}
