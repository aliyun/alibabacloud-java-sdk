// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListTempFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTempFilesResponseBody body;

    public static ListTempFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTempFilesResponse self = new ListTempFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListTempFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTempFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTempFilesResponse setBody(ListTempFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTempFilesResponseBody getBody() {
        return this.body;
    }

}
