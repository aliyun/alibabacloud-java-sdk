// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCFederationConfigmapResponseBody body;

    public static DeleteLDCFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationConfigmapResponse self = new DeleteLDCFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCFederationConfigmapResponse setBody(DeleteLDCFederationConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCFederationConfigmapResponseBody getBody() {
        return this.body;
    }

}
