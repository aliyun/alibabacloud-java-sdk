// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAppVulScanCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppVulScanCycleResponseBody body;

    public static DescribeAppVulScanCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppVulScanCycleResponse self = new DescribeAppVulScanCycleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppVulScanCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppVulScanCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppVulScanCycleResponse setBody(DescribeAppVulScanCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppVulScanCycleResponseBody getBody() {
        return this.body;
    }

}
