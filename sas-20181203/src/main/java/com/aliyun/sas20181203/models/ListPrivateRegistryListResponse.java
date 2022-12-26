// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivateRegistryListResponseBody body;

    public static ListPrivateRegistryListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryListResponse self = new ListPrivateRegistryListResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateRegistryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateRegistryListResponse setBody(ListPrivateRegistryListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateRegistryListResponseBody getBody() {
        return this.body;
    }

}
