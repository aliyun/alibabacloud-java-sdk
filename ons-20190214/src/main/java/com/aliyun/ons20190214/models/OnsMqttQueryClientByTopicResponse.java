// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttQueryClientByTopicResponseBody body;

    public static OnsMqttQueryClientByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByTopicResponse self = new OnsMqttQueryClientByTopicResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttQueryClientByTopicResponse setBody(OnsMqttQueryClientByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttQueryClientByTopicResponseBody getBody() {
        return this.body;
    }

}
