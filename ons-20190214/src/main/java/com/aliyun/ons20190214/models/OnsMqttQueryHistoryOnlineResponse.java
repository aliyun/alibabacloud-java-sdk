// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryHistoryOnlineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttQueryHistoryOnlineResponseBody body;

    public static OnsMqttQueryHistoryOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryHistoryOnlineResponse self = new OnsMqttQueryHistoryOnlineResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryHistoryOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttQueryHistoryOnlineResponse setBody(OnsMqttQueryHistoryOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttQueryHistoryOnlineResponseBody getBody() {
        return this.body;
    }

}
