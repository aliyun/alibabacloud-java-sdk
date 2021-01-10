// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultInjectRulesResponseBody body;

    public static ListMsSgFaultInjectRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectRulesResponse self = new ListMsSgFaultInjectRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultInjectRulesResponse setBody(ListMsSgFaultInjectRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultInjectRulesResponseBody getBody() {
        return this.body;
    }

}
