// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable AI workspace data. This parameter is optional. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAIWorkspaceDataEnabled")
    public Boolean isAIWorkspaceDataEnabled;

    /**
     * <p>The list of tags to be added. A maximum of 20 tags can be added.</p>
     */
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
