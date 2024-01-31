// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCommonSwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommonSwitchConfigResponseBody body;

    public static GetCommonSwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommonSwitchConfigResponse self = new GetCommonSwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCommonSwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommonSwitchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommonSwitchConfigResponse setBody(GetCommonSwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommonSwitchConfigResponseBody getBody() {
        return this.body;
    }

}
