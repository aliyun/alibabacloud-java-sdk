// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgAuthRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgAuthRulesResponseBody body;

    public static AddMsSgAuthRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgAuthRulesResponse self = new AddMsSgAuthRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgAuthRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgAuthRulesResponse setBody(AddMsSgAuthRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgAuthRulesResponseBody getBody() {
        return this.body;
    }

}
