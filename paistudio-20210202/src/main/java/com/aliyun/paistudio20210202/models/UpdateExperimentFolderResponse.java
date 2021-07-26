// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentFolderResponseBody body;

    public static UpdateExperimentFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentFolderResponse self = new UpdateExperimentFolderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentFolderResponse setBody(UpdateExperimentFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentFolderResponseBody getBody() {
        return this.body;
    }

}
