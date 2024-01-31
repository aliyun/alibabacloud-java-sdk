// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetDetailByUuidsResponseBody body;

    public static DescribeAssetDetailByUuidsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsResponse self = new DescribeAssetDetailByUuidsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetDetailByUuidsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetDetailByUuidsResponse setBody(DescribeAssetDetailByUuidsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetDetailByUuidsResponseBody getBody() {
        return this.body;
    }

}
