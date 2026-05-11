// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetArtifactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>missions/mission-xxx/artifacts/2026-05/05-01/xxxx.md</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    public static GetArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRequest self = new GetArtifactRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactRequest setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
        return this;
    }
    public String getArtifactPath() {
        return this.artifactPath;
    }

}
