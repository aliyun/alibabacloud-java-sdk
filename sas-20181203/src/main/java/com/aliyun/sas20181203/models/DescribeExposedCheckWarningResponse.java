// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedCheckWarningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposedCheckWarningResponseBody body;

    public static DescribeExposedCheckWarningResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedCheckWarningResponse self = new DescribeExposedCheckWarningResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedCheckWarningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedCheckWarningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExposedCheckWarningResponse setBody(DescribeExposedCheckWarningResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedCheckWarningResponseBody getBody() {
        return this.body;
    }

}
