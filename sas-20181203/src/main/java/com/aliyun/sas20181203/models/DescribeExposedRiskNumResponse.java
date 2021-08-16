// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedRiskNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposedRiskNumResponseBody body;

    public static DescribeExposedRiskNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedRiskNumResponse self = new DescribeExposedRiskNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedRiskNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedRiskNumResponse setBody(DescribeExposedRiskNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedRiskNumResponseBody getBody() {
        return this.body;
    }

}
