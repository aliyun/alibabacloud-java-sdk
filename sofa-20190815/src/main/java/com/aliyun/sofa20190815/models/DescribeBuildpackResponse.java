// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBuildpackResponseBody body;

    public static DescribeBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackResponse self = new DescribeBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBuildpackResponse setBody(DescribeBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBuildpackResponseBody getBody() {
        return this.body;
    }

}
