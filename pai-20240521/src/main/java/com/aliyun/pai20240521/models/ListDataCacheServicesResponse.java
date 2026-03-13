// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class ListDataCacheServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCacheServicesResponseBody body;

    public static ListDataCacheServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCacheServicesResponse self = new ListDataCacheServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCacheServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCacheServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCacheServicesResponse setBody(ListDataCacheServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCacheServicesResponseBody getBody() {
        return this.body;
    }

}
