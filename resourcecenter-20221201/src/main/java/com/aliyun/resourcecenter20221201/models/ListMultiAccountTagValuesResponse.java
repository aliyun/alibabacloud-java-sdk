// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultiAccountTagValuesResponseBody body;

    public static ListMultiAccountTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountTagValuesResponse self = new ListMultiAccountTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiAccountTagValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiAccountTagValuesResponse setBody(ListMultiAccountTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiAccountTagValuesResponseBody getBody() {
        return this.body;
    }

}
