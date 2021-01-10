// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportMsGuardianRulesResponseBody body;

    public static ImportMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportMsGuardianRulesResponse self = new ImportMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public ImportMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportMsGuardianRulesResponse setBody(ImportMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
