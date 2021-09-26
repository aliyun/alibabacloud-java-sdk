// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListTemplatesForSqlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplatesForSqlRuleResponseBody body;

    public static ListTemplatesForSqlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesForSqlRuleResponse self = new ListTemplatesForSqlRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplatesForSqlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplatesForSqlRuleResponse setBody(ListTemplatesForSqlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplatesForSqlRuleResponseBody getBody() {
        return this.body;
    }

}
