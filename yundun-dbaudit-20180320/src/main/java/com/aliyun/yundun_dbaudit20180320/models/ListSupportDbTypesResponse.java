// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSupportDbTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSupportDbTypesResponseBody body;

    public static ListSupportDbTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportDbTypesResponse self = new ListSupportDbTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportDbTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportDbTypesResponse setBody(ListSupportDbTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportDbTypesResponseBody getBody() {
        return this.body;
    }

}
