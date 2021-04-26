// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeOverviewDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOverviewDataResponseBody body;

    public static DescribeOverviewDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOverviewDataResponse self = new DescribeOverviewDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOverviewDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOverviewDataResponse setBody(DescribeOverviewDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOverviewDataResponseBody getBody() {
        return this.body;
    }

}
