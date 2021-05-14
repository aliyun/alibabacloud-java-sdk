// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposedInstanceListResponseBody body;

    public static DescribeExposedInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListResponse self = new DescribeExposedInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedInstanceListResponse setBody(DescribeExposedInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedInstanceListResponseBody getBody() {
        return this.body;
    }

}
