// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainRecordDataResponseBody body;

    public static DescribeVsDomainRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRecordDataResponse self = new DescribeVsDomainRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRecordDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainRecordDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainRecordDataResponse setBody(DescribeVsDomainRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainRecordDataResponseBody getBody() {
        return this.body;
    }

}
