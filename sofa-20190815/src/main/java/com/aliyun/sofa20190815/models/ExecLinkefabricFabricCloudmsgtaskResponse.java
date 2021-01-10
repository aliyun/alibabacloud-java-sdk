// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricCloudmsgtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricCloudmsgtaskResponseBody body;

    public static ExecLinkefabricFabricCloudmsgtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricCloudmsgtaskResponse self = new ExecLinkefabricFabricCloudmsgtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricCloudmsgtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricCloudmsgtaskResponse setBody(ExecLinkefabricFabricCloudmsgtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricCloudmsgtaskResponseBody getBody() {
        return this.body;
    }

}
