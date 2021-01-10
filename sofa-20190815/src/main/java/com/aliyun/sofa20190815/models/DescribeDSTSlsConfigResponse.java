// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTSlsConfigResponseBody body;

    public static DescribeDSTSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTSlsConfigResponse self = new DescribeDSTSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTSlsConfigResponse setBody(DescribeDSTSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTSlsConfigResponseBody getBody() {
        return this.body;
    }

}
