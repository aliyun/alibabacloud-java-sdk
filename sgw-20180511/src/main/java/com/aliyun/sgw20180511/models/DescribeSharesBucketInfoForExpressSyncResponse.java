// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeSharesBucketInfoForExpressSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSharesBucketInfoForExpressSyncResponseBody body;

    public static DescribeSharesBucketInfoForExpressSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharesBucketInfoForExpressSyncResponse self = new DescribeSharesBucketInfoForExpressSyncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSharesBucketInfoForExpressSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSharesBucketInfoForExpressSyncResponse setBody(DescribeSharesBucketInfoForExpressSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSharesBucketInfoForExpressSyncResponseBody getBody() {
        return this.body;
    }

}
