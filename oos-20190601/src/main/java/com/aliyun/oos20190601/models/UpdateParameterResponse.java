// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateParameterResponseBody body;

    public static UpdateParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterResponse self = new UpdateParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParameterResponse setBody(UpdateParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParameterResponseBody getBody() {
        return this.body;
    }

}
