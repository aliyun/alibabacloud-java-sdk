// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteLDCFederationSpannerClusterResponseBody body;

    public static BatchDeleteLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLDCFederationSpannerClusterResponse self = new BatchDeleteLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteLDCFederationSpannerClusterResponse setBody(BatchDeleteLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
