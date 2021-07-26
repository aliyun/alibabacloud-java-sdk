// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class DeleteExperimentFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteExperimentFolderResponse setBody(DeleteExperimentFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentFolderResponseBody getBody() {
        return this.body;
    }

}
