// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceCleaner")
    public GetFeatureDetailsResponseBodyResourceCleaner resourceCleaner;

    @NameInMap("TemplateScratch")
    public GetFeatureDetailsResponseBodyTemplateScratch templateScratch;

    @NameInMap("Terraform")
    public GetFeatureDetailsResponseBodyTerraform terraform;

    public static GetFeatureDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureDetailsResponseBody self = new GetFeatureDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureDetailsResponseBody setResourceCleaner(GetFeatureDetailsResponseBodyResourceCleaner resourceCleaner) {
        this.resourceCleaner = resourceCleaner;
        return this;
    }
    public GetFeatureDetailsResponseBodyResourceCleaner getResourceCleaner() {
        return this.resourceCleaner;
    }

    public GetFeatureDetailsResponseBody setTemplateScratch(GetFeatureDetailsResponseBodyTemplateScratch templateScratch) {
        this.templateScratch = templateScratch;
        return this;
    }
    public GetFeatureDetailsResponseBodyTemplateScratch getTemplateScratch() {
        return this.templateScratch;
    }

    public GetFeatureDetailsResponseBody setTerraform(GetFeatureDetailsResponseBodyTerraform terraform) {
        this.terraform = terraform;
        return this;
    }
    public GetFeatureDetailsResponseBodyTerraform getTerraform() {
        return this.terraform;
    }

    public static class GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SideEffects")
        public java.util.List<String> sideEffects;

        @NameInMap("SupportedFilters")
        public java.util.List<String> supportedFilters;

        public static GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes self = new GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes setSideEffects(java.util.List<String> sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }
        public java.util.List<String> getSideEffects() {
            return this.sideEffects;
        }

        public GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes setSupportedFilters(java.util.List<String> supportedFilters) {
            this.supportedFilters = supportedFilters;
            return this;
        }
        public java.util.List<String> getSupportedFilters() {
            return this.supportedFilters;
        }

    }

    public static class GetFeatureDetailsResponseBodyResourceCleaner extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public java.util.List<GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes> supportedResourceTypes;

        public static GetFeatureDetailsResponseBodyResourceCleaner build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyResourceCleaner self = new GetFeatureDetailsResponseBodyResourceCleaner();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyResourceCleaner setSupportedResourceTypes(java.util.List<GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyResourceCleanerSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

    }

    public static class GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SourceResourceGroupSupported")
        public Boolean sourceResourceGroupSupported;

        @NameInMap("SourceResourcesSupported")
        public Boolean sourceResourcesSupported;

        @NameInMap("SourceSupported")
        public Boolean sourceSupported;

        @NameInMap("SourceTagSupported")
        public Boolean sourceTagSupported;

        public static GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes self = new GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes setSourceResourceGroupSupported(Boolean sourceResourceGroupSupported) {
            this.sourceResourceGroupSupported = sourceResourceGroupSupported;
            return this;
        }
        public Boolean getSourceResourceGroupSupported() {
            return this.sourceResourceGroupSupported;
        }

        public GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes setSourceResourcesSupported(Boolean sourceResourcesSupported) {
            this.sourceResourcesSupported = sourceResourcesSupported;
            return this;
        }
        public Boolean getSourceResourcesSupported() {
            return this.sourceResourcesSupported;
        }

        public GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes setSourceSupported(Boolean sourceSupported) {
            this.sourceSupported = sourceSupported;
            return this;
        }
        public Boolean getSourceSupported() {
            return this.sourceSupported;
        }

        public GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes setSourceTagSupported(Boolean sourceTagSupported) {
            this.sourceTagSupported = sourceTagSupported;
            return this;
        }
        public Boolean getSourceTagSupported() {
            return this.sourceTagSupported;
        }

    }

    public static class GetFeatureDetailsResponseBodyTemplateScratch extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public java.util.List<GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes> supportedResourceTypes;

        public static GetFeatureDetailsResponseBodyTemplateScratch build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTemplateScratch self = new GetFeatureDetailsResponseBodyTemplateScratch();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTemplateScratch setSupportedResourceTypes(java.util.List<GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes extends TeaModel {
        @NameInMap("CustomTag")
        public java.util.List<String> customTag;

        @NameInMap("EstimateCost")
        public java.util.List<String> estimateCost;

        @NameInMap("ResourceGroup")
        public java.util.List<String> resourceGroup;

        @NameInMap("SystemTag")
        public java.util.List<String> systemTag;

        public static GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes self = new GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setCustomTag(java.util.List<String> customTag) {
            this.customTag = customTag;
            return this;
        }
        public java.util.List<String> getCustomTag() {
            return this.customTag;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setEstimateCost(java.util.List<String> estimateCost) {
            this.estimateCost = estimateCost;
            return this;
        }
        public java.util.List<String> getEstimateCost() {
            return this.estimateCost;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setResourceGroup(java.util.List<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public java.util.List<String> getResourceGroup() {
            return this.resourceGroup;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setSystemTag(java.util.List<String> systemTag) {
            this.systemTag = systemTag;
            return this;
        }
        public java.util.List<String> getSystemTag() {
            return this.systemTag;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions extends TeaModel {
        @NameInMap("ProviderName")
        public String providerName;

        @NameInMap("SupportedVersions")
        public java.util.List<String> supportedVersions;

        public static GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions self = new GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions setSupportedVersions(java.util.List<String> supportedVersions) {
            this.supportedVersions = supportedVersions;
            return this;
        }
        public java.util.List<String> getSupportedVersions() {
            return this.supportedVersions;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedVersions extends TeaModel {
        @NameInMap("ProviderVersions")
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> providerVersions;

        @NameInMap("TerraformVersion")
        public String terraformVersion;

        @NameInMap("Transform")
        public String transform;

        @NameInMap("UpdateAllowedTransforms")
        public java.util.List<String> updateAllowedTransforms;

        public static GetFeatureDetailsResponseBodyTerraformSupportedVersions build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedVersions self = new GetFeatureDetailsResponseBodyTerraformSupportedVersions();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setProviderVersions(java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> providerVersions) {
            this.providerVersions = providerVersions;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> getProviderVersions() {
            return this.providerVersions;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setTransform(String transform) {
            this.transform = transform;
            return this;
        }
        public String getTransform() {
            return this.transform;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setUpdateAllowedTransforms(java.util.List<String> updateAllowedTransforms) {
            this.updateAllowedTransforms = updateAllowedTransforms;
            return this;
        }
        public java.util.List<String> getUpdateAllowedTransforms() {
            return this.updateAllowedTransforms;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraform extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes supportedResourceTypes;

        @NameInMap("SupportedVersions")
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> supportedVersions;

        public static GetFeatureDetailsResponseBodyTerraform build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraform self = new GetFeatureDetailsResponseBodyTerraform();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraform setSupportedResourceTypes(GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public GetFeatureDetailsResponseBodyTerraform setSupportedVersions(java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> supportedVersions) {
            this.supportedVersions = supportedVersions;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> getSupportedVersions() {
            return this.supportedVersions;
        }

    }

}
