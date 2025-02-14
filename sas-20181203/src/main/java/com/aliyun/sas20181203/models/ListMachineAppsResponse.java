// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMachineAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMachineAppsResponseBody body;

    public static ListMachineAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMachineAppsResponse self = new ListMachineAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMachineAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMachineAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMachineAppsResponse setBody(ListMachineAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMachineAppsResponseBody getBody() {
        return this.body;
    }

}
