// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemResponseBody extends TeaModel {
    @NameInMap("OpsItem")
    public UpdateOpsItemResponseBodyOpsItem opsItem;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOpsItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpsItemResponseBody self = new UpdateOpsItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOpsItemResponseBody setOpsItem(UpdateOpsItemResponseBodyOpsItem opsItem) {
        this.opsItem = opsItem;
        return this;
    }
    public UpdateOpsItemResponseBodyOpsItem getOpsItem() {
        return this.opsItem;
    }

    public UpdateOpsItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateOpsItemResponseBodyOpsItem extends TeaModel {
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
        public java.util.List<String> resources;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Solutions")
        public java.util.List<String> solutions;

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

        public static UpdateOpsItemResponseBodyOpsItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpsItemResponseBodyOpsItem self = new UpdateOpsItemResponseBodyOpsItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpsItemResponseBodyOpsItem setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public UpdateOpsItemResponseBodyOpsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateOpsItemResponseBodyOpsItem setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateOpsItemResponseBodyOpsItem setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdateOpsItemResponseBodyOpsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateOpsItemResponseBodyOpsItem setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public UpdateOpsItemResponseBodyOpsItem setOpsItemId(String opsItemId) {
            this.opsItemId = opsItemId;
            return this;
        }
        public String getOpsItemId() {
            return this.opsItemId;
        }

        public UpdateOpsItemResponseBodyOpsItem setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateOpsItemResponseBodyOpsItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateOpsItemResponseBodyOpsItem setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public UpdateOpsItemResponseBodyOpsItem setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public UpdateOpsItemResponseBodyOpsItem setSolutions(java.util.List<String> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<String> getSolutions() {
            return this.solutions;
        }

        public UpdateOpsItemResponseBodyOpsItem setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateOpsItemResponseBodyOpsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateOpsItemResponseBodyOpsItem setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public UpdateOpsItemResponseBodyOpsItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateOpsItemResponseBodyOpsItem setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
