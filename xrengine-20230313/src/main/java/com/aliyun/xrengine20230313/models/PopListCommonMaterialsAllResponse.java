// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListCommonMaterialsAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListCommonMaterialsAllResponseBody body;

    public static PopListCommonMaterialsAllResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListCommonMaterialsAllResponse self = new PopListCommonMaterialsAllResponse();
        return TeaModel.build(map, self);
    }

    public PopListCommonMaterialsAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListCommonMaterialsAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListCommonMaterialsAllResponse setBody(PopListCommonMaterialsAllResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListCommonMaterialsAllResponseBody getBody() {
        return this.body;
    }

}
