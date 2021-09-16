// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisableVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableVodRealtimeLogDeliveryResponse setBody(DisableVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
