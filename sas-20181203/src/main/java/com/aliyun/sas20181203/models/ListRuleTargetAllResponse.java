// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRuleTargetAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRuleTargetAllResponseBody body;

    public static ListRuleTargetAllResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTargetAllResponse self = new ListRuleTargetAllResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleTargetAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleTargetAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleTargetAllResponse setBody(ListRuleTargetAllResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleTargetAllResponseBody getBody() {
        return this.body;
    }

}
