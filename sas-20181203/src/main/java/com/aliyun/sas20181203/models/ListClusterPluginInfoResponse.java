// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterPluginInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterPluginInfoResponseBody body;

    public static ListClusterPluginInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterPluginInfoResponse self = new ListClusterPluginInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterPluginInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterPluginInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterPluginInfoResponse setBody(ListClusterPluginInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterPluginInfoResponseBody getBody() {
        return this.body;
    }

}
