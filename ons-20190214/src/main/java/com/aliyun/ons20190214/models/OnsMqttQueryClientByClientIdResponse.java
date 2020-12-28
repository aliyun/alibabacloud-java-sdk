// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByClientIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttQueryClientByClientIdResponseBody body;

    public static OnsMqttQueryClientByClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByClientIdResponse self = new OnsMqttQueryClientByClientIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttQueryClientByClientIdResponse setBody(OnsMqttQueryClientByClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttQueryClientByClientIdResponseBody getBody() {
        return this.body;
    }

}
