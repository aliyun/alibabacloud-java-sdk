// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsGuardianRulesResponseBody body;

    public static UpdateMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsGuardianRulesResponse self = new UpdateMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsGuardianRulesResponse setBody(UpdateMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
