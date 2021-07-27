// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ListIpcStoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpcStoreInfoResponseBody body;

    public static ListIpcStoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpcStoreInfoResponse self = new ListIpcStoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListIpcStoreInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpcStoreInfoResponse setBody(ListIpcStoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpcStoreInfoResponseBody getBody() {
        return this.body;
    }

}
