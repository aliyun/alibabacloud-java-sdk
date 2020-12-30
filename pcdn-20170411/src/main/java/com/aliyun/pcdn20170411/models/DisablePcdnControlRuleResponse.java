// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DisablePcdnControlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisablePcdnControlRuleResponseBody body;

    public static DisablePcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisablePcdnControlRuleResponse self = new DisablePcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisablePcdnControlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisablePcdnControlRuleResponse setBody(DisablePcdnControlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisablePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

}
