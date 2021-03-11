// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsStreamsNotifyUrlConfigResponse setBody(DescribeVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
