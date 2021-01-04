// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnicomSignConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnicomSignConfirmResponseBody body;

    public static UnicomSignConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        UnicomSignConfirmResponse self = new UnicomSignConfirmResponse();
        return TeaModel.build(map, self);
    }

    public UnicomSignConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnicomSignConfirmResponse setBody(UnicomSignConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public UnicomSignConfirmResponseBody getBody() {
        return this.body;
    }

}
