// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppInstallationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAppInstallationsResponseBody body;

    public static ListCloudAppInstallationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppInstallationsResponse self = new ListCloudAppInstallationsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAppInstallationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAppInstallationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAppInstallationsResponse setBody(ListCloudAppInstallationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAppInstallationsResponseBody getBody() {
        return this.body;
    }

}
