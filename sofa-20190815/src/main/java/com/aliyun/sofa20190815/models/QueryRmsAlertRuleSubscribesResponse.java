// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertRuleSubscribesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlertRuleSubscribesResponseBody body;

    public static QueryRmsAlertRuleSubscribesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertRuleSubscribesResponse self = new QueryRmsAlertRuleSubscribesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertRuleSubscribesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlertRuleSubscribesResponse setBody(QueryRmsAlertRuleSubscribesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlertRuleSubscribesResponseBody getBody() {
        return this.body;
    }

}
