// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserFlowStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserFlowStatisticsResponseBody body;

    public static DescribeUserFlowStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowStatisticsResponse self = new DescribeUserFlowStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserFlowStatisticsResponse setBody(DescribeUserFlowStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserFlowStatisticsResponseBody getBody() {
        return this.body;
    }

}
