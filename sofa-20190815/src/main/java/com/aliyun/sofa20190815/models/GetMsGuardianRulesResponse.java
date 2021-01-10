// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsGuardianRulesResponseBody body;

    public static GetMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsGuardianRulesResponse self = new GetMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsGuardianRulesResponse setBody(GetMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
