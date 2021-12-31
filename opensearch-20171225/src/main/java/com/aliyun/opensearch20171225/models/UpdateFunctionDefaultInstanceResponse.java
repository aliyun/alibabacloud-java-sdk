// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionDefaultInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFunctionDefaultInstanceResponseBody body;

    public static UpdateFunctionDefaultInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionDefaultInstanceResponse self = new UpdateFunctionDefaultInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionDefaultInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionDefaultInstanceResponse setBody(UpdateFunctionDefaultInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionDefaultInstanceResponseBody getBody() {
        return this.body;
    }

}
