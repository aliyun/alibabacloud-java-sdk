// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTAppsResponseBody body;

    public static ListDSTAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTAppsResponse self = new ListDSTAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTAppsResponse setBody(ListDSTAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTAppsResponseBody getBody() {
        return this.body;
    }

}
