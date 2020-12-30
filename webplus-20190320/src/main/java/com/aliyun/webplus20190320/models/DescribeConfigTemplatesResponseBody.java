// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigTemplatesResponseBody extends TeaModel {
    @NameInMap("ConfigTemplates")
    public DescribeConfigTemplatesResponseBodyConfigTemplates configTemplates;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Code")
    public String code;

    public static DescribeConfigTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigTemplatesResponseBody self = new DescribeConfigTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigTemplatesResponseBody setConfigTemplates(DescribeConfigTemplatesResponseBodyConfigTemplates configTemplates) {
        this.configTemplates = configTemplates;
        return this;
    }
    public DescribeConfigTemplatesResponseBodyConfigTemplates getConfigTemplates() {
        return this.configTemplates;
    }

    public DescribeConfigTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeConfigTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfigTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConfigTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate extends TeaModel {
        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PkgVersionLabel")
        public String pkgVersionLabel;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("PkgVersionId")
        public String pkgVersionId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate self = new DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setPkgVersionLabel(String pkgVersionLabel) {
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setPkgVersionId(String pkgVersionId) {
            this.pkgVersionId = pkgVersionId;
            return this;
        }
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribeConfigTemplatesResponseBodyConfigTemplates extends TeaModel {
        @NameInMap("ConfigTemplate")
        public java.util.List<DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate> configTemplate;

        public static DescribeConfigTemplatesResponseBodyConfigTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigTemplatesResponseBodyConfigTemplates self = new DescribeConfigTemplatesResponseBodyConfigTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeConfigTemplatesResponseBodyConfigTemplates setConfigTemplate(java.util.List<DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate> configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public java.util.List<DescribeConfigTemplatesResponseBodyConfigTemplatesConfigTemplate> getConfigTemplate() {
            return this.configTemplate;
        }

    }

}
