// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The protection templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<DescribeDefenseResourceTemplatesResponseBodyTemplates> templates;

    public static DescribeDefenseResourceTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceTemplatesResponseBody self = new DescribeDefenseResourceTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourceTemplatesResponseBody setTemplates(java.util.List<DescribeDefenseResourceTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeDefenseResourceTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class DescribeDefenseResourceTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <p>The scenario in which the protection template is used.</p>
         * <br>
         * <p>*   **waf_group**: basic protection.</p>
         * <p>*   **antiscan**: scan protection.</p>
         * <p>*   **ip_blacklist**: IP address blacklist.</p>
         * <p>*   **custom_acl**: custom rule.</p>
         * <p>*   **whitelist**: whitelist.</p>
         * <p>*   **region_block**: region blacklist.</p>
         * <p>*   **custom_response**: custom response.</p>
         * <p>*   **cc**: HTTP flood protection.</p>
         * <p>*   **tamperproof**: website tamper-proofing.</p>
         * <p>*   **dlp**: data leakage prevention.</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The sub-scenario in which the template is used. Valid values:</p>
         * <br>
         * <p>*   **web**: bot management for website protection.</p>
         * <p>*   **app**: bot management for app protection.</p>
         * <p>*   **basic**: bot management for basic protection.</p>
         */
        @NameInMap("DefenseSubScene")
        public String defenseSubScene;

        /**
         * <p>The description of the protection template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the protection template was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the protection template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the protection template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The origin of the protection template. The value custom indicates that the template is a custom template created by the user.</p>
         */
        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        /**
         * <p>The status of the protection template. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         */
        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        /**
         * <p>The type of the protection template. Valid values:</p>
         * <br>
         * <p>*   **user_default**: default template.</p>
         * <p>*   **user_custom**: custom template.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static DescribeDefenseResourceTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceTemplatesResponseBodyTemplates self = new DescribeDefenseResourceTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setDefenseSubScene(String defenseSubScene) {
            this.defenseSubScene = defenseSubScene;
            return this;
        }
        public String getDefenseSubScene() {
            return this.defenseSubScene;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setTemplateOrigin(String templateOrigin) {
            this.templateOrigin = templateOrigin;
            return this;
        }
        public String getTemplateOrigin() {
            return this.templateOrigin;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setTemplateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Integer getTemplateStatus() {
            return this.templateStatus;
        }

        public DescribeDefenseResourceTemplatesResponseBodyTemplates setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
