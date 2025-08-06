// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVodRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodRealtimeLogDeliveryResponse setBody(DeleteVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
