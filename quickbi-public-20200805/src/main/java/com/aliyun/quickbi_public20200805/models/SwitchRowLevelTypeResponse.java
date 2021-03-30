// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchRowLevelTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchRowLevelTypeResponseBody body;

    public static SwitchRowLevelTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchRowLevelTypeResponse self = new SwitchRowLevelTypeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchRowLevelTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchRowLevelTypeResponse setBody(SwitchRowLevelTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchRowLevelTypeResponseBody getBody() {
        return this.body;
    }

}
