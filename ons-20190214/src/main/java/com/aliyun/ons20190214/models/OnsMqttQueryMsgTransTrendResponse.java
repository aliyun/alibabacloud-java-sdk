// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryMsgTransTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttQueryMsgTransTrendResponseBody body;

    public static OnsMqttQueryMsgTransTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryMsgTransTrendResponse self = new OnsMqttQueryMsgTransTrendResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryMsgTransTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttQueryMsgTransTrendResponse setBody(OnsMqttQueryMsgTransTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttQueryMsgTransTrendResponseBody getBody() {
        return this.body;
    }

}
