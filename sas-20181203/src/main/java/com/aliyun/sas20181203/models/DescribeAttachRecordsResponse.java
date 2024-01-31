// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttachRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttachRecordsResponseBody body;

    public static DescribeAttachRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttachRecordsResponse self = new DescribeAttachRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttachRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttachRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttachRecordsResponse setBody(DescribeAttachRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttachRecordsResponseBody getBody() {
        return this.body;
    }

}
