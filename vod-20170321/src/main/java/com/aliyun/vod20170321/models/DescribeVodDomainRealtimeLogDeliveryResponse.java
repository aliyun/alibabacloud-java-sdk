// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodDomainRealtimeLogDeliveryResponseBody body;

    public static DescribeVodDomainRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealtimeLogDeliveryResponse self = new DescribeVodDomainRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse setBody(DescribeVodDomainRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
