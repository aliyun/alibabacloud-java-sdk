// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemResponseBody extends TeaModel {
    @NameInMap("OpsItem")
    public CreateOpsItemResponseBodyOpsItem opsItem;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOpsItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOpsItemResponseBody self = new CreateOpsItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOpsItemResponseBody setOpsItem(CreateOpsItemResponseBodyOpsItem opsItem) {
        this.opsItem = opsItem;
        return this;
    }
    public CreateOpsItemResponseBodyOpsItem getOpsItem() {
        return this.opsItem;
    }

    public CreateOpsItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOpsItemResponseBodyOpsItem extends TeaModel {
        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("Category")
        public String category;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("Description")
        public String description;

        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        @NameInMap("OpsItemId")
        public String opsItemId;

        @NameInMap("Priority")
        public Integer priority;

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

        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateOpsItemResponseBodyOpsItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpsItemResponseBodyOpsItem self = new CreateOpsItemResponseBodyOpsItem();
            return TeaModel.build(map, self);
        }

        public CreateOpsItemResponseBodyOpsItem setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateOpsItemResponseBodyOpsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateOpsItemResponseBodyOpsItem setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateOpsItemResponseBodyOpsItem setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreateOpsItemResponseBodyOpsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOpsItemResponseBodyOpsItem setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public CreateOpsItemResponseBodyOpsItem setOpsItemId(String opsItemId) {
            this.opsItemId = opsItemId;
            return this;
        }
        public String getOpsItemId() {
            return this.opsItemId;
        }

        public CreateOpsItemResponseBodyOpsItem setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateOpsItemResponseBodyOpsItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateOpsItemResponseBodyOpsItem setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public CreateOpsItemResponseBodyOpsItem setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public CreateOpsItemResponseBodyOpsItem setSolutions(String solutions) {
            this.solutions = solutions;
            return this;
        }
        public String getSolutions() {
            return this.solutions;
        }

        public CreateOpsItemResponseBodyOpsItem setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateOpsItemResponseBodyOpsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateOpsItemResponseBodyOpsItem setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public CreateOpsItemResponseBodyOpsItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateOpsItemResponseBodyOpsItem setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
