// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SetWorkflowTemplateEffectiveVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWorkflowTemplateEffectiveVersionResponseBody body;

    public static SetWorkflowTemplateEffectiveVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWorkflowTemplateEffectiveVersionResponse self = new SetWorkflowTemplateEffectiveVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetWorkflowTemplateEffectiveVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWorkflowTemplateEffectiveVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWorkflowTemplateEffectiveVersionResponse setBody(SetWorkflowTemplateEffectiveVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWorkflowTemplateEffectiveVersionResponseBody getBody() {
        return this.body;
    }

}
