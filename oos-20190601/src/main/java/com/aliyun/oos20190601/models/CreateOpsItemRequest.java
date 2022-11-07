// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedupString")
    public String dedupString;

    @NameInMap("Description")
    public String description;

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

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Title")
    public String title;

    public static CreateOpsItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpsItemRequest self = new CreateOpsItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpsItemRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateOpsItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOpsItemRequest setDedupString(String dedupString) {
        this.dedupString = dedupString;
        return this;
    }
    public String getDedupString() {
        return this.dedupString;
    }

    public CreateOpsItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOpsItemRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateOpsItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOpsItemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateOpsItemRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public CreateOpsItemRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CreateOpsItemRequest setSolutions(String solutions) {
        this.solutions = solutions;
        return this;
    }
    public String getSolutions() {
        return this.solutions;
    }

    public CreateOpsItemRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOpsItemRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateOpsItemRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
