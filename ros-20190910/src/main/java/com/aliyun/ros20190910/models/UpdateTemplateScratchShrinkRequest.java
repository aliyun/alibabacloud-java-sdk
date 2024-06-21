// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li>Async (default)</li>
     * <li>Sync</li>
     * </ul>
     * <blockquote>
     * <p>If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you specify ClientToken to prevent the execution timeout.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The policy based on which the logical ID is generated. Valid values:</p>
     * <ul>
     * <li>LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix</li>
     * <li>LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</li>
     * <li>ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</li>
     * </ul>
     * <blockquote>
     * <p> If you set TemplateScratchType to ArchitectureDetection, the default value of LogicalIdStrategy is LongTypePrefixAndHashSuffix. In other cases, the default value of LogicalIdStrategy is LongTypePrefixAndIndexSuffix.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LongTypePrefixAndIndexSuffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The preference parameters of the resource scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public String preferenceParametersShrink;

    /**
     * <p>The region ID of the scenario.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source resource group.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceResourceGroup")
    public String sourceResourceGroupShrink;

    /**
     * <p>The source resources.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceResources")
    public String sourceResourcesShrink;

    /**
     * <p>The source tag.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceTag")
    public String sourceTagShrink;

    /**
     * <p>The ID of the resource scenario.</p>
     * <p>The valid values of the ParameterKey and ParameterValue request parameters vary based on the IDs of different types of resource scenarios. For more information, see the &quot;Additional information about request parameters&quot; section of this topic.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/610832.html">ListTemplateScratches</a> operation to query the ID of a resource scenario.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ts-7f7a704cf71c49a6****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static UpdateTemplateScratchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchShrinkRequest self = new UpdateTemplateScratchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTemplateScratchShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateScratchShrinkRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public UpdateTemplateScratchShrinkRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public UpdateTemplateScratchShrinkRequest setPreferenceParametersShrink(String preferenceParametersShrink) {
        this.preferenceParametersShrink = preferenceParametersShrink;
        return this;
    }
    public String getPreferenceParametersShrink() {
        return this.preferenceParametersShrink;
    }

    public UpdateTemplateScratchShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateScratchShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTemplateScratchShrinkRequest setSourceResourceGroupShrink(String sourceResourceGroupShrink) {
        this.sourceResourceGroupShrink = sourceResourceGroupShrink;
        return this;
    }
    public String getSourceResourceGroupShrink() {
        return this.sourceResourceGroupShrink;
    }

    public UpdateTemplateScratchShrinkRequest setSourceResourcesShrink(String sourceResourcesShrink) {
        this.sourceResourcesShrink = sourceResourcesShrink;
        return this;
    }
    public String getSourceResourcesShrink() {
        return this.sourceResourcesShrink;
    }

    public UpdateTemplateScratchShrinkRequest setSourceTagShrink(String sourceTagShrink) {
        this.sourceTagShrink = sourceTagShrink;
        return this;
    }
    public String getSourceTagShrink() {
        return this.sourceTagShrink;
    }

    public UpdateTemplateScratchShrinkRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

}
