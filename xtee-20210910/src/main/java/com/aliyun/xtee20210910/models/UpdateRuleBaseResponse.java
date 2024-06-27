// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleBaseResponseBody body;

    public static UpdateRuleBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleBaseResponse self = new UpdateRuleBaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleBaseResponse setBody(UpdateRuleBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleBaseResponseBody getBody() {
        return this.body;
    }

}
