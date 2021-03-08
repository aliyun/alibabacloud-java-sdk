// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppInfoResponseBody body;

    public static UpdateAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoResponse self = new UpdateAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppInfoResponse setBody(UpdateAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppInfoResponseBody getBody() {
        return this.body;
    }

}
