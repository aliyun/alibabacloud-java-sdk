// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeLDCContainerServiceRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLDCContainerServiceRevisionResponseBody body;

    public static DescribeLDCContainerServiceRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDCContainerServiceRevisionResponse self = new DescribeLDCContainerServiceRevisionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLDCContainerServiceRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLDCContainerServiceRevisionResponse setBody(DescribeLDCContainerServiceRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLDCContainerServiceRevisionResponseBody getBody() {
        return this.body;
    }

}
