// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainOnlineUserNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsDomainOnlineUserNumResponseBody body;

    public static DescribeVsDomainOnlineUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainOnlineUserNumResponse self = new DescribeVsDomainOnlineUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainOnlineUserNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainOnlineUserNumResponse setBody(DescribeVsDomainOnlineUserNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainOnlineUserNumResponseBody getBody() {
        return this.body;
    }

}
