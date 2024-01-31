// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateRegistryTypeResponseBody body;

    public static ListPrivateRegistryTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryTypeResponse self = new ListPrivateRegistryTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateRegistryTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateRegistryTypeResponse setBody(ListPrivateRegistryTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateRegistryTypeResponseBody getBody() {
        return this.body;
    }

}
