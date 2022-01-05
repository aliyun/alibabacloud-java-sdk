// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ListUsedProjectsByOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsedProjectsByOwnerResponseBody body;

    public static ListUsedProjectsByOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsedProjectsByOwnerResponse self = new ListUsedProjectsByOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ListUsedProjectsByOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsedProjectsByOwnerResponse setBody(ListUsedProjectsByOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsedProjectsByOwnerResponseBody getBody() {
        return this.body;
    }

}
