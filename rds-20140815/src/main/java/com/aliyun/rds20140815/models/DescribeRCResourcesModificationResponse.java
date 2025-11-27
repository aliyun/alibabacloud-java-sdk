// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCResourcesModificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCResourcesModificationResponseBody body;

    public static DescribeRCResourcesModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCResourcesModificationResponse self = new DescribeRCResourcesModificationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCResourcesModificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCResourcesModificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCResourcesModificationResponse setBody(DescribeRCResourcesModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCResourcesModificationResponseBody getBody() {
        return this.body;
    }

}
