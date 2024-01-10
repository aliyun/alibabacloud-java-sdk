// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the template.</p>
     */
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
        /**
         * <p>The type of the template.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The constraints of template</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the template.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the template was created.</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the template is configured with a trigger.</p>
         */
        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        /**
         * <p>The SHA-256 value of the template content.</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <p>The template is favorite or not.</p>
         */
        @NameInMap("IsFavorite")
        public Boolean isFavorite;

        /**
         * <p>The popularity of the public template. Valid values: **1-10**. A greater value indicates higher popularity. If the **ShareType** parameter is set to **Private**, the value of this parameter is `-1`.</p>
         * <br>
         * <p>**Notes** This parameter is valid only if the value of the **ShareType** parameter is set to **Public**.</p>
         */
        @NameInMap("Popularity")
        public Integer popularity;

        /**
         * <p>The publisher of template.</p>
         */
        @NameInMap("Publisher")
        public String publisher;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the template. The share type of the template that you create is **Private**. Valid values:</p>
         * <br>
         * <p>*   **Public**</p>
         * <p>*   **Private**</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The format of the template. The system automatically determines whether the format is JSON or YAML.</p>
         */
        @NameInMap("TemplateFormat")
        public String templateFormat;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the template.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The version of the template. The name of the version consists of the letter v and a number. The number starts from 1.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The number of times for which the private template is executed. If the **ShareType** parameter is set to **Public**, the value of this parameter is `-1`.</p>
         * <p>**Notes** This parameter is valid only if the **ShareType** parameter is set to **Private**.</p>
         */
        @NameInMap("TotalExecutionCount")
        public Integer totalExecutionCount;

        /**
         * <p>The user who last updated the template.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the template was last updated.</p>
         */
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

        public ListTemplatesResponseBodyTemplates setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
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

        public ListTemplatesResponseBodyTemplates setIsFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            return this;
        }
        public Boolean getIsFavorite() {
            return this.isFavorite;
        }

        public ListTemplatesResponseBodyTemplates setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }
        public Integer getPopularity() {
            return this.popularity;
        }

        public ListTemplatesResponseBodyTemplates setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
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
