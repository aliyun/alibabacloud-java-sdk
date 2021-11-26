// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppServicesPageResponseBody body;

    public static ListAppServicesPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesPageResponse self = new ListAppServicesPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAppServicesPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppServicesPageResponse setBody(ListAppServicesPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppServicesPageResponseBody getBody() {
        return this.body;
    }

}
