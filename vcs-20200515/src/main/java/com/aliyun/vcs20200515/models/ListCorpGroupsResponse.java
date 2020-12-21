// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCorpGroupsResponseBody body;

    public static ListCorpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupsResponse self = new ListCorpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCorpGroupsResponse setBody(ListCorpGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCorpGroupsResponseBody getBody() {
        return this.body;
    }

}
