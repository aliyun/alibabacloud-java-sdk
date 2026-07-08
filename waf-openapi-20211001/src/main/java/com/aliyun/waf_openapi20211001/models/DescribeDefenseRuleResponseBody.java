// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the protection rule.</p>
     */
    @NameInMap("Rule")
    public DescribeDefenseRuleResponseBodyRule rule;

    public static DescribeDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleResponseBody self = new DescribeDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRuleResponseBody setRule(DescribeDefenseRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public DescribeDefenseRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class DescribeDefenseRuleResponseBodyRule extends TeaModel {
        /**
         * <p>The configuration of the protection rule, returned as a JSON string. For more information, see the <strong>Protection rule parameters</strong> section in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;status\&quot;:1,\&quot;policyId\&quot;:1012,\&quot;action\&quot;:\&quot;block\&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The origin of the protection rule. This parameter indicates whether the rule was created by the user or by the system. Valid values:</p>
         * <ul>
         * <li><p><strong>custom</strong>: a custom rule.</p>
         * </li>
         * <li><p><strong>system</strong>: a system-generated rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("DefenseOrigin")
        public String defenseOrigin;

        /**
         * <p>The scenario to which the protection rule applies.</p>
         * <p>If the <strong>DefenseType</strong> parameter is set to <strong>template</strong>, the valid values are:</p>
         * <ul>
         * <li><p><strong>waf_group</strong>: basic protection with regular expression rules.</p>
         * </li>
         * <li><p><strong>waf_base</strong>: web core protection.</p>
         * </li>
         * <li><p><strong>waf_base_compliance</strong>: basic protection with protocol compliance rules.</p>
         * </li>
         * <li><p><strong>waf_base_sema</strong>: basic protection with semantic analysis rules.</p>
         * </li>
         * <li><p><strong>cc</strong>: HTTP flood protection.</p>
         * </li>
         * <li><p><strong>antiscan_dirscan</strong>: directory traversal blocking in scan protection.</p>
         * </li>
         * <li><p><strong>antiscan_highfreq</strong>: high-frequency scan blocking in scan protection.</p>
         * </li>
         * <li><p><strong>antiscan_scantools</strong>: scanning tool blocking in scan protection.</p>
         * </li>
         * <li><p><strong>ip_blacklist</strong>: an IP address blacklist.</p>
         * </li>
         * <li><p><strong>custom_acl</strong>: a custom rule.</p>
         * </li>
         * <li><p><strong>region_block</strong>: a location blacklist.</p>
         * </li>
         * <li><p><strong>tamperproof</strong>: webpage tamper protection.</p>
         * </li>
         * <li><p><strong>dlp</strong>: data leakage prevention.</p>
         * </li>
         * <li><p><strong>custom_response_block</strong>: a custom response.</p>
         * </li>
         * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
         * </li>
         * </ul>
         * <p>If the <strong>DefenseType</strong> parameter is set to <strong>resource</strong>, the valid values are:</p>
         * <ul>
         * <li><p><strong>account_identifier</strong>: account identification.</p>
         * </li>
         * <li><p><strong>custom_response</strong>: a custom response.</p>
         * </li>
         * <li><p><strong>waf_codec</strong>: data decoding settings.</p>
         * </li>
         * </ul>
         * <p>If the <strong>DefenseType</strong> parameter is set to <strong>global</strong>, the valid values are:</p>
         * <ul>
         * <li><p><strong>regular_custom</strong>: a custom regular expression.</p>
         * </li>
         * <li><p><strong>address_book</strong>: an IP address book.</p>
         * </li>
         * <li><p><strong>custom_response</strong>: a custom response.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The type of the protection rule. Valid values:</p>
         * <ul>
         * <li><p><strong>template</strong> (default): a protection rule template.</p>
         * </li>
         * <li><p><strong>resource</strong>: a rule for a protected object.</p>
         * </li>
         * <li><p><strong>global</strong>: a global rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        @NameInMap("DefenseType")
        public String defenseType;

        /**
         * <p>The time when the protection rule was modified. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665196746000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The protected object to which the protection rule applies.</p>
         * <blockquote>
         * <p>This parameter is returned only if the <strong>DefenseType</strong> parameter is set to <strong>resource</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rencs***-waf</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The ID of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2732975</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the protection rule. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the protection rule template.</p>
         * <blockquote>
         * <p>This parameter is returned only if the <strong>DefenseType</strong> parameter is set to <strong>template</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9114</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeDefenseRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRuleResponseBodyRule self = new DescribeDefenseRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRuleResponseBodyRule setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseOrigin(String defenseOrigin) {
            this.defenseOrigin = defenseOrigin;
            return this;
        }
        public String getDefenseOrigin() {
            return this.defenseOrigin;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseType(String defenseType) {
            this.defenseType = defenseType;
            return this;
        }
        public String getDefenseType() {
            return this.defenseType;
        }

        public DescribeDefenseRuleResponseBodyRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseRuleResponseBodyRule setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDefenseRuleResponseBodyRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDefenseRuleResponseBodyRule setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
