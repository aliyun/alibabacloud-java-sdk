// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskAssignRulesResponseBody body;

    public static ListTaskAssignRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesResponse self = new ListTaskAssignRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskAssignRulesResponse setBody(ListTaskAssignRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskAssignRulesResponseBody getBody() {
        return this.body;
    }

}
