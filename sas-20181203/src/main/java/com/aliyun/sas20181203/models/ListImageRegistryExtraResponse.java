// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryExtraResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageRegistryExtraResponseBody body;

    public static ListImageRegistryExtraResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryExtraResponse self = new ListImageRegistryExtraResponse();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryExtraResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageRegistryExtraResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageRegistryExtraResponse setBody(ListImageRegistryExtraResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageRegistryExtraResponseBody getBody() {
        return this.body;
    }

}
