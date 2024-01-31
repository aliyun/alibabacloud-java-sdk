// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHADiagnoseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHADiagnoseConfigResponseBody body;

    public static DescribeHADiagnoseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHADiagnoseConfigResponse self = new DescribeHADiagnoseConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHADiagnoseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHADiagnoseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHADiagnoseConfigResponse setBody(DescribeHADiagnoseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHADiagnoseConfigResponseBody getBody() {
        return this.body;
    }

}
