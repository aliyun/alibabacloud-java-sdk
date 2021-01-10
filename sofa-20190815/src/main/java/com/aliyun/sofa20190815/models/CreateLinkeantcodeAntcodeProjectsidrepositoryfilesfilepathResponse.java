// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody body;

    public static CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse self = new CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse setBody(CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody getBody() {
        return this.body;
    }

}
