// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaRecordByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHuYaRecordByDomainResponseBody body;

    public static DescribeHuYaRecordByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaRecordByDomainResponse self = new DescribeHuYaRecordByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaRecordByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHuYaRecordByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHuYaRecordByDomainResponse setBody(DescribeHuYaRecordByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHuYaRecordByDomainResponseBody getBody() {
        return this.body;
    }

}
