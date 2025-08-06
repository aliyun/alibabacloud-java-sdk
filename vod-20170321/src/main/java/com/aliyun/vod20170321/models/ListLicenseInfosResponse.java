// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLicenseInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLicenseInfosResponseBody body;

    public static ListLicenseInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLicenseInfosResponse self = new ListLicenseInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListLicenseInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLicenseInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLicenseInfosResponse setBody(ListLicenseInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLicenseInfosResponseBody getBody() {
        return this.body;
    }

}
