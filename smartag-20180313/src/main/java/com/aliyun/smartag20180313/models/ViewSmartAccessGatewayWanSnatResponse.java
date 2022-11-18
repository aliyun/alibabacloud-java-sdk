// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayWanSnatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayWanSnatResponseBody body;

    public static ViewSmartAccessGatewayWanSnatResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayWanSnatResponse self = new ViewSmartAccessGatewayWanSnatResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayWanSnatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayWanSnatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayWanSnatResponse setBody(ViewSmartAccessGatewayWanSnatResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayWanSnatResponseBody getBody() {
        return this.body;
    }

}
