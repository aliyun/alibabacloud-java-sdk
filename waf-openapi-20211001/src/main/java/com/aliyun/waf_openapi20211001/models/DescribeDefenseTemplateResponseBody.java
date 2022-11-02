// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public DescribeDefenseTemplateResponseBodyTemplate template;

    public static DescribeDefenseTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateResponseBody self = new DescribeDefenseTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseTemplateResponseBody setTemplate(DescribeDefenseTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public DescribeDefenseTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class DescribeDefenseTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        @NameInMap("TemplateType")
        public String templateType;

        public static DescribeDefenseTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseTemplateResponseBodyTemplate self = new DescribeDefenseTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseTemplateResponseBodyTemplate setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setTemplateOrigin(String templateOrigin) {
            this.templateOrigin = templateOrigin;
            return this;
        }
        public String getTemplateOrigin() {
            return this.templateOrigin;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setTemplateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Integer getTemplateStatus() {
            return this.templateStatus;
        }

        public DescribeDefenseTemplateResponseBodyTemplate setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
