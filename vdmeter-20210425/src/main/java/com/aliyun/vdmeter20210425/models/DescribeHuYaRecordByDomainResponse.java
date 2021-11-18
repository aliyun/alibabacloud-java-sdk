// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaRecordByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeHuYaRecordByDomainResponse setBody(DescribeHuYaRecordByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHuYaRecordByDomainResponseBody getBody() {
        return this.body;
    }

}
