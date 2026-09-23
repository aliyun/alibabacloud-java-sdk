// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template information.</p>
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
         * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter in <a href="~~CreateDefenseRule~~">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The protection template sub-scenario. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: bot management web protection scenario template.</li>
         * <li><strong>app</strong>: bot management app protection scenario template.</li>
         * <li><strong>basic</strong>: bot management basic protection template.</li>
         * <li><strong>bot_custom_acl</strong>: bot management advanced custom rule protection template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("DefenseSubScene")
        public String defenseSubScene;

        /**
         * <p>The description of the protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detailed template information. For more information, see the Detail parameter in <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;trafficFeature&quot;:&quot;{\&quot;global\&quot;:0,\&quot;excludeStatus\&quot;:1,\&quot;conditions\&quot;:[{\&quot;key\&quot;:\&quot;URL\&quot;,\&quot;opValue\&quot;:\&quot;not-contain\&quot;,\&quot;values\&quot;:\&quot;test\&quot;}]}&quot;}</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The time when the protection template was last modified.</p>
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
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test0621</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The source of the protection template. The value custom indicates that the template is user-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        /**
         * <p>The status of the protection template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        /**
         * <p>The protection templatetype. Valid values:</p>
         * <ul>
         * <li><strong>user_default</strong>: user default protection.</li>
         * <li><strong>user_custom</strong>: user custom protection.</li>
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

        public DescribeDefenseTemplateResponseBodyTemplate setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
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
