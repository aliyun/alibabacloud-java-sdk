// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Versions")
    public java.util.List<ListTemplateVersionsResponseBodyVersions> versions;

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

    public ListTemplateVersionsResponseBody setVersions(java.util.List<ListTemplateVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListTemplateVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListTemplateVersionsResponseBodyVersions extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        public static ListTemplateVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateVersionsResponseBodyVersions self = new ListTemplateVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListTemplateVersionsResponseBodyVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTemplateVersionsResponseBodyVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplateVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

    }

}
