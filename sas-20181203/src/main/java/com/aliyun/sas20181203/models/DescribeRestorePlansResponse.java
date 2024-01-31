// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestorePlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestorePlansResponseBody body;

    public static DescribeRestorePlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorePlansResponse self = new DescribeRestorePlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestorePlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestorePlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestorePlansResponse setBody(DescribeRestorePlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestorePlansResponseBody getBody() {
        return this.body;
    }

}
