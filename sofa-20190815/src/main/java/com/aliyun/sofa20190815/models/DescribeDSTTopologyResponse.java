// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTTopologyResponseBody body;

    public static DescribeDSTTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTopologyResponse self = new DescribeDSTTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTTopologyResponse setBody(DescribeDSTTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTTopologyResponseBody getBody() {
        return this.body;
    }

}
