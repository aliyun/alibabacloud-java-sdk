// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchColumnRowLevelControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchColumnRowLevelControlResponseBody body;

    public static SwitchColumnRowLevelControlResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchColumnRowLevelControlResponse self = new SwitchColumnRowLevelControlResponse();
        return TeaModel.build(map, self);
    }

    public SwitchColumnRowLevelControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchColumnRowLevelControlResponse setBody(SwitchColumnRowLevelControlResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchColumnRowLevelControlResponseBody getBody() {
        return this.body;
    }

}
