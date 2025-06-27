// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceOwnerUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceOwnerUidResponseBody body;

    public static DescribeDefenseResourceOwnerUidResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceOwnerUidResponse self = new DescribeDefenseResourceOwnerUidResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceOwnerUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceOwnerUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceOwnerUidResponse setBody(DescribeDefenseResourceOwnerUidResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceOwnerUidResponseBody getBody() {
        return this.body;
    }

}
