// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLevelRuleConfigResponseBody body;

    public static DeleteDataLevelRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLevelRuleConfigResponse self = new DeleteDataLevelRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLevelRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLevelRuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLevelRuleConfigResponse setBody(DeleteDataLevelRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLevelRuleConfigResponseBody getBody() {
        return this.body;
    }

}
