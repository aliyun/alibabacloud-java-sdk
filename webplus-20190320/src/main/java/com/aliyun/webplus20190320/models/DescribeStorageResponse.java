// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageResponseBody body;

    public static DescribeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResponse self = new DescribeStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageResponse setBody(DescribeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageResponseBody getBody() {
        return this.body;
    }

}
