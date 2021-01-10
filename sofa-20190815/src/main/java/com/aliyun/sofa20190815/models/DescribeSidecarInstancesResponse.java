// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeSidecarInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSidecarInstancesResponseBody body;

    public static DescribeSidecarInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSidecarInstancesResponse self = new DescribeSidecarInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSidecarInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSidecarInstancesResponse setBody(DescribeSidecarInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSidecarInstancesResponseBody getBody() {
        return this.body;
    }

}
