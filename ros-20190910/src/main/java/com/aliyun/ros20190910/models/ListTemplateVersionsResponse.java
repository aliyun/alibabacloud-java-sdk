// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Versions")
    @Validation(required = true)
    public java.util.List<ListTemplateVersionsResponseVersions> versions;

    public static ListTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsResponse self = new ListTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateVersionsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateVersionsResponse setVersions(java.util.List<ListTemplateVersionsResponseVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListTemplateVersionsResponseVersions> getVersions() {
        return this.versions;
    }

    public static class ListTemplateVersionsResponseVersions extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("TemplateVersion")
        @Validation(required = true)
        public String templateVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static ListTemplateVersionsResponseVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateVersionsResponseVersions self = new ListTemplateVersionsResponseVersions();
            return TeaModel.build(map, self);
        }

        public ListTemplateVersionsResponseVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplateVersionsResponseVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTemplateVersionsResponseVersions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplateVersionsResponseVersions setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplateVersionsResponseVersions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplateVersionsResponseVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
