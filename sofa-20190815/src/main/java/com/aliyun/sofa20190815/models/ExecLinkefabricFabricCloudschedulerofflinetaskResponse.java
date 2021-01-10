// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricCloudschedulerofflinetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkefabricFabricCloudschedulerofflinetaskResponseBody body;

    public static ExecLinkefabricFabricCloudschedulerofflinetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricCloudschedulerofflinetaskResponse self = new ExecLinkefabricFabricCloudschedulerofflinetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskResponse setBody(ExecLinkefabricFabricCloudschedulerofflinetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkefabricFabricCloudschedulerofflinetaskResponseBody getBody() {
        return this.body;
    }

}
