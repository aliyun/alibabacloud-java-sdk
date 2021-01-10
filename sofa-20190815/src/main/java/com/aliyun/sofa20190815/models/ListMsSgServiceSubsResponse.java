// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceSubsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgServiceSubsResponseBody body;

    public static ListMsSgServiceSubsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceSubsResponse self = new ListMsSgServiceSubsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceSubsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgServiceSubsResponse setBody(ListMsSgServiceSubsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgServiceSubsResponseBody getBody() {
        return this.body;
    }

}
