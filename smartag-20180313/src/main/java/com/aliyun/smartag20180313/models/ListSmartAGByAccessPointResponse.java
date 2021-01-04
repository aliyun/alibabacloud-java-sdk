// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGByAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmartAGByAccessPointResponseBody body;

    public static ListSmartAGByAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGByAccessPointResponse self = new ListSmartAGByAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartAGByAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartAGByAccessPointResponse setBody(ListSmartAGByAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartAGByAccessPointResponseBody getBody() {
        return this.body;
    }

}
