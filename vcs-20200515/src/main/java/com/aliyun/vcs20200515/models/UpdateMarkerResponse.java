// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMarkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMarkerResponseBody body;

    public static UpdateMarkerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMarkerResponse self = new UpdateMarkerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMarkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMarkerResponse setBody(UpdateMarkerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMarkerResponseBody getBody() {
        return this.body;
    }

}
