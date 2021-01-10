// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportMsGuardianRulesResponseBody body;

    public static ExportMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMsGuardianRulesResponse self = new ExportMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public ExportMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMsGuardianRulesResponse setBody(ExportMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
