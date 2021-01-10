// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDmsWhitelistResponseBody body;

    public static ListDmsWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDmsWhitelistResponse self = new ListDmsWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ListDmsWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDmsWhitelistResponse setBody(ListDmsWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDmsWhitelistResponseBody getBody() {
        return this.body;
    }

}
