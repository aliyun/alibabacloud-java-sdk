// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCasLoadbalanceListenerResponseBody body;

    public static UpdateCasLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasLoadbalanceListenerResponse self = new UpdateCasLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasLoadbalanceListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasLoadbalanceListenerResponse setBody(UpdateCasLoadbalanceListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasLoadbalanceListenerResponseBody getBody() {
        return this.body;
    }

}
