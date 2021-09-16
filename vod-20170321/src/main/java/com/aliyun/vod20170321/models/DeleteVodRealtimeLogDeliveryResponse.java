// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVodRealtimeLogDeliveryResponseBody body;

    public static DeleteVodRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealtimeLogDeliveryResponse self = new DeleteVodRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodRealtimeLogDeliveryResponse setBody(DeleteVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
