// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyLinkedClientListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridProxyLinkedClientListResponseBody body;

    public static DescribeHybridProxyLinkedClientListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyLinkedClientListResponse self = new DescribeHybridProxyLinkedClientListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyLinkedClientListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridProxyLinkedClientListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridProxyLinkedClientListResponse setBody(DescribeHybridProxyLinkedClientListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridProxyLinkedClientListResponseBody getBody() {
        return this.body;
    }

}
