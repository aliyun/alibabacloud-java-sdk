// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappworkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserappworkspacegroupResponseBody body;

    public static ListHasInspectUserappworkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappworkspacegroupResponse self = new ListHasInspectUserappworkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappworkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserappworkspacegroupResponse setBody(ListHasInspectUserappworkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserappworkspacegroupResponseBody getBody() {
        return this.body;
    }

}
