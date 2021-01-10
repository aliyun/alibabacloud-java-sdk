// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkefabricFabricReleaseprodnotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkefabricFabricReleaseprodnotifyResponseBody body;

    public static GetLinkefabricFabricReleaseprodnotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkefabricFabricReleaseprodnotifyResponse self = new GetLinkefabricFabricReleaseprodnotifyResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkefabricFabricReleaseprodnotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkefabricFabricReleaseprodnotifyResponse setBody(GetLinkefabricFabricReleaseprodnotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkefabricFabricReleaseprodnotifyResponseBody getBody() {
        return this.body;
    }

}
