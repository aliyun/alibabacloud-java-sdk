// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAllAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultInjectAllAppsResponseBody body;

    public static ListMsSgFaultInjectAllAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAllAppsResponse self = new ListMsSgFaultInjectAllAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAllAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultInjectAllAppsResponse setBody(ListMsSgFaultInjectAllAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultInjectAllAppsResponseBody getBody() {
        return this.body;
    }

}
