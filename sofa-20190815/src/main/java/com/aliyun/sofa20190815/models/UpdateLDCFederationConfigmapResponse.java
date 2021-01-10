// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFederationConfigmapResponseBody body;

    public static UpdateLDCFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationConfigmapResponse self = new UpdateLDCFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFederationConfigmapResponse setBody(UpdateLDCFederationConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFederationConfigmapResponseBody getBody() {
        return this.body;
    }

}
