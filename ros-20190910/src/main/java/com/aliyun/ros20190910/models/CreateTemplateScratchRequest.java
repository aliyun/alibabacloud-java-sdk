// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecutionMode")
    public String executionMode;

    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    @NameInMap("PreferenceParameters")
    public java.util.List<CreateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceResourceGroup")
    public CreateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    @NameInMap("SourceResources")
    public java.util.List<CreateTemplateScratchRequestSourceResources> sourceResources;

    @NameInMap("SourceTag")
    public CreateTemplateScratchRequestSourceTag sourceTag;

    @NameInMap("TemplateScratchType")
    public String templateScratchType;

    public static CreateTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateScratchRequest self = new CreateTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateScratchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateScratchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateScratchRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateTemplateScratchRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public CreateTemplateScratchRequest setPreferenceParameters(java.util.List<CreateTemplateScratchRequestPreferenceParameters> preferenceParameters) {
        this.preferenceParameters = preferenceParameters;
        return this;
    }
    public java.util.List<CreateTemplateScratchRequestPreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    public CreateTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateScratchRequest setSourceResourceGroup(CreateTemplateScratchRequestSourceResourceGroup sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }
    public CreateTemplateScratchRequestSourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    public CreateTemplateScratchRequest setSourceResources(java.util.List<CreateTemplateScratchRequestSourceResources> sourceResources) {
        this.sourceResources = sourceResources;
        return this;
    }
    public java.util.List<CreateTemplateScratchRequestSourceResources> getSourceResources() {
        return this.sourceResources;
    }

    public CreateTemplateScratchRequest setSourceTag(CreateTemplateScratchRequestSourceTag sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }
    public CreateTemplateScratchRequestSourceTag getSourceTag() {
        return this.sourceTag;
    }

    public CreateTemplateScratchRequest setTemplateScratchType(String templateScratchType) {
        this.templateScratchType = templateScratchType;
        return this;
    }
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static class CreateTemplateScratchRequestPreferenceParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateTemplateScratchRequestPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestPreferenceParameters self = new CreateTemplateScratchRequestPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateTemplateScratchRequestPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateTemplateScratchRequestSourceResourceGroup extends TeaModel {
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static CreateTemplateScratchRequestSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceResourceGroup self = new CreateTemplateScratchRequestSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateTemplateScratchRequestSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class CreateTemplateScratchRequestSourceResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceResources self = new CreateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateTemplateScratchRequestSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateTemplateScratchRequestSourceTag extends TeaModel {
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static CreateTemplateScratchRequestSourceTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceTag self = new CreateTemplateScratchRequestSourceTag();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public CreateTemplateScratchRequestSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

}
