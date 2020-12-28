// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddListenerWhiteListItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddListenerWhiteListItemResponseBody body;

    public static AddListenerWhiteListItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddListenerWhiteListItemResponse self = new AddListenerWhiteListItemResponse();
        return TeaModel.build(map, self);
    }

    public AddListenerWhiteListItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddListenerWhiteListItemResponse setBody(AddListenerWhiteListItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddListenerWhiteListItemResponseBody getBody() {
        return this.body;
    }

}
