// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRealtimeLogAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodRealtimeLogAuthorizedResponseBody body;

    public static DescribeVodRealtimeLogAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRealtimeLogAuthorizedResponse self = new DescribeVodRealtimeLogAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodRealtimeLogAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodRealtimeLogAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodRealtimeLogAuthorizedResponse setBody(DescribeVodRealtimeLogAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodRealtimeLogAuthorizedResponseBody getBody() {
        return this.body;
    }

}
