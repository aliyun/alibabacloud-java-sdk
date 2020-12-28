// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttGroupIdCreateResponseBody body;

    public static OnsMqttGroupIdCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdCreateResponse self = new OnsMqttGroupIdCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttGroupIdCreateResponse setBody(OnsMqttGroupIdCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttGroupIdCreateResponseBody getBody() {
        return this.body;
    }

}
