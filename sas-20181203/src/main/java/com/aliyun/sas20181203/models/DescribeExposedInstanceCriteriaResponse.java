// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposedInstanceCriteriaResponseBody body;

    public static DescribeExposedInstanceCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceCriteriaResponse self = new DescribeExposedInstanceCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedInstanceCriteriaResponse setBody(DescribeExposedInstanceCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedInstanceCriteriaResponseBody getBody() {
        return this.body;
    }

}
