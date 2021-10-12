// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBinaryLogListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBinaryLogListResponseBody body;

    public static DescribeBinaryLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinaryLogListResponse self = new DescribeBinaryLogListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBinaryLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBinaryLogListResponse setBody(DescribeBinaryLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBinaryLogListResponseBody getBody() {
        return this.body;
    }

}
