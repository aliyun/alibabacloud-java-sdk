// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkefabricFabricReleasepaascheckwithappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkefabricFabricReleasepaascheckwithappResponseBody body;

    public static CheckLinkefabricFabricReleasepaascheckwithappResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkefabricFabricReleasepaascheckwithappResponse self = new CheckLinkefabricFabricReleasepaascheckwithappResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkefabricFabricReleasepaascheckwithappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappResponse setBody(CheckLinkefabricFabricReleasepaascheckwithappResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkefabricFabricReleasepaascheckwithappResponseBody getBody() {
        return this.body;
    }

}
