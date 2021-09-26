// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSqlTypesForRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSqlTypesForRuleResponseBody body;

    public static ListSqlTypesForRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSqlTypesForRuleResponse self = new ListSqlTypesForRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSqlTypesForRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSqlTypesForRuleResponse setBody(ListSqlTypesForRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSqlTypesForRuleResponseBody getBody() {
        return this.body;
    }

}
