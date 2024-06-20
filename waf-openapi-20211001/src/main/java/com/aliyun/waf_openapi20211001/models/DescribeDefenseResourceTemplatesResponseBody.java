// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2305CEB0-BA5A-5543-A1D3-3F1D0891****</p>
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
         * <ul>
         * <li><strong>waf_group</strong>: basic protection.</li>
         * <li><strong>antiscan</strong>: scan protection.</li>
         * <li><strong>ip_blacklist</strong>: IP address blacklist.</li>
         * <li><strong>custom_acl</strong>: custom rule.</li>
         * <li><strong>whitelist</strong>: whitelist.</li>
         * <li><strong>region_block</strong>: region blacklist.</li>
         * <li><strong>custom_response</strong>: custom response.</li>
         * <li><strong>cc</strong>: HTTP flood protection.</li>
         * <li><strong>tamperproof</strong>: website tamper-proofing.</li>
         * <li><strong>dlp</strong>: data leakage prevention.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The sub-scenario in which the template is used. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: bot management for website protection.</li>
         * <li><strong>app</strong>: bot management for app protection.</li>
         * <li><strong>basic</strong>: bot management for basic protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
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
         * <p>The time when the protection template was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1692930539000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTemplateName</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The origin of the protection template. The value custom indicates that the template is a custom template created by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TemplateOrigin")
        public String templateOrigin;

        /**
         * <p>The status of the protection template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateStatus")
        public Integer templateStatus;

        /**
         * <p>The type of the protection template. Valid values:</p>
         * <ul>
         * <li><strong>user_default</strong>: default template.</li>
         * <li><strong>user_custom</strong>: custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
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
