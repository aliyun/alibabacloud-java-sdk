// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the template.</p>
     */
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
        /**
         * <p>The scenario in which the template is used. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("DefenseSubScene")
        public String defenseSubScene;

        /**
         * <p>The description of the protection rule template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The most recent time when the protection rule template was modified.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the protection rule template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the protection rule template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The origin of the protection rule template. If the value of this parameter is custom, the protection rule template is created by the user.</p>
         */
        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        /**
         * <p>The status of the protection rule template. Valid values:</p>
         * <br>
         * <p>*   **0:** disabled.</p>
         * <p>*   **1:** enabled.</p>
         */
        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        /**
         * <p>The type of the protection rule template. Valid values:</p>
         * <br>
         * <p>*   **user_default:** default template.</p>
         * <p>*   **user_custom:** custom template.</p>
         */
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

        public DescribeDefenseTemplateResponseBodyTemplate setDefenseSubScene(String defenseSubScene) {
            this.defenseSubScene = defenseSubScene;
            return this;
        }
        public String getDefenseSubScene() {
            return this.defenseSubScene;
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
