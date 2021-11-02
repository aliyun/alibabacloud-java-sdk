// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListRuleAreaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRuleAreaResponseBody body;

    public static ListRuleAreaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleAreaResponse self = new ListRuleAreaResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleAreaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleAreaResponse setBody(ListRuleAreaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleAreaResponseBody getBody() {
        return this.body;
    }

}
