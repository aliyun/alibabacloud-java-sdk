// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricMsgconfigtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricMsgconfigtaskResponseBody body;

    public static ExecLinkefabricFabricMsgconfigtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricMsgconfigtaskResponse self = new ExecLinkefabricFabricMsgconfigtaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricMsgconfigtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricMsgconfigtaskResponse setBody(ExecLinkefabricFabricMsgconfigtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricMsgconfigtaskResponseBody getBody() {
        return this.body;
    }

}
