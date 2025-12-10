// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class DeleteExperimentFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentFolderResponseBody body;

    public static DeleteExperimentFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentFolderResponse self = new DeleteExperimentFolderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentFolderResponse setBody(DeleteExperimentFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentFolderResponseBody getBody() {
        return this.body;
    }

}
