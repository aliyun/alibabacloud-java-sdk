// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFederationSpannerClusterResponseBody body;

    public static UpdateLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSpannerClusterResponse self = new UpdateLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFederationSpannerClusterResponse setBody(UpdateLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
