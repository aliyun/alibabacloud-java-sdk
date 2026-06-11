// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagWeightShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RankWeights")
    public String rankWeightsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppRagWeightShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagWeightShrinkRequest self = new UpdateMmAppRagWeightShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagWeightShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppRagWeightShrinkRequest setRankWeightsShrink(String rankWeightsShrink) {
        this.rankWeightsShrink = rankWeightsShrink;
        return this;
    }
    public String getRankWeightsShrink() {
        return this.rankWeightsShrink;
    }

    public UpdateMmAppRagWeightShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
