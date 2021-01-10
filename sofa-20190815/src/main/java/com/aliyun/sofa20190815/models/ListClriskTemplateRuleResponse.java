// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskTemplateRuleResponseBody body;

    public static ListClriskTemplateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateRuleResponse self = new ListClriskTemplateRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskTemplateRuleResponse setBody(ListClriskTemplateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskTemplateRuleResponseBody getBody() {
        return this.body;
    }

}
