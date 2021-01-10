// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCFederationConfigmapResponseBody body;

    public static ListLDCFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationConfigmapResponse self = new ListLDCFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCFederationConfigmapResponse setBody(ListLDCFederationConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCFederationConfigmapResponseBody getBody() {
        return this.body;
    }

}
