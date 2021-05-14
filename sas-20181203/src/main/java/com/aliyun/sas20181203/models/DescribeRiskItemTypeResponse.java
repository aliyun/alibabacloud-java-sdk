// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskItemTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskItemTypeResponseBody body;

    public static DescribeRiskItemTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskItemTypeResponse self = new DescribeRiskItemTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskItemTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskItemTypeResponse setBody(DescribeRiskItemTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskItemTypeResponseBody getBody() {
        return this.body;
    }

}
