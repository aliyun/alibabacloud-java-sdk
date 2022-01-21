// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class CheckReadyFlagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckReadyFlagResponseBody body;

    public static CheckReadyFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckReadyFlagResponse self = new CheckReadyFlagResponse();
        return TeaModel.build(map, self);
    }

    public CheckReadyFlagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckReadyFlagResponse setBody(CheckReadyFlagResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckReadyFlagResponseBody getBody() {
        return this.body;
    }

}
