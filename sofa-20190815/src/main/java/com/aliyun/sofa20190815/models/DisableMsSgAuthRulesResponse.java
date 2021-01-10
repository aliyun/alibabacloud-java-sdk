// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgAuthRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsSgAuthRulesResponseBody body;

    public static DisableMsSgAuthRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgAuthRulesResponse self = new DisableMsSgAuthRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsSgAuthRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsSgAuthRulesResponse setBody(DisableMsSgAuthRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsSgAuthRulesResponseBody getBody() {
        return this.body;
    }

}
