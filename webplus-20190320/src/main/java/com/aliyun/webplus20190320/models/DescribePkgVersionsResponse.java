// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribePkgVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePkgVersionsResponseBody body;

    public static DescribePkgVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePkgVersionsResponse self = new DescribePkgVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePkgVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePkgVersionsResponse setBody(DescribePkgVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePkgVersionsResponseBody getBody() {
        return this.body;
    }

}
