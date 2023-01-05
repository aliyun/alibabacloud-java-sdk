// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeNumberDistrictInfoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNumberDistrictInfoStatusResponseBody body;

    public static DescribeNumberDistrictInfoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberDistrictInfoStatusResponse self = new DescribeNumberDistrictInfoStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNumberDistrictInfoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNumberDistrictInfoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNumberDistrictInfoStatusResponse setBody(DescribeNumberDistrictInfoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNumberDistrictInfoStatusResponseBody getBody() {
        return this.body;
    }

}
