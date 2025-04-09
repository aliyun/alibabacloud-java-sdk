// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListApiPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiPluginsResponseBody body;

    public static ListApiPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiPluginsResponse self = new ListApiPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListApiPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiPluginsResponse setBody(ListApiPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiPluginsResponseBody getBody() {
        return this.body;
    }

}
