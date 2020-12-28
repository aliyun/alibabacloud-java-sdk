// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttQueryClientByGroupIdResponseBody body;

    public static OnsMqttQueryClientByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByGroupIdResponse self = new OnsMqttQueryClientByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttQueryClientByGroupIdResponse setBody(OnsMqttQueryClientByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttQueryClientByGroupIdResponseBody getBody() {
        return this.body;
    }

}
