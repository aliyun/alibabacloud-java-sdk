// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemResponseBody extends TeaModel {
    /**
     * <p>The information about the O\&amp;M item.</p>
     */
    @NameInMap("OpsItem")
    public UpdateOpsItemResponseBodyOpsItem opsItem;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C996DECB-3D2B-5321-B359-BE7031B6399E</p>
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
         * <p>The attributes of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Attribute\&quot;: {\&quot;Weight\&quot;: 100}, \&quot;RealServer\&quot;: \&quot;uaejc8hnqzqz5valyh8dibolpvza48ik.yundunwaf5.com\&quot;}]</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the O\&amp;M item was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T07:04Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The user who created the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test-update</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user who modified the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
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
         * 
         * <strong>example:</strong>
         * <p>Medium</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The solutions.</p>
         */
        @NameInMap("Solutions")
        public java.util.List<String> solutions;

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

        /**
         * <p>The time when the O\&amp;M item was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T08:04Z</p>
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
