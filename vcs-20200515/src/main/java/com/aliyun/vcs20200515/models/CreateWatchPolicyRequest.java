// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchPolicyRequest extends TeaModel {
    @NameInMap("ItemMatchType")
    public String itemMatchType;

    @NameInMap("SimilarityThreshold")
    public Double similarityThreshold;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("WatchMode")
    public String watchMode;

    @NameInMap("WatchPolicyName")
    public String watchPolicyName;

    public static CreateWatchPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchPolicyRequest self = new CreateWatchPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateWatchPolicyRequest setItemMatchType(String itemMatchType) {
        this.itemMatchType = itemMatchType;
        return this;
    }
    public String getItemMatchType() {
        return this.itemMatchType;
    }

    public CreateWatchPolicyRequest setSimilarityThreshold(Double similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    public CreateWatchPolicyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateWatchPolicyRequest setWatchMode(String watchMode) {
        this.watchMode = watchMode;
        return this;
    }
    public String getWatchMode() {
        return this.watchMode;
    }

    public CreateWatchPolicyRequest setWatchPolicyName(String watchPolicyName) {
        this.watchPolicyName = watchPolicyName;
        return this;
    }
    public String getWatchPolicyName() {
        return this.watchPolicyName;
    }

}
