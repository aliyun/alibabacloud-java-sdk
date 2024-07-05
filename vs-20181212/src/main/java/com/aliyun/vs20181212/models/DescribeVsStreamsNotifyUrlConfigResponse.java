// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsStreamsNotifyUrlConfigResponseBody body;

    public static DescribeVsStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsNotifyUrlConfigResponse self = new DescribeVsStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsStreamsNotifyUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsStreamsNotifyUrlConfigResponse setBody(DescribeVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
