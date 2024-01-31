// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOssScanConfigResponseBody body;

    public static ListOssScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssScanConfigResponse self = new ListOssScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListOssScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOssScanConfigResponse setBody(ListOssScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssScanConfigResponseBody getBody() {
        return this.body;
    }

}
