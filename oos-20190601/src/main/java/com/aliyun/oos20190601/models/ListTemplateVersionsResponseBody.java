// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The versions of the template.</p>
     */
    @NameInMap("TemplateVersions")
    public java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> templateVersions;

    public static ListTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsResponseBody self = new ListTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateVersionsResponseBody setTemplateVersions(java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> templateVersions) {
        this.templateVersions = templateVersions;
        return this;
    }
    public java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> getTemplateVersions() {
        return this.templateVersions;
    }

    public static class ListTemplateVersionsResponseBodyTemplateVersions extends TeaModel {
        /**
         * <p>The description of the version.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The format of the template content. Valid values: YAML and JSON.</p>
         */
        @NameInMap("TemplateFormat")
        public String templateFormat;

        /**
         * <p>The number of the version.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The user who last updated the version.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the version was last updated.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The name of the version.</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static ListTemplateVersionsResponseBodyTemplateVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateVersionsResponseBodyTemplateVersions self = new ListTemplateVersionsResponseBodyTemplateVersions();
            return TeaModel.build(map, self);
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
