// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecutionMode")
    public String executionMode;

    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    @NameInMap("PreferenceParameters")
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceResourceGroup")
    public UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    @NameInMap("SourceResources")
    public java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources;

    @NameInMap("SourceTag")
    public UpdateTemplateScratchRequestSourceTag sourceTag;

    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static UpdateTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchRequest self = new UpdateTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTemplateScratchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateScratchRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public UpdateTemplateScratchRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public UpdateTemplateScratchRequest setPreferenceParameters(java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters) {
        this.preferenceParameters = preferenceParameters;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    public UpdateTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateScratchRequest setSourceResourceGroup(UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }
    public UpdateTemplateScratchRequestSourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    public UpdateTemplateScratchRequest setSourceResources(java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources) {
        this.sourceResources = sourceResources;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestSourceResources> getSourceResources() {
        return this.sourceResources;
    }

    public UpdateTemplateScratchRequest setSourceTag(UpdateTemplateScratchRequestSourceTag sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }
    public UpdateTemplateScratchRequestSourceTag getSourceTag() {
        return this.sourceTag;
    }

    public UpdateTemplateScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static class UpdateTemplateScratchRequestPreferenceParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateTemplateScratchRequestPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestPreferenceParameters self = new UpdateTemplateScratchRequestPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResourceGroup extends TeaModel {
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static UpdateTemplateScratchRequestSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResourceGroup self = new UpdateTemplateScratchRequestSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static UpdateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResources self = new UpdateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateTemplateScratchRequestSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class UpdateTemplateScratchRequestSourceTag extends TeaModel {
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static UpdateTemplateScratchRequestSourceTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceTag self = new UpdateTemplateScratchRequestSourceTag();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

}
