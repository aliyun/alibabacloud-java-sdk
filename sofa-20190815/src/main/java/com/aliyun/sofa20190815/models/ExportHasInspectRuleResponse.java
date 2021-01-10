// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportHasInspectRuleResponseBody body;

    public static ExportHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportHasInspectRuleResponse self = new ExportHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public ExportHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportHasInspectRuleResponse setBody(ExportHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
