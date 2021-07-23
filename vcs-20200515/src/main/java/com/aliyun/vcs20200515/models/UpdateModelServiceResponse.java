// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateModelServiceResponseBody body;

    public static UpdateModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceResponse self = new UpdateModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelServiceResponse setBody(UpdateModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelServiceResponseBody getBody() {
        return this.body;
    }

}
