// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallCenterProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallCenterProvidersResponseBody body;

    public static ListCallCenterProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallCenterProvidersResponse self = new ListCallCenterProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListCallCenterProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallCenterProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallCenterProvidersResponse setBody(ListCallCenterProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallCenterProvidersResponseBody getBody() {
        return this.body;
    }

}
