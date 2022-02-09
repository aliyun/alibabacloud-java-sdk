// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsDatabaseInstanceResponseBody body;

    public static ListOmsDatabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseInstanceResponse self = new ListOmsDatabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsDatabaseInstanceResponse setBody(ListOmsDatabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
