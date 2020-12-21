// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonVisitCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonVisitCountResponseBody body;

    public static ListPersonVisitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonVisitCountResponse self = new ListPersonVisitCountResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonVisitCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonVisitCountResponse setBody(ListPersonVisitCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonVisitCountResponseBody getBody() {
        return this.body;
    }

}
