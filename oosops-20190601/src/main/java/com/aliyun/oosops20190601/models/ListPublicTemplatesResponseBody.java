// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplatesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListPublicTemplatesResponseBodyTemplates> templates;

    public static ListPublicTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplatesResponseBody self = new ListPublicTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicTemplatesResponseBody setTemplates(java.util.List<ListPublicTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListPublicTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListPublicTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("Popularity")
        public Integer popularity;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("TemplateFormat")
        public String templateFormat;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("TotalExecutionCount")
        public Integer totalExecutionCount;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListPublicTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListPublicTemplatesResponseBodyTemplates self = new ListPublicTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListPublicTemplatesResponseBodyTemplates setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListPublicTemplatesResponseBodyTemplates setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListPublicTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicTemplatesResponseBodyTemplates setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public ListPublicTemplatesResponseBodyTemplates setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }
        public Integer getPopularity() {
            return this.popularity;
        }

        public ListPublicTemplatesResponseBodyTemplates setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPublicTemplatesResponseBodyTemplates setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public ListPublicTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListPublicTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListPublicTemplatesResponseBodyTemplates setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListPublicTemplatesResponseBodyTemplates setTotalExecutionCount(Integer totalExecutionCount) {
            this.totalExecutionCount = totalExecutionCount;
            return this;
        }
        public Integer getTotalExecutionCount() {
            return this.totalExecutionCount;
        }

        public ListPublicTemplatesResponseBodyTemplates setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListPublicTemplatesResponseBodyTemplates setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
