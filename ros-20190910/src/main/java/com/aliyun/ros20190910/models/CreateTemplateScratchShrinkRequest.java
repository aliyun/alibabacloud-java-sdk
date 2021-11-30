// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecutionMode")
    public String executionMode;

    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    @NameInMap("PreferenceParameters")
    public String preferenceParametersShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceResourceGroup")
    public String sourceResourceGroupShrink;

    @NameInMap("SourceResources")
    public String sourceResourcesShrink;

    @NameInMap("SourceTag")
    public String sourceTagShrink;

    @NameInMap("TemplateScratchType")
    public String templateScratchType;

    public static CreateTemplateScratchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateScratchShrinkRequest self = new CreateTemplateScratchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateScratchShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateScratchShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateScratchShrinkRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateTemplateScratchShrinkRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public CreateTemplateScratchShrinkRequest setPreferenceParametersShrink(String preferenceParametersShrink) {
        this.preferenceParametersShrink = preferenceParametersShrink;
        return this;
    }
    public String getPreferenceParametersShrink() {
        return this.preferenceParametersShrink;
    }

    public CreateTemplateScratchShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateScratchShrinkRequest setSourceResourceGroupShrink(String sourceResourceGroupShrink) {
        this.sourceResourceGroupShrink = sourceResourceGroupShrink;
        return this;
    }
    public String getSourceResourceGroupShrink() {
        return this.sourceResourceGroupShrink;
    }

    public CreateTemplateScratchShrinkRequest setSourceResourcesShrink(String sourceResourcesShrink) {
        this.sourceResourcesShrink = sourceResourcesShrink;
        return this;
    }
    public String getSourceResourcesShrink() {
        return this.sourceResourcesShrink;
    }

    public CreateTemplateScratchShrinkRequest setSourceTagShrink(String sourceTagShrink) {
        this.sourceTagShrink = sourceTagShrink;
        return this;
    }
    public String getSourceTagShrink() {
        return this.sourceTagShrink;
    }

    public CreateTemplateScratchShrinkRequest setTemplateScratchType(String templateScratchType) {
        this.templateScratchType = templateScratchType;
        return this;
    }
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

}
