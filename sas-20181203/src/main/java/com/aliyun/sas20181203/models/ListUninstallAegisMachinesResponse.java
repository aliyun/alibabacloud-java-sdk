// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUninstallAegisMachinesResponseBody body;

    public static ListUninstallAegisMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallAegisMachinesResponse self = new ListUninstallAegisMachinesResponse();
        return TeaModel.build(map, self);
    }

    public ListUninstallAegisMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUninstallAegisMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUninstallAegisMachinesResponse setBody(ListUninstallAegisMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUninstallAegisMachinesResponseBody getBody() {
        return this.body;
    }

}
