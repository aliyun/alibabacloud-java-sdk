// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyDrivesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyDrivesResponseBody body;

    public static ListMyDrivesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyDrivesResponse self = new ListMyDrivesResponse();
        return TeaModel.build(map, self);
    }

    public ListMyDrivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyDrivesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyDrivesResponse setBody(ListMyDrivesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyDrivesResponseBody getBody() {
        return this.body;
    }

}
