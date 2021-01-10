// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCFederationConfigmapResponseBody body;

    public static GetLDCFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationConfigmapResponse self = new GetLDCFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCFederationConfigmapResponse setBody(GetLDCFederationConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCFederationConfigmapResponseBody getBody() {
        return this.body;
    }

}
