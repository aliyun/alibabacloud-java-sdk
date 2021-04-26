// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeBaseStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBaseStatisticsResponseBody body;

    public static DescribeBaseStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseStatisticsResponse self = new DescribeBaseStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBaseStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBaseStatisticsResponse setBody(DescribeBaseStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBaseStatisticsResponseBody getBody() {
        return this.body;
    }

}
