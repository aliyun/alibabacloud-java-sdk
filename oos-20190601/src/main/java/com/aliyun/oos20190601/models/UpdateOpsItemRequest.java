// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemRequest extends TeaModel {
    /**
     * <p>The category.</p>
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
     * <p>DASKJJLKADS-AHKLJHJSAKL-AJK</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The string to be deduplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_instance_SystemMaintenance.Reboot</p>
     */
    @NameInMap("DedupString")
    public String dedupString;

    /**
     * <p>The description of the O\&amp;M item.</p>
     * 
     * <strong>example:</strong>
     * <p>test-update</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the O\&amp;M item.</p>
     * 
     * <strong>example:</strong>
     * <p>oi-e2264dcf040c472598e9</p>
     */
    @NameInMap("OpsItemId")
    public String opsItemId;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>The Alibaba Resource Names (ARNs) of the associated resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;arn:acs:ecs:cn-heyuan:1139354755361920:instance/i-f8z928h7aqotd3o65032\&quot;]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The severity level.</p>
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
     * <p>[{\n \\&quot;priority\\&quot;:3,\n \\&quot;type\\&quot;:\\&quot;url\\&quot;,\n \\&quot;url\\&quot;:\\&quot;<a href="https://example.com%5C%5C%5C%5C%22,%5C%5Cn">https://example.com\\\\&quot;,\\n</a> \\&quot;description\\&quot;:\\&quot;Specify a cross-zone high availability cluster. \\&quot;\n}]</p>
     */
    @NameInMap("Solutions")
    public String solutions;

    /**
     * <p>The source business.</p>
     * 
     * <strong>example:</strong>
     * <p>/aliyun/ecs</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("Status")
    public String status;

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
    public java.util.Map<String, ?> tags;

    /**
     * <p>The title of the O\&amp;M item.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateOpsItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpsItemRequest self = new UpdateOpsItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOpsItemRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateOpsItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateOpsItemRequest setDedupString(String dedupString) {
        this.dedupString = dedupString;
        return this;
    }
    public String getDedupString() {
        return this.dedupString;
    }

    public UpdateOpsItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOpsItemRequest setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
        return this;
    }
    public String getOpsItemId() {
        return this.opsItemId;
    }

    public UpdateOpsItemRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateOpsItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateOpsItemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateOpsItemRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public UpdateOpsItemRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public UpdateOpsItemRequest setSolutions(String solutions) {
        this.solutions = solutions;
        return this;
    }
    public String getSolutions() {
        return this.solutions;
    }

    public UpdateOpsItemRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateOpsItemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateOpsItemRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public UpdateOpsItemRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
