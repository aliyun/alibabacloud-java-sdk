// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppsRecoverydsnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDTXAppsRecoverydsnameResponseBody body;

    public static ListDTXAppsRecoverydsnameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppsRecoverydsnameResponse self = new ListDTXAppsRecoverydsnameResponse();
        return TeaModel.build(map, self);
    }

    public ListDTXAppsRecoverydsnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDTXAppsRecoverydsnameResponse setBody(ListDTXAppsRecoverydsnameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDTXAppsRecoverydsnameResponseBody getBody() {
        return this.body;
    }

}
