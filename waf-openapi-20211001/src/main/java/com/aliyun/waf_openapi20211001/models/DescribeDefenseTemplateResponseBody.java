// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
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
         * <p>The scenario in which the template is used. For more information, see the description of the <strong>DefenseScene</strong> parameter in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The sub-scenario in which the template is used. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: The template is a bot management template that is used for website protection.</li>
         * <li><strong>app</strong>: The template is a bot management template that is used for app protection.</li>
         * <li><strong>basic</strong>: The template is a bot management template that is used for basic protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("DefenseSubScene")
        public String defenseSubScene;

        /**
         * <p>The description of the protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The most recent time when the protection rule template was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1665283642000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>10097</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>test0621</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The origin of the protection rule template. If the value of this parameter is custom, the protection rule template is created by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        /**
         * <p>The status of the protection rule template. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> disabled.</li>
         * <li><strong>1:</strong> enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        /**
         * <p>The type of the protection rule template. Valid values:</p>
         * <ul>
         * <li><strong>user_default:</strong> default template.</li>
         * <li><strong>user_custom:</strong> custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
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
