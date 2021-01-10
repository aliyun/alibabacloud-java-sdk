// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopCasLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopCasLoadbalanceListenerResponseBody body;

    public static StopCasLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCasLoadbalanceListenerResponse self = new StopCasLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public StopCasLoadbalanceListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCasLoadbalanceListenerResponse setBody(StopCasLoadbalanceListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCasLoadbalanceListenerResponseBody getBody() {
        return this.body;
    }

}
