// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedupString")
    public String dedupString;

    @NameInMap("Description")
    public String description;

    @NameInMap("OpsItemId")
    public String opsItemId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Solutions")
    public String solutions;

    @NameInMap("Source")
    public String source;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

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
