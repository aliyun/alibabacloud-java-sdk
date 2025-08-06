// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisableVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableVodRealtimeLogDeliveryResponseBody body;

    public static DisableVodRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVodRealtimeLogDeliveryResponse self = new DisableVodRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableVodRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVodRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableVodRealtimeLogDeliveryResponse setBody(DisableVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
