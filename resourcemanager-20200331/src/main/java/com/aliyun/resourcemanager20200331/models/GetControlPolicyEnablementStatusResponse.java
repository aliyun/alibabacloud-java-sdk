// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetControlPolicyEnablementStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetControlPolicyEnablementStatusResponse setBody(GetControlPolicyEnablementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetControlPolicyEnablementStatusResponseBody getBody() {
        return this.body;
    }

}
