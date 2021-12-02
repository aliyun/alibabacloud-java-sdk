// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppCmsGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppCmsGroupsResponseBody body;

    public static ListAppCmsGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppCmsGroupsResponse self = new ListAppCmsGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppCmsGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppCmsGroupsResponse setBody(ListAppCmsGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppCmsGroupsResponseBody getBody() {
        return this.body;
    }

}
