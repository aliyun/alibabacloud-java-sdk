// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCustomerFlowByLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomerFlowByLocationResponseBody body;

    public static DescribeCustomerFlowByLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerFlowByLocationResponse self = new DescribeCustomerFlowByLocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerFlowByLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerFlowByLocationResponse setBody(DescribeCustomerFlowByLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerFlowByLocationResponseBody getBody() {
        return this.body;
    }

}
