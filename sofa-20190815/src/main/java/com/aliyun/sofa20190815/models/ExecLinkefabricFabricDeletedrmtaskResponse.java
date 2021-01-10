// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricDeletedrmtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricDeletedrmtaskResponseBody body;

    public static ExecLinkefabricFabricDeletedrmtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricDeletedrmtaskResponse self = new ExecLinkefabricFabricDeletedrmtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricDeletedrmtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricDeletedrmtaskResponse setBody(ExecLinkefabricFabricDeletedrmtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricDeletedrmtaskResponseBody getBody() {
        return this.body;
    }

}
