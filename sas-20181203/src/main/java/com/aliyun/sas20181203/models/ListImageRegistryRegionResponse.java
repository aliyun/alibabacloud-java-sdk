// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageRegistryRegionResponseBody body;

    public static ListImageRegistryRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryRegionResponse self = new ListImageRegistryRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageRegistryRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageRegistryRegionResponse setBody(ListImageRegistryRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageRegistryRegionResponseBody getBody() {
        return this.body;
    }

}
