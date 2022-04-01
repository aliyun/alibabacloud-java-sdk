// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkflowDefinitionResponseBody body;

    public static GetWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionResponse self = new GetWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowDefinitionResponse setBody(GetWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
