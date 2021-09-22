// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelinePrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelinePrivilegesResponseBody body;

    public static UpdatePipelinePrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinePrivilegesResponse self = new UpdatePipelinePrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinePrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelinePrivilegesResponse setBody(UpdatePipelinePrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelinePrivilegesResponseBody getBody() {
        return this.body;
    }

}
