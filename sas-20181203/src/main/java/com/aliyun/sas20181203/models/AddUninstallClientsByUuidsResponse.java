// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUninstallClientsByUuidsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUninstallClientsByUuidsResponseBody body;

    public static AddUninstallClientsByUuidsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUninstallClientsByUuidsResponse self = new AddUninstallClientsByUuidsResponse();
        return TeaModel.build(map, self);
    }

    public AddUninstallClientsByUuidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUninstallClientsByUuidsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUninstallClientsByUuidsResponse setBody(AddUninstallClientsByUuidsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUninstallClientsByUuidsResponseBody getBody() {
        return this.body;
    }

}
