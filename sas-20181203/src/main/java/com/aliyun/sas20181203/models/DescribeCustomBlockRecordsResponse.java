// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomBlockRecordsResponseBody body;

    public static DescribeCustomBlockRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockRecordsResponse self = new DescribeCustomBlockRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomBlockRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomBlockRecordsResponse setBody(DescribeCustomBlockRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomBlockRecordsResponseBody getBody() {
        return this.body;
    }

}
