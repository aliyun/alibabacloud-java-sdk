// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktTemplateselectablecustomfieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody body;

    public static ListLinkeLinktTemplateselectablecustomfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktTemplateselectablecustomfieldsResponse self = new ListLinkeLinktTemplateselectablecustomfieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponse setBody(ListLinkeLinktTemplateselectablecustomfieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody getBody() {
        return this.body;
    }

}
