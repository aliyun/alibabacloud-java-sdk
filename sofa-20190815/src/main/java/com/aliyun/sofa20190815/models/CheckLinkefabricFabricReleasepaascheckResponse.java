// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkefabricFabricReleasepaascheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkefabricFabricReleasepaascheckResponseBody body;

    public static CheckLinkefabricFabricReleasepaascheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkefabricFabricReleasepaascheckResponse self = new CheckLinkefabricFabricReleasepaascheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkefabricFabricReleasepaascheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkefabricFabricReleasepaascheckResponse setBody(CheckLinkefabricFabricReleasepaascheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkefabricFabricReleasepaascheckResponseBody getBody() {
        return this.body;
    }

}
