// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectRuleargofmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectRuleargofmissionResponseBody body;

    public static UpdateHasInspectRuleargofmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectRuleargofmissionResponse self = new UpdateHasInspectRuleargofmissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectRuleargofmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectRuleargofmissionResponse setBody(UpdateHasInspectRuleargofmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectRuleargofmissionResponseBody getBody() {
        return this.body;
    }

}
