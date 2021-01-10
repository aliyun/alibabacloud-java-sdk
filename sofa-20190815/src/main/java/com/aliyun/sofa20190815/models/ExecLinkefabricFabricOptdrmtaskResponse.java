// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricOptdrmtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricOptdrmtaskResponseBody body;

    public static ExecLinkefabricFabricOptdrmtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricOptdrmtaskResponse self = new ExecLinkefabricFabricOptdrmtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricOptdrmtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricOptdrmtaskResponse setBody(ExecLinkefabricFabricOptdrmtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricOptdrmtaskResponseBody getBody() {
        return this.body;
    }

}
