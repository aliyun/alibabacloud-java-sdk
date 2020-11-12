// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetArtifactMetadataQuery extends TeaModel {
    @NameInMap("filename")
    @Validation(required = true)
    public String filename;

    public static GetArtifactMetadataQuery build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactMetadataQuery self = new GetArtifactMetadataQuery();
        return TeaModel.build(map, self);
    }

    public GetArtifactMetadataQuery setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

}
