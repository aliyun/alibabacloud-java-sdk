// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricPostdrmtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricPostdrmtaskResponseBody body;

    public static ExecLinkefabricFabricPostdrmtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricPostdrmtaskResponse self = new ExecLinkefabricFabricPostdrmtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricPostdrmtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricPostdrmtaskResponse setBody(ExecLinkefabricFabricPostdrmtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricPostdrmtaskResponseBody getBody() {
        return this.body;
    }

}
