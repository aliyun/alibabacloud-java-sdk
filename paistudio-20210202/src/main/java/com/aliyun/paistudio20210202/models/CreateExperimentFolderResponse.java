// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExperimentFolderResponseBody body;

    public static CreateExperimentFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentFolderResponse self = new CreateExperimentFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentFolderResponse setBody(CreateExperimentFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentFolderResponseBody getBody() {
        return this.body;
    }

}
