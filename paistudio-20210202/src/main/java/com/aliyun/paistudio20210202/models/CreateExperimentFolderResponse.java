// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateExperimentFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentFolderResponse setBody(CreateExperimentFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentFolderResponseBody getBody() {
        return this.body;
    }

}
