// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRuleResponseBody body;

    public static ListRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleResponse self = new ListRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleResponse setBody(ListRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleResponseBody getBody() {
        return this.body;
    }

}
