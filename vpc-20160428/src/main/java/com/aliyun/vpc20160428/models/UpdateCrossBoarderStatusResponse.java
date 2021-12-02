// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateCrossBoarderStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCrossBoarderStatusResponseBody body;

    public static UpdateCrossBoarderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBoarderStatusResponse self = new UpdateCrossBoarderStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBoarderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrossBoarderStatusResponse setBody(UpdateCrossBoarderStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrossBoarderStatusResponseBody getBody() {
        return this.body;
    }

}
