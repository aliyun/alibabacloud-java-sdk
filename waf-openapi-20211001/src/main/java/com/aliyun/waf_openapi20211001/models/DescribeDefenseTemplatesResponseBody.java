// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F26D2F1-E288-5104-8518-05E240E3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The protection templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<DescribeDefenseTemplatesResponseBodyTemplates> templates;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplatesResponseBody self = new DescribeDefenseTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseTemplatesResponseBody setTemplates(java.util.List<DescribeDefenseTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeDefenseTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeDefenseTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDefenseTemplatesResponseBodyTemplates extends TeaModel {
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
         * <p>The sub-scenario in which the protection template is used. Valid values:</p>
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
         * <p>1683776070000</p>
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
         * <p>testTemplateName</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The origin of the protection template. The value custom indicates that the protection template is a custom template created by the user.</p>
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

        public static DescribeDefenseTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseTemplatesResponseBodyTemplates self = new DescribeDefenseTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setDefenseSubScene(String defenseSubScene) {
            this.defenseSubScene = defenseSubScene;
            return this;
        }
        public String getDefenseSubScene() {
            return this.defenseSubScene;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setTemplateOrigin(String templateOrigin) {
            this.templateOrigin = templateOrigin;
            return this;
        }
        public String getTemplateOrigin() {
            return this.templateOrigin;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setTemplateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Integer getTemplateStatus() {
            return this.templateStatus;
        }

        public DescribeDefenseTemplatesResponseBodyTemplates setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
