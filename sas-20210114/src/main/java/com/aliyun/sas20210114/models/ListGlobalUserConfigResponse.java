// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class ListGlobalUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGlobalUserConfigResponseBody body;

    public static ListGlobalUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalUserConfigResponse self = new ListGlobalUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGlobalUserConfigResponse setBody(ListGlobalUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalUserConfigResponseBody getBody() {
        return this.body;
    }

}
