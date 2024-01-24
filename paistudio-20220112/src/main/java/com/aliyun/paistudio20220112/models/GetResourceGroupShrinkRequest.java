// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupShrinkRequest extends TeaModel {
    @NameInMap("IsAIWorkspaceDataEnabled")
    public Boolean isAIWorkspaceDataEnabled;

    @NameInMap("Tag")
    public String tagShrink;

    public static GetResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupShrinkRequest self = new GetResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupShrinkRequest setIsAIWorkspaceDataEnabled(Boolean isAIWorkspaceDataEnabled) {
        this.isAIWorkspaceDataEnabled = isAIWorkspaceDataEnabled;
        return this;
    }
    public Boolean getIsAIWorkspaceDataEnabled() {
        return this.isAIWorkspaceDataEnabled;
    }

    public GetResourceGroupShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
