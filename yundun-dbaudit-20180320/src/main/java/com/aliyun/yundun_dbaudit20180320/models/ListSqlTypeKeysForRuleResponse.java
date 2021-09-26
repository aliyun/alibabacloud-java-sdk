// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSqlTypeKeysForRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSqlTypeKeysForRuleResponseBody body;

    public static ListSqlTypeKeysForRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSqlTypeKeysForRuleResponse self = new ListSqlTypeKeysForRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSqlTypeKeysForRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSqlTypeKeysForRuleResponse setBody(ListSqlTypeKeysForRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSqlTypeKeysForRuleResponseBody getBody() {
        return this.body;
    }

}
