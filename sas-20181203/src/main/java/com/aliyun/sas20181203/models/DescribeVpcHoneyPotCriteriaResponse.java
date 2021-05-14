// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcHoneyPotCriteriaResponseBody body;

    public static DescribeVpcHoneyPotCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotCriteriaResponse self = new DescribeVpcHoneyPotCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcHoneyPotCriteriaResponse setBody(DescribeVpcHoneyPotCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcHoneyPotCriteriaResponseBody getBody() {
        return this.body;
    }

}
