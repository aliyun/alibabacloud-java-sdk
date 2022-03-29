// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceAccessDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceAccessDetailResponseBody body;

    public static DescribeServiceAccessDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAccessDetailResponse self = new DescribeServiceAccessDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAccessDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceAccessDetailResponse setBody(DescribeServiceAccessDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceAccessDetailResponseBody getBody() {
        return this.body;
    }

}
