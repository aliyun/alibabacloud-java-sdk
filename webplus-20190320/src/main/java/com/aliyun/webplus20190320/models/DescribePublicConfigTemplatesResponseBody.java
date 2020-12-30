// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribePublicConfigTemplatesResponseBody extends TeaModel {
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

    @NameInMap("PublicConfigTemplates")
    public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates publicConfigTemplates;

    @NameInMap("Code")
    public String code;

    public static DescribePublicConfigTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicConfigTemplatesResponseBody self = new DescribePublicConfigTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublicConfigTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePublicConfigTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublicConfigTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePublicConfigTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePublicConfigTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePublicConfigTemplatesResponseBody setPublicConfigTemplates(DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates publicConfigTemplates) {
        this.publicConfigTemplates = publicConfigTemplates;
        return this;
    }
    public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates getPublicConfigTemplates() {
        return this.publicConfigTemplates;
    }

    public DescribePublicConfigTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate extends TeaModel {
        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("TemplateLogo")
        public String templateLogo;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PackageSource")
        public String packageSource;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("TemplateId")
        public String templateId;

        public static DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate self = new DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate();
            return TeaModel.build(map, self);
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setTemplateLogo(String templateLogo) {
            this.templateLogo = templateLogo;
            return this;
        }
        public String getTemplateLogo() {
            return this.templateLogo;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setPackageSource(String packageSource) {
            this.packageSource = packageSource;
            return this;
        }
        public String getPackageSource() {
            return this.packageSource;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates extends TeaModel {
        @NameInMap("PublicConfigTemplate")
        public java.util.List<DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate> publicConfigTemplate;

        public static DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates self = new DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates();
            return TeaModel.build(map, self);
        }

        public DescribePublicConfigTemplatesResponseBodyPublicConfigTemplates setPublicConfigTemplate(java.util.List<DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate> publicConfigTemplate) {
            this.publicConfigTemplate = publicConfigTemplate;
            return this;
        }
        public java.util.List<DescribePublicConfigTemplatesResponseBodyPublicConfigTemplatesPublicConfigTemplate> getPublicConfigTemplate() {
            return this.publicConfigTemplate;
        }

    }

}
