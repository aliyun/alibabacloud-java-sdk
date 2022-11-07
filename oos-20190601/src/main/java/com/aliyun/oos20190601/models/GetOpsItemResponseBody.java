// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetOpsItemResponseBody extends TeaModel {
    @NameInMap("OpsItem")
    public GetOpsItemResponseBodyOpsItem opsItem;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOpsItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpsItemResponseBody self = new GetOpsItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpsItemResponseBody setOpsItem(GetOpsItemResponseBodyOpsItem opsItem) {
        this.opsItem = opsItem;
        return this;
    }
    public GetOpsItemResponseBodyOpsItem getOpsItem() {
        return this.opsItem;
    }

    public GetOpsItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOpsItemResponseBodyOpsItem extends TeaModel {
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        @NameInMap("Category")
        public String category;

        @NameInMap("CreateBy")
        public String createBy;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DedupString")
        public String dedupString;

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
        public java.util.List<java.util.Map<String, ?>> solutions;

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

        public static GetOpsItemResponseBodyOpsItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpsItemResponseBodyOpsItem self = new GetOpsItemResponseBodyOpsItem();
            return TeaModel.build(map, self);
        }

        public GetOpsItemResponseBodyOpsItem setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public GetOpsItemResponseBodyOpsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetOpsItemResponseBodyOpsItem setCreateBy(String createBy) {
            this.createBy = createBy;
            return this;
        }
        public String getCreateBy() {
            return this.createBy;
        }

        public GetOpsItemResponseBodyOpsItem setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetOpsItemResponseBodyOpsItem setDedupString(String dedupString) {
            this.dedupString = dedupString;
            return this;
        }
        public String getDedupString() {
            return this.dedupString;
        }

        public GetOpsItemResponseBodyOpsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOpsItemResponseBodyOpsItem setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public GetOpsItemResponseBodyOpsItem setOpsItemId(String opsItemId) {
            this.opsItemId = opsItemId;
            return this;
        }
        public String getOpsItemId() {
            return this.opsItemId;
        }

        public GetOpsItemResponseBodyOpsItem setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetOpsItemResponseBodyOpsItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetOpsItemResponseBodyOpsItem setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public GetOpsItemResponseBodyOpsItem setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetOpsItemResponseBodyOpsItem setSolutions(java.util.List<java.util.Map<String, ?>> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSolutions() {
            return this.solutions;
        }

        public GetOpsItemResponseBodyOpsItem setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetOpsItemResponseBodyOpsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOpsItemResponseBodyOpsItem setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetOpsItemResponseBodyOpsItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetOpsItemResponseBodyOpsItem setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
