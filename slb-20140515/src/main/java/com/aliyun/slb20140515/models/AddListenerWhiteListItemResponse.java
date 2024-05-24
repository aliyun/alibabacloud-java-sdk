// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddListenerWhiteListItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddListenerWhiteListItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddListenerWhiteListItemResponse setBody(AddListenerWhiteListItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddListenerWhiteListItemResponseBody getBody() {
        return this.body;
    }

}
