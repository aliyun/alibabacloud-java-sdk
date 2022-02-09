// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResourceUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceResourceUnitResponseBody body;

    public static DescribeInstanceResourceUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResourceUnitResponse self = new DescribeInstanceResourceUnitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResourceUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceResourceUnitResponse setBody(DescribeInstanceResourceUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceResourceUnitResponseBody getBody() {
        return this.body;
    }

}
