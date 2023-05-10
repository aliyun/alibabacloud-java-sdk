// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsResponseBody extends TeaModel {
    @NameInMap("DriftDetection")
    public GetFeatureDetailsResponseBodyDriftDetection driftDetection;

    /**
     * <p>The resource types that support the system tag `acs:ros:stackId`.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The names of properties that are supported by the resource type.</p>
     */
    @NameInMap("ResourceCleaner")
    public GetFeatureDetailsResponseBodyResourceCleaner resourceCleaner;

    @NameInMap("ResourceImport")
    public GetFeatureDetailsResponseBodyResourceImport resourceImport;

    @NameInMap("TemplateParameterConstraints")
    public GetFeatureDetailsResponseBodyTemplateParameterConstraints templateParameterConstraints;

    /**
     * <p>The names of the side effects. The StopInstance value indicates that an instance that is related to the specified resource is stopped.</p>
     */
    @NameInMap("TemplateScratch")
    public GetFeatureDetailsResponseBodyTemplateScratch templateScratch;

    /**
     * <p>The resource types that support the custom tag feature.</p>
     */
    @NameInMap("Terraform")
    public GetFeatureDetailsResponseBodyTerraform terraform;

    public static GetFeatureDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureDetailsResponseBody self = new GetFeatureDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureDetailsResponseBody setDriftDetection(GetFeatureDetailsResponseBodyDriftDetection driftDetection) {
        this.driftDetection = driftDetection;
        return this;
    }
    public GetFeatureDetailsResponseBodyDriftDetection getDriftDetection() {
        return this.driftDetection;
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

    public GetFeatureDetailsResponseBody setResourceImport(GetFeatureDetailsResponseBodyResourceImport resourceImport) {
        this.resourceImport = resourceImport;
        return this;
    }
    public GetFeatureDetailsResponseBodyResourceImport getResourceImport() {
        return this.resourceImport;
    }

    public GetFeatureDetailsResponseBody setTemplateParameterConstraints(GetFeatureDetailsResponseBodyTemplateParameterConstraints templateParameterConstraints) {
        this.templateParameterConstraints = templateParameterConstraints;
        return this;
    }
    public GetFeatureDetailsResponseBodyTemplateParameterConstraints getTemplateParameterConstraints() {
        return this.templateParameterConstraints;
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

    public static class GetFeatureDetailsResponseBodyDriftDetection extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public java.util.List<String> supportedResourceTypes;

        public static GetFeatureDetailsResponseBodyDriftDetection build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyDriftDetection self = new GetFeatureDetailsResponseBodyDriftDetection();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyDriftDetection setSupportedResourceTypes(java.util.List<String> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public java.util.List<String> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

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

    public static class GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes extends TeaModel {
        @NameInMap("ResourceIdentifiers")
        public java.util.List<String> resourceIdentifiers;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes self = new GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes setResourceIdentifiers(java.util.List<String> resourceIdentifiers) {
            this.resourceIdentifiers = resourceIdentifiers;
            return this;
        }
        public java.util.List<String> getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

        public GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetFeatureDetailsResponseBodyResourceImport extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public java.util.List<GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes> supportedResourceTypes;

        public static GetFeatureDetailsResponseBodyResourceImport build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyResourceImport self = new GetFeatureDetailsResponseBodyResourceImport();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyResourceImport setSupportedResourceTypes(java.util.List<GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyResourceImportSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

    }

    public static class GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes extends TeaModel {
        @NameInMap("Properties")
        public java.util.List<String> properties;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes self = new GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetFeatureDetailsResponseBodyTemplateParameterConstraints extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public java.util.List<GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes;

        public static GetFeatureDetailsResponseBodyTemplateParameterConstraints build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTemplateParameterConstraints self = new GetFeatureDetailsResponseBodyTemplateParameterConstraints();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTemplateParameterConstraints setSupportedResourceTypes(java.util.List<GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTemplateParameterConstraintsSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

    }

    public static class GetFeatureDetailsResponseBodyTemplateScratchSupportedResourceTypes extends TeaModel {
        /**
         * <p>Details of the template parameter constraint feature.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("SourceResourceGroupSupported")
        public Boolean sourceResourceGroupSupported;

        /**
         * <p>The resource types that support the template parameter constraint feature.</p>
         */
        @NameInMap("SourceResourcesSupported")
        public Boolean sourceResourcesSupported;

        /**
         * <p>The names of properties that are supported by the resource type.</p>
         */
        @NameInMap("SourceSupported")
        public Boolean sourceSupported;

        /**
         * <p>The resource types that support the template parameter constraint feature.</p>
         */
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
        /**
         * <p>The names of the side effects. The StopInstance value indicates that an instance that is related to the specified resource is stopped.</p>
         */
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

    public static class GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk extends TeaModel {
        /**
         * <p>The filters that are used to filter resources. Valid values:</p>
         * <br>
         * <p>*   RegionId: the ID of the region.</p>
         * <p>*   ResourceId: the ID of the resource.</p>
         * <p>*   ResourceName: the name of the resource.</p>
         * <p>*   Tags: the tags of the resource.</p>
         * <p>*   ResourceGroupId: the ID of the resource group.</p>
         * <p>*   DeletionProtection: the deletion protection feature.</p>
         */
        @NameInMap("DeleteStack")
        public java.util.List<String> deleteStack;

        public static GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk self = new GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk setDeleteStack(java.util.List<String> deleteStack) {
            this.deleteStack = deleteStack;
            return this;
        }
        public java.util.List<String> getDeleteStack() {
            return this.deleteStack;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes extends TeaModel {
        /**
         * <p>Indicates whether the resource scope can be specified by tag, resource group, or resource. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("CustomTag")
        public java.util.List<String> customTag;

        /**
         * <p>Indicates whether the resource scope can be specified by resource group. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("EstimateCost")
        public java.util.List<String> estimateCost;

        /**
         * <p>Details of the resource cleaner feature.</p>
         */
        @NameInMap("ResourceGroup")
        public java.util.List<String> resourceGroup;

        /**
         * <p>The resource type that can be cleaned up.</p>
         */
        @NameInMap("StackOperationRisk")
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk stackOperationRisk;

        /**
         * <p>The resource types that support the scenario feature.</p>
         */
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

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setStackOperationRisk(GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk stackOperationRisk) {
            this.stackOperationRisk = stackOperationRisk;
            return this;
        }
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypesStackOperationRisk getStackOperationRisk() {
            return this.stackOperationRisk;
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
        /**
         * <p>The resource types that support the price inquiry feature.</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The resource types that support the resource group feature.</p>
         */
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
        /**
         * <p>The resource types that support the price inquiry feature.</p>
         */
        @NameInMap("ProviderVersions")
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> providerVersions;

        /**
         * <p>The resource type that support the risk check feature.</p>
         */
        @NameInMap("TerraformVersion")
        public String terraformVersion;

        /**
         * <p>The resource types that support the risk check performed to detect risks caused by a stack deletion operation.</p>
         */
        @NameInMap("Transform")
        public String transform;

        /**
         * <p>The resource types that support the risk check performed to detect risks caused by a stack deletion operation.</p>
         */
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
        /**
         * <p>The resource types that support the scenario feature.</p>
         */
        @NameInMap("SupportedResourceTypes")
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes supportedResourceTypes;

        /**
         * <p>The resource types that support the custom tag feature.</p>
         */
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
