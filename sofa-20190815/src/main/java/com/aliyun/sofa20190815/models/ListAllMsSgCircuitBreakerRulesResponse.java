// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAllMsSgCircuitBreakerRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllMsSgCircuitBreakerRulesResponseBody body;

    public static ListAllMsSgCircuitBreakerRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllMsSgCircuitBreakerRulesResponse self = new ListAllMsSgCircuitBreakerRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAllMsSgCircuitBreakerRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllMsSgCircuitBreakerRulesResponse setBody(ListAllMsSgCircuitBreakerRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllMsSgCircuitBreakerRulesResponseBody getBody() {
        return this.body;
    }

}
