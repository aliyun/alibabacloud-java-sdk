// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectAkeworkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectAkeworkspacegroupResponseBody body;

    public static ListHasInspectAkeworkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectAkeworkspacegroupResponse self = new ListHasInspectAkeworkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectAkeworkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectAkeworkspacegroupResponse setBody(ListHasInspectAkeworkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectAkeworkspacegroupResponseBody getBody() {
        return this.body;
    }

}
