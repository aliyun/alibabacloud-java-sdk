// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultInjectAppsResponseBody body;

    public static ListMsSgFaultInjectAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAppsResponse self = new ListMsSgFaultInjectAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultInjectAppsResponse setBody(ListMsSgFaultInjectAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultInjectAppsResponseBody getBody() {
        return this.body;
    }

}
