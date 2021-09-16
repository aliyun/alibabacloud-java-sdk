// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListVodRealtimeLogDeliveryDomainsResponse setBody(ListVodRealtimeLogDeliveryDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

}
