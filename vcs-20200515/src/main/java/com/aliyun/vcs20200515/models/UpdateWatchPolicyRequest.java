// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateWatchPolicyRequest extends TeaModel {
    @NameInMap("ItemMatchType")
    public String itemMatchType;

    @NameInMap("SimilarityThreshold")
    public Double similarityThreshold;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("WatchMode")
    public String watchMode;

    @NameInMap("WatchPolicyId")
    public String watchPolicyId;

    @NameInMap("WatchPolicyName")
    public String watchPolicyName;

    public static UpdateWatchPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatchPolicyRequest self = new UpdateWatchPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWatchPolicyRequest setItemMatchType(String itemMatchType) {
        this.itemMatchType = itemMatchType;
        return this;
    }
    public String getItemMatchType() {
        return this.itemMatchType;
    }

    public UpdateWatchPolicyRequest setSimilarityThreshold(Double similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    public UpdateWatchPolicyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateWatchPolicyRequest setWatchMode(String watchMode) {
        this.watchMode = watchMode;
        return this;
    }
    public String getWatchMode() {
        return this.watchMode;
    }

    public UpdateWatchPolicyRequest setWatchPolicyId(String watchPolicyId) {
        this.watchPolicyId = watchPolicyId;
        return this;
    }
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    public UpdateWatchPolicyRequest setWatchPolicyName(String watchPolicyName) {
        this.watchPolicyName = watchPolicyName;
        return this;
    }
    public String getWatchPolicyName() {
        return this.watchPolicyName;
    }

}
