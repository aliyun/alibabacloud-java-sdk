// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateSolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSolutionResponseBody body;

    public static UpdateSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionResponse self = new UpdateSolutionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSolutionResponse setBody(UpdateSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSolutionResponseBody getBody() {
        return this.body;
    }

}
