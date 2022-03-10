// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListByUserGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListByUserGroupIdResponseBody body;

    public static ListByUserGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListByUserGroupIdResponse self = new ListByUserGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public ListByUserGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListByUserGroupIdResponse setBody(ListByUserGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListByUserGroupIdResponseBody getBody() {
        return this.body;
    }

}
