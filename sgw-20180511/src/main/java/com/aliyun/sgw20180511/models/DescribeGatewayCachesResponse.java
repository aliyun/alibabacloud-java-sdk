// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayCachesResponseBody body;

    public static DescribeGatewayCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCachesResponse self = new DescribeGatewayCachesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayCachesResponse setBody(DescribeGatewayCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayCachesResponseBody getBody() {
        return this.body;
    }

}
