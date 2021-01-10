// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuthRuleGroupServicesResponseBody body;

    public static ListMsSgAuthRuleGroupServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupServicesResponse self = new ListMsSgAuthRuleGroupServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuthRuleGroupServicesResponse setBody(ListMsSgAuthRuleGroupServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuthRuleGroupServicesResponseBody getBody() {
        return this.body;
    }

}
