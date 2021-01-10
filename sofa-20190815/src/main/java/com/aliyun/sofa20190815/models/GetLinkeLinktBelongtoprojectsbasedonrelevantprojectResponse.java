// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody body;

    public static GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse self = new GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse setBody(GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody getBody() {
        return this.body;
    }

}
