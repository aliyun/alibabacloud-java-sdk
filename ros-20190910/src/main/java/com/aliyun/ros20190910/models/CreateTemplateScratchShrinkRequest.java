// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode. Valid values:</p>
     * <br>
     * <p>*   Async (default)</p>
     * <p>*   Sync</p>
     * <br>
     * <p>> If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you specify ClientToken to prevent the execution timeout.</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The policy based on which the logical ID is generated. Valid values:</p>
     * <br>
     * <p>*   LongTypePrefixAndIndexSuffix (default): long-type prefix + index-type suffix</p>
     * <p>*   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</p>
     * <p>*   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The preference parameters of the scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public String preferenceParametersShrink;

    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source resource group.</p>
     */
    @NameInMap("SourceResourceGroup")
    public String sourceResourceGroupShrink;

    /**
     * <p>The source resources.</p>
     */
    @NameInMap("SourceResources")
    public String sourceResourcesShrink;

    /**
     * <p>The source tag.</p>
     */
    @NameInMap("SourceTag")
    public String sourceTagShrink;

    /**
     * <p>The tags of the scenario.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateTemplateScratchShrinkRequestTags> tags;

    /**
     * <p>The type of the scenario. Valid values:</p>
     * <br>
     * <p>*   ResourceImport: resource management</p>
     * <p>*   ArchitectureReplication: resource replication</p>
     * <p>*   ResourceMigration: resource migration</p>
     */
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

    public CreateTemplateScratchShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateTemplateScratchShrinkRequest setTags(java.util.List<CreateTemplateScratchShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTemplateScratchShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateTemplateScratchShrinkRequest setTemplateScratchType(String templateScratchType) {
        this.templateScratchType = templateScratchType;
        return this;
    }
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static class CreateTemplateScratchShrinkRequestTags extends TeaModel {
        /**
         * <p>The tag key of the scenario.</p>
         * <br>
         * <p>> Tags is optional. If you want to specify Tags, you must specify Key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scenario.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTemplateScratchShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchShrinkRequestTags self = new CreateTemplateScratchShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateScratchShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
