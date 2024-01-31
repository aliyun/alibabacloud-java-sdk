// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginForUuidResponseBody body;

    public static ListPluginForUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginForUuidResponse self = new ListPluginForUuidResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginForUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginForUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginForUuidResponse setBody(ListPluginForUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginForUuidResponseBody getBody() {
        return this.body;
    }

}
