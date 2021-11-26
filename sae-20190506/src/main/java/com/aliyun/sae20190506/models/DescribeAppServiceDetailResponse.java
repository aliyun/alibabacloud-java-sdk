// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppServiceDetailResponseBody body;

    public static DescribeAppServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceDetailResponse self = new DescribeAppServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppServiceDetailResponse setBody(DescribeAppServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppServiceDetailResponseBody getBody() {
        return this.body;
    }

}
