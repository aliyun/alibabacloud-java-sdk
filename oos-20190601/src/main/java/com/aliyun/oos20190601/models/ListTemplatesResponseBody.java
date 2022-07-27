// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTemplates(java.util.List<ListTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("Popularity")
        public Integer popularity;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("TemplateFormat")
        public String templateFormat;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("TotalExecutionCount")
        public Integer totalExecutionCount;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplates self = new ListTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTemplatesResponseBodyTemplates setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListTemplatesResponseBodyTemplates setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyTemplates setHasTrigger(Boolean hasTrigger) {
            this.hasTrigger = hasTrigger;
            return this;
        }
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        public ListTemplatesResponseBodyTemplates setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public ListTemplatesResponseBodyTemplates setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }
        public Integer getPopularity() {
            return this.popularity;
        }

        public ListTemplatesResponseBodyTemplates setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTemplatesResponseBodyTemplates setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListTemplatesResponseBodyTemplates setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListTemplatesResponseBodyTemplates setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public ListTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseBodyTemplates setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListTemplatesResponseBodyTemplates setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplatesResponseBodyTemplates setTotalExecutionCount(Integer totalExecutionCount) {
            this.totalExecutionCount = totalExecutionCount;
            return this;
        }
        public Integer getTotalExecutionCount() {
            return this.totalExecutionCount;
        }

        public ListTemplatesResponseBodyTemplates setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListTemplatesResponseBodyTemplates setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
