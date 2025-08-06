// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodRealtimeLogDeliveryResponseBody body;

    public static ListVodRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryResponse self = new ListVodRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodRealtimeLogDeliveryResponse setBody(ListVodRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
