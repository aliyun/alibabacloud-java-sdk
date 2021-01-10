// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricPutdrmofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricPutdrmofflinetaskResponseBody body;

    public static ExecLinkefabricFabricPutdrmofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricPutdrmofflinetaskResponse self = new ExecLinkefabricFabricPutdrmofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricPutdrmofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricPutdrmofflinetaskResponse setBody(ExecLinkefabricFabricPutdrmofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricPutdrmofflinetaskResponseBody getBody() {
        return this.body;
    }

}
