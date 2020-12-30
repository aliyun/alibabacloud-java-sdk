// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DeletePcdnControlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePcdnControlRuleResponseBody body;

    public static DeletePcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePcdnControlRuleResponse self = new DeletePcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePcdnControlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePcdnControlRuleResponse setBody(DeletePcdnControlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

}
