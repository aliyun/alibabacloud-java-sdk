// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagWeightRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RankWeights")
    public java.util.Map<String, Double> rankWeights;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppRagWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagWeightRequest self = new UpdateMmAppRagWeightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagWeightRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppRagWeightRequest setRankWeights(java.util.Map<String, Double> rankWeights) {
        this.rankWeights = rankWeights;
        return this;
    }
    public java.util.Map<String, Double> getRankWeights() {
        return this.rankWeights;
    }

    public UpdateMmAppRagWeightRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
