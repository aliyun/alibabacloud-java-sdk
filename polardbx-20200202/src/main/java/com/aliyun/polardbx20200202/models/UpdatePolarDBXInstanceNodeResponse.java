// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdatePolarDBXInstanceNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolarDBXInstanceNodeResponse setBody(UpdatePolarDBXInstanceNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarDBXInstanceNodeResponseBody getBody() {
        return this.body;
    }

}
