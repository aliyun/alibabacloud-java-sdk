// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultToleranceRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultToleranceRulesResponseBody body;

    public static ListMsSgFaultToleranceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultToleranceRulesResponse self = new ListMsSgFaultToleranceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultToleranceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultToleranceRulesResponse setBody(ListMsSgFaultToleranceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultToleranceRulesResponseBody getBody() {
        return this.body;
    }

}
