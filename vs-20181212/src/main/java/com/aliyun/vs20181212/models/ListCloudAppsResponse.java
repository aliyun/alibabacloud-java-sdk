// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAppsResponseBody body;

    public static ListCloudAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppsResponse self = new ListCloudAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAppsResponse setBody(ListCloudAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAppsResponseBody getBody() {
        return this.body;
    }

}
