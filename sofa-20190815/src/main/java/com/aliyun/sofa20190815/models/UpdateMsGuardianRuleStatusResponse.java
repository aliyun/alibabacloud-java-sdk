// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsGuardianRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsGuardianRuleStatusResponseBody body;

    public static UpdateMsGuardianRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsGuardianRuleStatusResponse self = new UpdateMsGuardianRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsGuardianRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsGuardianRuleStatusResponse setBody(UpdateMsGuardianRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsGuardianRuleStatusResponseBody getBody() {
        return this.body;
    }

}
