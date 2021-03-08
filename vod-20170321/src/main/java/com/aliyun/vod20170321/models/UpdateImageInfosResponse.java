// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateImageInfosResponseBody body;

    public static UpdateImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosResponse self = new UpdateImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageInfosResponse setBody(UpdateImageInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageInfosResponseBody getBody() {
        return this.body;
    }

}
