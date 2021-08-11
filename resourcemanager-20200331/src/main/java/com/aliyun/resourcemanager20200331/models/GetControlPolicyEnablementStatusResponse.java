// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetControlPolicyEnablementStatusResponseBody body;

    public static GetControlPolicyEnablementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyEnablementStatusResponse self = new GetControlPolicyEnablementStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyEnablementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetControlPolicyEnablementStatusResponse setBody(GetControlPolicyEnablementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetControlPolicyEnablementStatusResponseBody getBody() {
        return this.body;
    }

}
