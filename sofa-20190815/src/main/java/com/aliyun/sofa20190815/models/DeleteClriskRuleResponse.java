// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskRuleResponseBody body;

    public static DeleteClriskRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskRuleResponse self = new DeleteClriskRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskRuleResponse setBody(DeleteClriskRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskRuleResponseBody getBody() {
        return this.body;
    }

}
