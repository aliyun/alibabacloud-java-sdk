// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListUsedSqlTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsedSqlTypesResponseBody body;

    public static ListUsedSqlTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsedSqlTypesResponse self = new ListUsedSqlTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListUsedSqlTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsedSqlTypesResponse setBody(ListUsedSqlTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsedSqlTypesResponseBody getBody() {
        return this.body;
    }

}
