// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkefabricFabricReleasegraynotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkefabricFabricReleasegraynotifyResponseBody body;

    public static GetLinkefabricFabricReleasegraynotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkefabricFabricReleasegraynotifyResponse self = new GetLinkefabricFabricReleasegraynotifyResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkefabricFabricReleasegraynotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkefabricFabricReleasegraynotifyResponse setBody(GetLinkefabricFabricReleasegraynotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkefabricFabricReleasegraynotifyResponseBody getBody() {
        return this.body;
    }

}
