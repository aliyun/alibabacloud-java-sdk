// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKmsAssociateResourcesResponseBody body;

    public static DescribeKmsAssociateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsAssociateResourcesResponse self = new DescribeKmsAssociateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKmsAssociateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKmsAssociateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKmsAssociateResourcesResponse setBody(DescribeKmsAssociateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKmsAssociateResourcesResponseBody getBody() {
        return this.body;
    }

}
