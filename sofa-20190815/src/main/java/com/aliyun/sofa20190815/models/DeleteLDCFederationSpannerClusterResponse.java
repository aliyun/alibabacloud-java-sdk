// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCFederationSpannerClusterResponseBody body;

    public static DeleteLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationSpannerClusterResponse self = new DeleteLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCFederationSpannerClusterResponse setBody(DeleteLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
