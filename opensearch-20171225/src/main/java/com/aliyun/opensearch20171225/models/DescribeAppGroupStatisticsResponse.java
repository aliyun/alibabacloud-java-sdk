// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppGroupStatisticsResponseBody body;

    public static DescribeAppGroupStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupStatisticsResponse self = new DescribeAppGroupStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppGroupStatisticsResponse setBody(DescribeAppGroupStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppGroupStatisticsResponseBody getBody() {
        return this.body;
    }

}
