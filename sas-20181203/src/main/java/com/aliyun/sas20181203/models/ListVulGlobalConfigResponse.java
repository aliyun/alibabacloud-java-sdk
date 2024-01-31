// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVulGlobalConfigResponseBody body;

    public static ListVulGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVulGlobalConfigResponse self = new ListVulGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListVulGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVulGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVulGlobalConfigResponse setBody(ListVulGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVulGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
