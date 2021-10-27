// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxDataNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolarxDataNodesResponseBody body;

    public static DescribePolarxDataNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxDataNodesResponse self = new DescribePolarxDataNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarxDataNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarxDataNodesResponse setBody(DescribePolarxDataNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarxDataNodesResponseBody getBody() {
        return this.body;
    }

}
