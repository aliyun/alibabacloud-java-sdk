// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRouterRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsSgRouterRulesResponseBody body;

    public static GetMsSgRouterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRouterRulesResponse self = new GetMsSgRouterRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetMsSgRouterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsSgRouterRulesResponse setBody(GetMsSgRouterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsSgRouterRulesResponseBody getBody() {
        return this.body;
    }

}
