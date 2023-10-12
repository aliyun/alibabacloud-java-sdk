// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemResponseBody extends TeaModel {
    /**
     * <p>The O\&M item.</p>
     */
    @NameInMap("OpsItem")
    public UpdateOpsItemResponseBodyOpsItem opsItem;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The information about the properties of the O\&M item.</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The category.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the O\&M item was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The user who created the patch baseline.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user who modified the O\&M item.</p>
         */
        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        /**
         * <p>The ID of the O\&M item.</p>
         */
        @NameInMap("OpsItemId")
        public String opsItemId;

        /**
         * <p>The priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ARNs of the associated resources.</p>
         */
        @NameInMap("Resources")
        public java.util.List<String> resources;

        /**
         * <p>The severity level.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The list of solutions.</p>
         */
        @NameInMap("Solutions")
        public java.util.List<String> solutions;

        /**
         * <p>The source business.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The title of the O\&M item.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the O\&M item was updated.</p>
         */
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
