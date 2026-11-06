// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchModifyParameterLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSearchModifyParameterLogResponseBody body;

    public static DescribeSearchModifyParameterLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchModifyParameterLogResponse self = new DescribeSearchModifyParameterLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchModifyParameterLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchModifyParameterLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSearchModifyParameterLogResponse setBody(DescribeSearchModifyParameterLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchModifyParameterLogResponseBody getBody() {
        return this.body;
    }

}
