// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DescribeAppDomainDnsRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppDomainDnsRecordResponseBody body;

    public static DescribeAppDomainDnsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDomainDnsRecordResponse self = new DescribeAppDomainDnsRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppDomainDnsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppDomainDnsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppDomainDnsRecordResponse setBody(DescribeAppDomainDnsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppDomainDnsRecordResponseBody getBody() {
        return this.body;
    }

}
