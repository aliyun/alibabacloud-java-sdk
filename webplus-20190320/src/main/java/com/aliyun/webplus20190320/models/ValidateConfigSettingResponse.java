// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ValidateConfigSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateConfigSettingResponseBody body;

    public static ValidateConfigSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateConfigSettingResponse self = new ValidateConfigSettingResponse();
        return TeaModel.build(map, self);
    }

    public ValidateConfigSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateConfigSettingResponse setBody(ValidateConfigSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateConfigSettingResponseBody getBody() {
        return this.body;
    }

}
