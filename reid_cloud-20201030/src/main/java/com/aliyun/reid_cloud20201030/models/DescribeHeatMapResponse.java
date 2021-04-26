// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeHeatMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHeatMapResponseBody body;

    public static DescribeHeatMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeatMapResponse self = new DescribeHeatMapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHeatMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHeatMapResponse setBody(DescribeHeatMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHeatMapResponseBody getBody() {
        return this.body;
    }

}
