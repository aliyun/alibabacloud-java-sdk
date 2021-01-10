// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCContainerServiceRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCContainerServiceRevisionResponseBody body;

    public static GetLDCContainerServiceRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCContainerServiceRevisionResponse self = new GetLDCContainerServiceRevisionResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCContainerServiceRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCContainerServiceRevisionResponse setBody(GetLDCContainerServiceRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCContainerServiceRevisionResponseBody getBody() {
        return this.body;
    }

}
