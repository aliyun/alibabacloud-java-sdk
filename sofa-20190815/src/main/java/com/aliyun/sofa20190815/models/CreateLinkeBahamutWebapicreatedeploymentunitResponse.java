// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutWebapicreatedeploymentunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutWebapicreatedeploymentunitResponseBody body;

    public static CreateLinkeBahamutWebapicreatedeploymentunitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutWebapicreatedeploymentunitResponse self = new CreateLinkeBahamutWebapicreatedeploymentunitResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutWebapicreatedeploymentunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutWebapicreatedeploymentunitResponse setBody(CreateLinkeBahamutWebapicreatedeploymentunitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutWebapicreatedeploymentunitResponseBody getBody() {
        return this.body;
    }

}
