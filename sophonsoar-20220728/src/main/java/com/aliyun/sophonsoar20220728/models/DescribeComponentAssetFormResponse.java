// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetFormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComponentAssetFormResponseBody body;

    public static DescribeComponentAssetFormResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetFormResponse self = new DescribeComponentAssetFormResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentAssetFormResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentAssetFormResponse setBody(DescribeComponentAssetFormResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentAssetFormResponseBody getBody() {
        return this.body;
    }

}
