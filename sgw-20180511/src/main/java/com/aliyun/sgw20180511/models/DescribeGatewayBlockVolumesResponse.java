// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayBlockVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayBlockVolumesResponseBody body;

    public static DescribeGatewayBlockVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayBlockVolumesResponse self = new DescribeGatewayBlockVolumesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayBlockVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayBlockVolumesResponse setBody(DescribeGatewayBlockVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayBlockVolumesResponseBody getBody() {
        return this.body;
    }

}
