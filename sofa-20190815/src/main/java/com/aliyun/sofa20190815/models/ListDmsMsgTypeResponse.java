// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDmsMsgTypeResponseBody body;

    public static ListDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDmsMsgTypeResponse self = new ListDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDmsMsgTypeResponse setBody(ListDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
