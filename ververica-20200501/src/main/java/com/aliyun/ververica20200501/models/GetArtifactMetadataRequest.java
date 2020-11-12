// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetArtifactMetadataRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public GetArtifactMetadataQuery query;

    public static GetArtifactMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactMetadataRequest self = new GetArtifactMetadataRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactMetadataRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactMetadataRequest setQuery(GetArtifactMetadataQuery query) {
        this.query = query;
        return this;
    }
    public GetArtifactMetadataQuery getQuery() {
        return this.query;
    }

}
