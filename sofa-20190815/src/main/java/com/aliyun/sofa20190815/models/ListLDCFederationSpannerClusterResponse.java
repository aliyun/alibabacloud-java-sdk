// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCFederationSpannerClusterResponseBody body;

    public static ListLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationSpannerClusterResponse self = new ListLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCFederationSpannerClusterResponse setBody(ListLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
