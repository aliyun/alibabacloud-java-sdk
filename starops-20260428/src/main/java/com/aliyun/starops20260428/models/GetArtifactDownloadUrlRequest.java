// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetArtifactDownloadUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reports/summary.pdf</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    public static GetArtifactDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactDownloadUrlRequest self = new GetArtifactDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactDownloadUrlRequest setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
        return this;
    }
    public String getArtifactPath() {
        return this.artifactPath;
    }

}
