// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUisesResponseBody body;

    public static DescribeUisesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisesResponse self = new DescribeUisesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUisesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUisesResponse setBody(DescribeUisesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUisesResponseBody getBody() {
        return this.body;
    }

}
