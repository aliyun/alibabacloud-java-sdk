// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSpannerClusterStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFederationSpannerClusterStatusResponseBody body;

    public static UpdateLDCFederationSpannerClusterStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSpannerClusterStatusResponse self = new UpdateLDCFederationSpannerClusterStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSpannerClusterStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFederationSpannerClusterStatusResponse setBody(UpdateLDCFederationSpannerClusterStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFederationSpannerClusterStatusResponseBody getBody() {
        return this.body;
    }

}
