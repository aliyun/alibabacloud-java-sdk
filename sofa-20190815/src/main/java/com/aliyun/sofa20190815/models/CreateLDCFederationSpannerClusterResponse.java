// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCFederationSpannerClusterResponseBody body;

    public static CreateLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationSpannerClusterResponse self = new CreateLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCFederationSpannerClusterResponse setBody(CreateLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
