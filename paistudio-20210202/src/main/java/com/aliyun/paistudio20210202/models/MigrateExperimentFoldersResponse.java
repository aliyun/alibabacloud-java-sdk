// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentFoldersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateExperimentFoldersResponseBody body;

    public static MigrateExperimentFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentFoldersResponse self = new MigrateExperimentFoldersResponse();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateExperimentFoldersResponse setBody(MigrateExperimentFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateExperimentFoldersResponseBody getBody() {
        return this.body;
    }

}
