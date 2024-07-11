// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemShrinkRequest extends TeaModel {
    /**
     * <p>The category.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Availability</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Performance</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Security</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Cost</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Recovery</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Security</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e56767-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The string to be deduplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_instance_Sys</p>
     */
    @NameInMap("DedupString")
    public String dedupString;

    /**
     * <p>The description of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>OpsItem</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The priority. Valid values: 1 to 5. 1 indicates the highest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID.</p>
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
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Alibaba Cloud Resource Names (ARNs) of the associated resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;acs:oos:cn-hangzhou:1563457855438522:application/test-33333/applicationgroup/default-cn-hangzhou-1\&quot;]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The severity level.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>High</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Low</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Medium</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Critical</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Medium</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The solutions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\n \\&quot;priority\\&quot;:3,\n \\&quot;type\\&quot;:\\&quot;SingleAZEcs\\&quot;,\n \\&quot;url\\&quot;:\\&quot;<a href="http://ecs.consle.aliyuncs.com%5C%5C%5C%5C%22,%5C%5Cn">http://ecs.consle.aliyuncs.com\\\\&quot;,\\n</a> \\&quot;description\\&quot;:\\&quot;Create Elastic Compute Service (ECS) instances in different zones and import them to an application group.\\&quot;\n}]</p>
     */
    @NameInMap("Solutions")
    public String solutions;

    /**
     * <p>The source business.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/aliyun/ecs</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;k1&quot;: &quot;v1&quot;,
     *       &quot;k2&quot;: &quot;v2&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The title of the O\&amp;M item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS reboot is scheduled</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateOpsItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpsItemShrinkRequest self = new CreateOpsItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpsItemShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateOpsItemShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOpsItemShrinkRequest setDedupString(String dedupString) {
        this.dedupString = dedupString;
        return this;
    }
    public String getDedupString() {
        return this.dedupString;
    }

    public CreateOpsItemShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOpsItemShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateOpsItemShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOpsItemShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateOpsItemShrinkRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public CreateOpsItemShrinkRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CreateOpsItemShrinkRequest setSolutions(String solutions) {
        this.solutions = solutions;
        return this;
    }
    public String getSolutions() {
        return this.solutions;
    }

    public CreateOpsItemShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOpsItemShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateOpsItemShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
