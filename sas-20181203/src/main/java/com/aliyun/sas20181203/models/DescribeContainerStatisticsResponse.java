// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerStatisticsResponseBody body;

    public static DescribeContainerStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerStatisticsResponse self = new DescribeContainerStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerStatisticsResponse setBody(DescribeContainerStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerStatisticsResponseBody getBody() {
        return this.body;
    }

}
