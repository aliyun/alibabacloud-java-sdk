// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVodDomainRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse setBody(DescribeVodDomainRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
