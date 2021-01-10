// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricHeaddrmtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricHeaddrmtaskResponseBody body;

    public static ExecLinkefabricFabricHeaddrmtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricHeaddrmtaskResponse self = new ExecLinkefabricFabricHeaddrmtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricHeaddrmtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricHeaddrmtaskResponse setBody(ExecLinkefabricFabricHeaddrmtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricHeaddrmtaskResponseBody getBody() {
        return this.body;
    }

}
