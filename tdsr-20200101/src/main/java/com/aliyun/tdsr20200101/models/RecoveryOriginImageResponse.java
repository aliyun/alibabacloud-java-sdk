// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RecoveryOriginImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecoveryOriginImageResponseBody body;

    public static RecoveryOriginImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryOriginImageResponse self = new RecoveryOriginImageResponse();
        return TeaModel.build(map, self);
    }

    public RecoveryOriginImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoveryOriginImageResponse setBody(RecoveryOriginImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryOriginImageResponseBody getBody() {
        return this.body;
    }

}
