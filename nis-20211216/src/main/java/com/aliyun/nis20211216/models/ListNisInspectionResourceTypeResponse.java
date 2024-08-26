// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNisInspectionResourceTypeResponseBody body;

    public static ListNisInspectionResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionResourceTypeResponse self = new ListNisInspectionResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNisInspectionResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNisInspectionResourceTypeResponse setBody(ListNisInspectionResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNisInspectionResourceTypeResponseBody getBody() {
        return this.body;
    }

}
