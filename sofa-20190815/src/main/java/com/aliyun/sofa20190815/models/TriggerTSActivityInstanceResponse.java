// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class TriggerTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerTSActivityInstanceResponseBody body;

    public static TriggerTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerTSActivityInstanceResponse self = new TriggerTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TriggerTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerTSActivityInstanceResponse setBody(TriggerTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
