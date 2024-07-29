// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePackageStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancePackageStatesResponseBody body;

    public static ListInstancePackageStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePackageStatesResponse self = new ListInstancePackageStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancePackageStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancePackageStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancePackageStatesResponse setBody(ListInstancePackageStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancePackageStatesResponseBody getBody() {
        return this.body;
    }

}
