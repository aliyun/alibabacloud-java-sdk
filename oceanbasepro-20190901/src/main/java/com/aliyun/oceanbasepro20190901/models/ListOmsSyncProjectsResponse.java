// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsSyncProjectsResponseBody body;

    public static ListOmsSyncProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncProjectsResponse self = new ListOmsSyncProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsSyncProjectsResponse setBody(ListOmsSyncProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsSyncProjectsResponseBody getBody() {
        return this.body;
    }

}
