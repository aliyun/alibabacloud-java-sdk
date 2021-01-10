// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktWorkflowstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinktWorkflowstatusResponseBody body;

    public static AddLinkeLinktWorkflowstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktWorkflowstatusResponse self = new AddLinkeLinktWorkflowstatusResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktWorkflowstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinktWorkflowstatusResponse setBody(AddLinkeLinktWorkflowstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinktWorkflowstatusResponseBody getBody() {
        return this.body;
    }

}
