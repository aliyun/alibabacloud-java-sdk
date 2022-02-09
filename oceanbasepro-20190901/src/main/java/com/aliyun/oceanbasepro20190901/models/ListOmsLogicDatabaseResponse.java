// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsLogicDatabaseResponseBody body;

    public static ListOmsLogicDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicDatabaseResponse self = new ListOmsLogicDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsLogicDatabaseResponse setBody(ListOmsLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
