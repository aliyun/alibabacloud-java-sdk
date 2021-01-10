// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultToleranceAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultToleranceAppsResponseBody body;

    public static ListMsSgFaultToleranceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultToleranceAppsResponse self = new ListMsSgFaultToleranceAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultToleranceAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultToleranceAppsResponse setBody(ListMsSgFaultToleranceAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultToleranceAppsResponseBody getBody() {
        return this.body;
    }

}
