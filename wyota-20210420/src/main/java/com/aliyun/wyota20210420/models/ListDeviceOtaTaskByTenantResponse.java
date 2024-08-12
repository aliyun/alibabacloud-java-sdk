// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceOtaTaskByTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceOtaTaskByTenantResponseBody body;

    public static ListDeviceOtaTaskByTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceOtaTaskByTenantResponse self = new ListDeviceOtaTaskByTenantResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceOtaTaskByTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceOtaTaskByTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceOtaTaskByTenantResponse setBody(ListDeviceOtaTaskByTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceOtaTaskByTenantResponseBody getBody() {
        return this.body;
    }

}
