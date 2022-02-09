// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsDatabaseResponseBody body;

    public static ListOmsDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseResponse self = new ListOmsDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsDatabaseResponse setBody(ListOmsDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsDatabaseResponseBody getBody() {
        return this.body;
    }

}
