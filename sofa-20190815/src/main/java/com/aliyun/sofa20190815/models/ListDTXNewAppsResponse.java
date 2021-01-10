// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXNewAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDTXNewAppsResponseBody body;

    public static ListDTXNewAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDTXNewAppsResponse self = new ListDTXNewAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListDTXNewAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDTXNewAppsResponse setBody(ListDTXNewAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDTXNewAppsResponseBody getBody() {
        return this.body;
    }

}
