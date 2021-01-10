// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopTSTriggerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTSTriggerInstanceResponseBody body;

    public static StopTSTriggerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTSTriggerInstanceResponse self = new StopTSTriggerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopTSTriggerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTSTriggerInstanceResponse setBody(StopTSTriggerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTSTriggerInstanceResponseBody getBody() {
        return this.body;
    }

}
