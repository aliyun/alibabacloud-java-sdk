// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEF54BA-17B6-449F-A219-49ACB157E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template metadata.</p>
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
         * <p>The template type.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerTrigger</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The constraints of template</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;InstanceTypeFamilies&quot;: [&quot;ecs.g8y&quot;, &quot;ecs.c8y&quot;],
         *   &quot;ImageTypes&quot;: [&quot;system&quot;],
         *   &quot;OSPlatforms&quot;: [&quot;CentOS&quot;, &quot;Ubuntu&quot;],
         *   &quot;OSVersions&quot;: [&quot;CentOS7.9 64bit&quot;]
         * }</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(1309200)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Describe instances of given status</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the template was configured with a trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        /**
         * <p>The SHA-256 value of the template content.</p>
         * 
         * <strong>example:</strong>
         * <p>4bc7d7a21b3e003434b9c223f6e6d2578b5ebfeb5be28c1fcf8a8a1b11907bb4</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <p>The template is favorite or not.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFavorite")
        public Boolean isFavorite;

        /**
         * <p>The popularity of the public template. Valid values: <strong>1-10</strong>. A greater value indicates higher popularity. If <strong>ShareType</strong> is set to <strong>Private</strong>, the value of this parameter is <code>-1</code>.</p>
         * <blockquote>
         * <p> This parameter is valid only if the value of <strong>ShareType</strong> is set to <strong>Public</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Popularity")
        public Integer popularity;

        /**
         * <p>The publisher of template.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Publisher")
        public String publisher;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the template. The share type of a template created by a user is <strong>Private</strong>. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The template format. The system automatically determines whether the format is JSON or YAML.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("TemplateFormat")
        public String templateFormat;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-94753deed38</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The template type.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The template version. The name of the version consists of the letter v and a number. The number starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The number of times for which the private template is executed. If <strong>ShareType</strong> is set to <strong>Public</strong>, the value of this parameter is <code>-1</code>.</p>
         * <blockquote>
         * <p> This parameter is valid only if the value of <strong>ShareType</strong> is <strong>Private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalExecutionCount")
        public Integer totalExecutionCount;

        /**
         * <p>The user who last updated the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(13092000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
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
