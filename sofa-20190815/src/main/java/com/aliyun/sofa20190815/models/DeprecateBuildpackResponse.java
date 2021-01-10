// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeprecateBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeprecateBuildpackResponseBody body;

    public static DeprecateBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprecateBuildpackResponse self = new DeprecateBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public DeprecateBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprecateBuildpackResponse setBody(DeprecateBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprecateBuildpackResponseBody getBody() {
        return this.body;
    }

}
