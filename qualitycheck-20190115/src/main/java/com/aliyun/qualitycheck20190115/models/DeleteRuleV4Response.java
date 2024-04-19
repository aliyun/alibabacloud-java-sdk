// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteRuleV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRuleV4ResponseBody body;

    public static DeleteRuleV4Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleV4Response self = new DeleteRuleV4Response();
        return TeaModel.build(map, self);
    }

    public DeleteRuleV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRuleV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRuleV4Response setBody(DeleteRuleV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRuleV4ResponseBody getBody() {
        return this.body;
    }

}
