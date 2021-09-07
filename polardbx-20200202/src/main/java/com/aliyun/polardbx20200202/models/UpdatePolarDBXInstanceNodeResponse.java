// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePolarDBXInstanceNodeResponseBody body;

    public static UpdatePolarDBXInstanceNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarDBXInstanceNodeResponse self = new UpdatePolarDBXInstanceNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolarDBXInstanceNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolarDBXInstanceNodeResponse setBody(UpdatePolarDBXInstanceNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarDBXInstanceNodeResponseBody getBody() {
        return this.body;
    }

}
