// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveListenerWhiteListItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveListenerWhiteListItemResponseBody body;

    public static RemoveListenerWhiteListItemResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveListenerWhiteListItemResponse self = new RemoveListenerWhiteListItemResponse();
        return TeaModel.build(map, self);
    }

    public RemoveListenerWhiteListItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveListenerWhiteListItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveListenerWhiteListItemResponse setBody(RemoveListenerWhiteListItemResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveListenerWhiteListItemResponseBody getBody() {
        return this.body;
    }

}
