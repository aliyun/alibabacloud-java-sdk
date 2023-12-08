// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemResponseBody extends TeaModel {
    /**
     * <p>The information about the O\&M item.</p>
     */
    @NameInMap("OpsItem")
    public CreateOpsItemResponseBodyOpsItem opsItem;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The attributes of the O\&M item.</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The category of the O\&M item.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the O\&M item was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The user who created the O\&M item.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The description of the O\&M item.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user who last modified the O\&M item.</p>
         */
        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        /**
         * <p>The ID of the O\&M item.</p>
         */
        @NameInMap("OpsItemId")
        public String opsItemId;

        /**
         * <p>The priority of the O\&M item.</p>
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
        public String resources;

        /**
         * <p>The severity level of the O\&M item.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The solutions.</p>
         */
        @NameInMap("Solutions")
        public String solutions;

        /**
         * <p>The source business of the O\&M item.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The state of the O\&M item.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the O\&M item.</p>
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
