// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileProtectClientRuleStatusResponseBody body;

    public static UpdateFileProtectClientRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientRuleStatusResponse self = new UpdateFileProtectClientRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectClientRuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectClientRuleStatusResponse setBody(UpdateFileProtectClientRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectClientRuleStatusResponseBody getBody() {
        return this.body;
    }

}
