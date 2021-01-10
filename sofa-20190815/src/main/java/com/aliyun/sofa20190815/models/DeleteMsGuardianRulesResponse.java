// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsGuardianRulesResponseBody body;

    public static DeleteMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsGuardianRulesResponse self = new DeleteMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsGuardianRulesResponse setBody(DeleteMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
