// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeLinktWorkflowstatusreachableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeLinktWorkflowstatusreachableResponseBody body;

    public static SetLinkeLinktWorkflowstatusreachableResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeLinktWorkflowstatusreachableResponse self = new SetLinkeLinktWorkflowstatusreachableResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeLinktWorkflowstatusreachableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeLinktWorkflowstatusreachableResponse setBody(SetLinkeLinktWorkflowstatusreachableResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeLinktWorkflowstatusreachableResponseBody getBody() {
        return this.body;
    }

}
