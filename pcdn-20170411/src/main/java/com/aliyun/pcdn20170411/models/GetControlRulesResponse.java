// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetControlRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetControlRulesResponseBody body;

    public static GetControlRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetControlRulesResponse self = new GetControlRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetControlRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetControlRulesResponse setBody(GetControlRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetControlRulesResponseBody getBody() {
        return this.body;
    }

}
