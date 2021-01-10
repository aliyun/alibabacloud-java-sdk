// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskTemplateRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveClriskTemplateRuleResponseBody body;

    public static SaveClriskTemplateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskTemplateRuleResponse self = new SaveClriskTemplateRuleResponse();
        return TeaModel.build(map, self);
    }

    public SaveClriskTemplateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveClriskTemplateRuleResponse setBody(SaveClriskTemplateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClriskTemplateRuleResponseBody getBody() {
        return this.body;
    }

}
