// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EnableVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableVodRealtimeLogDeliveryResponseBody body;

    public static EnableVodRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVodRealtimeLogDeliveryResponse self = new EnableVodRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public EnableVodRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVodRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableVodRealtimeLogDeliveryResponse setBody(EnableVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
