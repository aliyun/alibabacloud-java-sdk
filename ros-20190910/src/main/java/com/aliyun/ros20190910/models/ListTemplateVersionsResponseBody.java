// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponseBody extends TeaModel {
    /**
     * <p>The query token that is returned in this call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of versions.</p>
     */
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
        /**
         * <p>The time when the version was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the version.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the template. This parameter applies to shared and private templates. For a shared template, the template ID is the same as the Alibaba Cloud Resource Name (ARN) of the template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name that corresponds to the specified version.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version number.</p>
         * <br>
         * <p>For a shared template, this parameter is returned only if the VersionOption parameter is set to AllVersions.</p>
         * <br>
         * <p>Valid values: v1 to v100.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the version was last updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTemplateVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateVersionsResponseBodyVersions self = new ListTemplateVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListTemplateVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplateVersionsResponseBodyVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplateVersionsResponseBodyVersions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplateVersionsResponseBodyVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
