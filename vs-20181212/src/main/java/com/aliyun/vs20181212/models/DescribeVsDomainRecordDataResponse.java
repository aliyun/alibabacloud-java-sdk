// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainRecordDataResponse setBody(DescribeVsDomainRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainRecordDataResponseBody getBody() {
        return this.body;
    }

}
