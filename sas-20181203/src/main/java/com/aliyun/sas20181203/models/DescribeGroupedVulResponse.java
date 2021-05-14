// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupedVulResponseBody body;

    public static DescribeGroupedVulResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponse self = new DescribeGroupedVulResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedVulResponse setBody(DescribeGroupedVulResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedVulResponseBody getBody() {
        return this.body;
    }

}
