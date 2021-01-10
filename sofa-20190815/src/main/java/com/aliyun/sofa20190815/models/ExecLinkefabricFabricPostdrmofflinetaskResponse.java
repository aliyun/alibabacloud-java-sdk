// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricPostdrmofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricPostdrmofflinetaskResponseBody body;

    public static ExecLinkefabricFabricPostdrmofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricPostdrmofflinetaskResponse self = new ExecLinkefabricFabricPostdrmofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricPostdrmofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricPostdrmofflinetaskResponse setBody(ExecLinkefabricFabricPostdrmofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricPostdrmofflinetaskResponseBody getBody() {
        return this.body;
    }

}
