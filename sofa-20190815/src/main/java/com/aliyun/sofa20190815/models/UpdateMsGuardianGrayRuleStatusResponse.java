// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsGuardianGrayRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsGuardianGrayRuleStatusResponseBody body;

    public static UpdateMsGuardianGrayRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsGuardianGrayRuleStatusResponse self = new UpdateMsGuardianGrayRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsGuardianGrayRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsGuardianGrayRuleStatusResponse setBody(UpdateMsGuardianGrayRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsGuardianGrayRuleStatusResponseBody getBody() {
        return this.body;
    }

}
