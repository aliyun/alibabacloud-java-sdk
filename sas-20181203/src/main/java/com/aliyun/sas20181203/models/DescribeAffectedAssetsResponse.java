// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAffectedAssetsResponseBody body;

    public static DescribeAffectedAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedAssetsResponse self = new DescribeAffectedAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAffectedAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAffectedAssetsResponse setBody(DescribeAffectedAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAffectedAssetsResponseBody getBody() {
        return this.body;
    }

}
