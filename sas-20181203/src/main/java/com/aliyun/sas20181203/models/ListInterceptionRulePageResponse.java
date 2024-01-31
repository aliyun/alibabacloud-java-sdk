// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionRulePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterceptionRulePageResponseBody body;

    public static ListInterceptionRulePageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionRulePageResponse self = new ListInterceptionRulePageResponse();
        return TeaModel.build(map, self);
    }

    public ListInterceptionRulePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterceptionRulePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterceptionRulePageResponse setBody(ListInterceptionRulePageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterceptionRulePageResponseBody getBody() {
        return this.body;
    }

}
