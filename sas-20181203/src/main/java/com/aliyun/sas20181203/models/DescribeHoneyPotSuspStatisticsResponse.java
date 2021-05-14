// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHoneyPotSuspStatisticsResponseBody body;

    public static DescribeHoneyPotSuspStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotSuspStatisticsResponse self = new DescribeHoneyPotSuspStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotSuspStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHoneyPotSuspStatisticsResponse setBody(DescribeHoneyPotSuspStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHoneyPotSuspStatisticsResponseBody getBody() {
        return this.body;
    }

}
