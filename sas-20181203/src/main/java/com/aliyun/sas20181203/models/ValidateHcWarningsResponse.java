// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateHcWarningsResponseBody body;

    public static ValidateHcWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateHcWarningsResponse self = new ValidateHcWarningsResponse();
        return TeaModel.build(map, self);
    }

    public ValidateHcWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateHcWarningsResponse setBody(ValidateHcWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateHcWarningsResponseBody getBody() {
        return this.body;
    }

}
