// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemResponseBody extends TeaModel {
    /**
     * <p>The information about the O\&amp;M item.</p>
     */
    @NameInMap("OpsItem")
    public CreateOpsItemResponseBodyOpsItem opsItem;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
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
         * <p>The attributes of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;regionId\&quot;:\&quot;cn-zhangjiakou\&quot;,\&quot;appId\&quot;:\&quot;992BKO1X75GRQ4E8\&quot;,\&quot;instanceId\&quot;:\&quot;i-8vbcymxagqsyyyjppbr4\&quot;,\&quot;instance_name\&quot;:\&quot;cdae\&quot;}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The category of the O\&amp;M item.</p>
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
         * <p>2023-03-24T03:55Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The user who created the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The description of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>OpsItem</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user who last modified the O\&amp;M item.</p>
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
         * <p>oi-dba9c6eec9254a4d87c1</p>
         */
        @NameInMap("OpsItemId")
        public String opsItemId;

        /**
         * <p>The priority of the O\&amp;M item.</p>
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
         * 
         * <strong>example:</strong>
         * <p>[\&quot;acs:oos:cn-hangzhou:1563457855438522:application/dingTest/applicationgroup/fltest\&quot;]</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The severity level of the O\&amp;M item.</p>
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
         * <p>[{\n \\&quot;priority\\&quot;:3,\n \\&quot;type\\&quot;:\\&quot;url\\&quot;,\n \\&quot;url\\&quot;:\\&quot;<a href="https://example..com%5C%5C%5C%5C%22,%5C%5Cn">https://example..com\\\\&quot;,\\n</a> \\&quot;description\\&quot;:\\&quot;Specify a cross-zone high availability cluster. \\&quot;\n}]</p>
         */
        @NameInMap("Solutions")
        public String solutions;

        /**
         * <p>The source business of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>/aliyun/ecs</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The state of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The title of the O\&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS reboot is scheduled</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the O\&amp;M item was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-24T03:55Z</p>
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
