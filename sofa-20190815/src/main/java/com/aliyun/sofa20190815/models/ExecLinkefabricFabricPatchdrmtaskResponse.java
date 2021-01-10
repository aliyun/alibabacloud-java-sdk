// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricPatchdrmtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricPatchdrmtaskResponseBody body;

    public static ExecLinkefabricFabricPatchdrmtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricPatchdrmtaskResponse self = new ExecLinkefabricFabricPatchdrmtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricPatchdrmtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricPatchdrmtaskResponse setBody(ExecLinkefabricFabricPatchdrmtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricPatchdrmtaskResponseBody getBody() {
        return this.body;
    }

}
