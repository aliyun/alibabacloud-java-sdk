// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveAppRequirementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAppRequirementResponseBody body;

    public static SaveAppRequirementResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAppRequirementResponse self = new SaveAppRequirementResponse();
        return TeaModel.build(map, self);
    }

    public SaveAppRequirementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAppRequirementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAppRequirementResponse setBody(SaveAppRequirementResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAppRequirementResponseBody getBody() {
        return this.body;
    }

}
