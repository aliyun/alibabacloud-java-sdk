// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserOnlineClientStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserOnlineClientStatisticsResponseBody body;

    public static DescribeUserOnlineClientStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserOnlineClientStatisticsResponse self = new DescribeUserOnlineClientStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserOnlineClientStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserOnlineClientStatisticsResponse setBody(DescribeUserOnlineClientStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserOnlineClientStatisticsResponseBody getBody() {
        return this.body;
    }

}
