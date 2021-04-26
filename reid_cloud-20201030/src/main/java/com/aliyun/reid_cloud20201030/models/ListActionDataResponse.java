// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListActionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListActionDataResponseBody body;

    public static ListActionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionDataResponse self = new ListActionDataResponse();
        return TeaModel.build(map, self);
    }

    public ListActionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionDataResponse setBody(ListActionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionDataResponseBody getBody() {
        return this.body;
    }

}
