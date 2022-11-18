// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiagnoseSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DiagnoseSmartAccessGatewayResponseBody body;

    public static DiagnoseSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseSmartAccessGatewayResponse self = new DiagnoseSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DiagnoseSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiagnoseSmartAccessGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiagnoseSmartAccessGatewayResponse setBody(DiagnoseSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DiagnoseSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
