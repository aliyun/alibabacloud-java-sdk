// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDWSTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDWSTaskResponseBody body;

    public static DescribeDWSTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDWSTaskResponse self = new DescribeDWSTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDWSTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDWSTaskResponse setBody(DescribeDWSTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDWSTaskResponseBody getBody() {
        return this.body;
    }

}
