// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStorageUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsStorageUsageDataResponseBody body;

    public static DescribeVsStorageUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStorageUsageDataResponse self = new DescribeVsStorageUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsStorageUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsStorageUsageDataResponse setBody(DescribeVsStorageUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStorageUsageDataResponseBody getBody() {
        return this.body;
    }

}
