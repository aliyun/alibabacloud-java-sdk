// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultiAccountTagKeysResponseBody body;

    public static ListMultiAccountTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountTagKeysResponse self = new ListMultiAccountTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountTagKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiAccountTagKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiAccountTagKeysResponse setBody(ListMultiAccountTagKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiAccountTagKeysResponseBody getBody() {
        return this.body;
    }

}
