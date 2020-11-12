// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ValidateSqlScriptRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateSqlScriptBody body;

    public static ValidateSqlScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlScriptRequest self = new ValidateSqlScriptRequest();
        return TeaModel.build(map, self);
    }

    public ValidateSqlScriptRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateSqlScriptRequest setBody(ValidateSqlScriptBody body) {
        this.body = body;
        return this;
    }
    public ValidateSqlScriptBody getBody() {
        return this.body;
    }

}
