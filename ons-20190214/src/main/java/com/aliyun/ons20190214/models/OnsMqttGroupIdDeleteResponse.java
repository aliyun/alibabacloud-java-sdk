// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttGroupIdDeleteResponseBody body;

    public static OnsMqttGroupIdDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdDeleteResponse self = new OnsMqttGroupIdDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttGroupIdDeleteResponse setBody(OnsMqttGroupIdDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttGroupIdDeleteResponseBody getBody() {
        return this.body;
    }

}
