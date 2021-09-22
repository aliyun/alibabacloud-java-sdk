// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdateRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRunResponseBody body;

    public static UpdateRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRunResponse self = new UpdateRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRunResponse setBody(UpdateRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRunResponseBody getBody() {
        return this.body;
    }

}
