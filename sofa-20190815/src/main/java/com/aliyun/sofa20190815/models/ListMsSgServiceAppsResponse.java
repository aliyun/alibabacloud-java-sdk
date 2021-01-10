// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgServiceAppsResponseBody body;

    public static ListMsSgServiceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceAppsResponse self = new ListMsSgServiceAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgServiceAppsResponse setBody(ListMsSgServiceAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgServiceAppsResponseBody getBody() {
        return this.body;
    }

}
