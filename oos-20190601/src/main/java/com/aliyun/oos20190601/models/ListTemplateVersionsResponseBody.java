// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("TemplateVersions")
    public java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> templateVersions;

    public static ListTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsResponseBody self = new ListTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
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

    public ListTemplateVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateVersionsResponseBody setTemplateVersions(java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> templateVersions) {
        this.templateVersions = templateVersions;
        return this;
    }
    public java.util.List<ListTemplateVersionsResponseBodyTemplateVersions> getTemplateVersions() {
        return this.templateVersions;
    }

    public static class ListTemplateVersionsResponseBodyTemplateVersions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("TemplateFormat")
        public String templateFormat;

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

        public ListTemplateVersionsResponseBodyTemplateVersions setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplateVersionsResponseBodyTemplateVersions setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

    }

}
