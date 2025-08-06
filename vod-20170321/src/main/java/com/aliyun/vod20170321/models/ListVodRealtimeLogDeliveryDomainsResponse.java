// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodRealtimeLogDeliveryDomainsResponseBody body;

    public static ListVodRealtimeLogDeliveryDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryDomainsResponse self = new ListVodRealtimeLogDeliveryDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodRealtimeLogDeliveryDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodRealtimeLogDeliveryDomainsResponse setBody(ListVodRealtimeLogDeliveryDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

}
