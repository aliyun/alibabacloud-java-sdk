// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricSchedulerofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricSchedulerofflinetaskResponseBody body;

    public static ExecLinkefabricFabricSchedulerofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricSchedulerofflinetaskResponse self = new ExecLinkefabricFabricSchedulerofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricSchedulerofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricSchedulerofflinetaskResponse setBody(ExecLinkefabricFabricSchedulerofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricSchedulerofflinetaskResponseBody getBody() {
        return this.body;
    }

}
