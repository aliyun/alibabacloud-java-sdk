// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCFederationSpannerClusterResponseBody body;

    public static GetLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationSpannerClusterResponse self = new GetLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCFederationSpannerClusterResponse setBody(GetLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
