// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsGuardianGrayRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsGuardianGrayRulesResponseBody body;

    public static AddMsGuardianGrayRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsGuardianGrayRulesResponse self = new AddMsGuardianGrayRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsGuardianGrayRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsGuardianGrayRulesResponse setBody(AddMsGuardianGrayRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsGuardianGrayRulesResponseBody getBody() {
        return this.body;
    }

}
