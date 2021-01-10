// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandupdatetoworkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody body;

    public static ExecLinkeLinktCreatestatusandupdatetoworkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandupdatetoworkflowResponse self = new ExecLinkeLinktCreatestatusandupdatetoworkflowResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponse setBody(ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody getBody() {
        return this.body;
    }

}
