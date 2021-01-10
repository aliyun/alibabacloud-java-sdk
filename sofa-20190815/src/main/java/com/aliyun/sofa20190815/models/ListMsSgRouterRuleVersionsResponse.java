// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgRouterRuleVersionsResponseBody body;

    public static ListMsSgRouterRuleVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleVersionsResponse self = new ListMsSgRouterRuleVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgRouterRuleVersionsResponse setBody(ListMsSgRouterRuleVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgRouterRuleVersionsResponseBody getBody() {
        return this.body;
    }

}
