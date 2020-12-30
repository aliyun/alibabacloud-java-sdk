// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class EditPcdnControlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditPcdnControlRuleResponseBody body;

    public static EditPcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditPcdnControlRuleResponse self = new EditPcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditPcdnControlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditPcdnControlRuleResponse setBody(EditPcdnControlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditPcdnControlRuleResponseBody getBody() {
        return this.body;
    }

}
