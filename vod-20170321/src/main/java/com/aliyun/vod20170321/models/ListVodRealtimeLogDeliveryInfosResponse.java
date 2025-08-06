// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodRealtimeLogDeliveryInfosResponseBody body;

    public static ListVodRealtimeLogDeliveryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryInfosResponse self = new ListVodRealtimeLogDeliveryInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodRealtimeLogDeliveryInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodRealtimeLogDeliveryInfosResponse setBody(ListVodRealtimeLogDeliveryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

}
