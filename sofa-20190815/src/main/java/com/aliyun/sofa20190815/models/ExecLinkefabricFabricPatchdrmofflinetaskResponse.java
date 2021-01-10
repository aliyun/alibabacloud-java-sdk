// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricPatchdrmofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricPatchdrmofflinetaskResponseBody body;

    public static ExecLinkefabricFabricPatchdrmofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricPatchdrmofflinetaskResponse self = new ExecLinkefabricFabricPatchdrmofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricPatchdrmofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricPatchdrmofflinetaskResponse setBody(ExecLinkefabricFabricPatchdrmofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricPatchdrmofflinetaskResponseBody getBody() {
        return this.body;
    }

}
