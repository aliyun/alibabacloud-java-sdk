// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskTemplateRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskTemplateRuleResponseBody body;

    public static DeleteClriskTemplateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskTemplateRuleResponse self = new DeleteClriskTemplateRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskTemplateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskTemplateRuleResponse setBody(DeleteClriskTemplateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskTemplateRuleResponseBody getBody() {
        return this.body;
    }

}
