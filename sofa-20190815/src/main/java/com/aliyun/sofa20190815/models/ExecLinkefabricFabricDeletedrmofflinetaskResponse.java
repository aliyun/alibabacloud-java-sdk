// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricDeletedrmofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricDeletedrmofflinetaskResponseBody body;

    public static ExecLinkefabricFabricDeletedrmofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricDeletedrmofflinetaskResponse self = new ExecLinkefabricFabricDeletedrmofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricDeletedrmofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricDeletedrmofflinetaskResponse setBody(ExecLinkefabricFabricDeletedrmofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricDeletedrmofflinetaskResponseBody getBody() {
        return this.body;
    }

}
