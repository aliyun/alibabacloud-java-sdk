// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBgpPeersResponseBody body;

    public static DescribeBgpPeersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPeersResponse self = new DescribeBgpPeersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPeersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpPeersResponse setBody(DescribeBgpPeersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpPeersResponseBody getBody() {
        return this.body;
    }

}
