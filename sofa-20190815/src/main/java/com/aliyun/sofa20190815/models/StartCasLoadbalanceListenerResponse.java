// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartCasLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartCasLoadbalanceListenerResponseBody body;

    public static StartCasLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCasLoadbalanceListenerResponse self = new StartCasLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public StartCasLoadbalanceListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCasLoadbalanceListenerResponse setBody(StartCasLoadbalanceListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCasLoadbalanceListenerResponseBody getBody() {
        return this.body;
    }

}
