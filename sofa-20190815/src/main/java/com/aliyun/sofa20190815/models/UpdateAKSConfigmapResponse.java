// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSConfigmapResponseBody body;

    public static UpdateAKSConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSConfigmapResponse self = new UpdateAKSConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSConfigmapResponse setBody(UpdateAKSConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSConfigmapResponseBody getBody() {
        return this.body;
    }

}
