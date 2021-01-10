// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasLoadbalanceListenerResponseBody body;

    public static CreateCasLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceListenerResponse self = new CreateCasLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasLoadbalanceListenerResponse setBody(CreateCasLoadbalanceListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasLoadbalanceListenerResponseBody getBody() {
        return this.body;
    }

}
