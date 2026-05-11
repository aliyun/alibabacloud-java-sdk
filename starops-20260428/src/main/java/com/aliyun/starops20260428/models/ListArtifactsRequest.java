// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListArtifactsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>missions/mission-xxx/artifacts/2026-05/05-01/</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsRequest self = new ListArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactsRequest setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
        return this;
    }
    public String getArtifactPath() {
        return this.artifactPath;
    }

    public ListArtifactsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
