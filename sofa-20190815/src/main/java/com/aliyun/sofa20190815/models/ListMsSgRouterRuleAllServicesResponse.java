// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleAllServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgRouterRuleAllServicesResponseBody body;

    public static ListMsSgRouterRuleAllServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleAllServicesResponse self = new ListMsSgRouterRuleAllServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleAllServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgRouterRuleAllServicesResponse setBody(ListMsSgRouterRuleAllServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgRouterRuleAllServicesResponseBody getBody() {
        return this.body;
    }

}
