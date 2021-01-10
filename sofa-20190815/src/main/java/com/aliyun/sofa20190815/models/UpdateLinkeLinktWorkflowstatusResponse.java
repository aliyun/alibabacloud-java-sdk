// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkflowstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktWorkflowstatusResponseBody body;

    public static UpdateLinkeLinktWorkflowstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkflowstatusResponse self = new UpdateLinkeLinktWorkflowstatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkflowstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktWorkflowstatusResponse setBody(UpdateLinkeLinktWorkflowstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktWorkflowstatusResponseBody getBody() {
        return this.body;
    }

}
