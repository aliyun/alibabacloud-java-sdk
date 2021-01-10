// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeTSTopologyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTSTopologyVersionResponseBody body;

    public static DescribeTSTopologyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTSTopologyVersionResponse self = new DescribeTSTopologyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTSTopologyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTSTopologyVersionResponse setBody(DescribeTSTopologyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTSTopologyVersionResponseBody getBody() {
        return this.body;
    }

}
