// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHaVipsResponseBody body;

    public static DescribeHaVipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponse self = new DescribeHaVipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHaVipsResponse setBody(DescribeHaVipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHaVipsResponseBody getBody() {
        return this.body;
    }

}
