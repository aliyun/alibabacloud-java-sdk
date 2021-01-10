// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class AddHighPriorityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddHighPriorityIpResponseBody body;

    public static AddHighPriorityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHighPriorityIpResponse self = new AddHighPriorityIpResponse();
        return TeaModel.build(map, self);
    }

    public AddHighPriorityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHighPriorityIpResponse setBody(AddHighPriorityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHighPriorityIpResponseBody getBody() {
        return this.body;
    }

}
