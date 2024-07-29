// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLiveStreamStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppLiveStreamStatusResponseBody body;

    public static DescribeAppLiveStreamStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppLiveStreamStatusResponse self = new DescribeAppLiveStreamStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppLiveStreamStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppLiveStreamStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppLiveStreamStatusResponse setBody(DescribeAppLiveStreamStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppLiveStreamStatusResponseBody getBody() {
        return this.body;
    }

}
