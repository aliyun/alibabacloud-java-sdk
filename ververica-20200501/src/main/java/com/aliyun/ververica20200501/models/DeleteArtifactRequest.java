// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteArtifactRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DeleteArtifactQuery query;

    public static DeleteArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactRequest self = new DeleteArtifactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteArtifactRequest setQuery(DeleteArtifactQuery query) {
        this.query = query;
        return this;
    }
    public DeleteArtifactQuery getQuery() {
        return this.query;
    }

}
