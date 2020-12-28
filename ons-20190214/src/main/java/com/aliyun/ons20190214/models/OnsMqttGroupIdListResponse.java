// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMqttGroupIdListResponseBody body;

    public static OnsMqttGroupIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdListResponse self = new OnsMqttGroupIdListResponse();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMqttGroupIdListResponse setBody(OnsMqttGroupIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMqttGroupIdListResponseBody getBody() {
        return this.body;
    }

}
