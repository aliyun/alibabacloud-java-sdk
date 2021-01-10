// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDTXAppsResponseBody body;

    public static ListDTXAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppsResponse self = new ListDTXAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListDTXAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDTXAppsResponse setBody(ListDTXAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDTXAppsResponseBody getBody() {
        return this.body;
    }

}
