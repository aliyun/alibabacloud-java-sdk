// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAegisContainerPluginRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-***0DEF8BF6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAegisContainerPluginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleResponseBody self = new GetAegisContainerPluginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleResponseBody setData(GetAegisContainerPluginRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAegisContainerPluginRuleResponseBodyData getData() {
        return this.data;
    }

    public GetAegisContainerPluginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAegisContainerPluginRuleResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671607025000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timestamp when the rule was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671607025000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The action mode of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: allows escape behavior.</li>
         * <li><strong>1</strong>: triggers alerts.</li>
         * <li><strong>2</strong>: blocks escape behavior.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>autoTest</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>21**</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_test_rule-EmzIXZ</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The template ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100**</p>
         */
        @NameInMap("RuleTemplateId")
        public String ruleTemplateId;

        /**
         * <p>The template name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>template01</p>
         */
        @NameInMap("RuleTemplateName")
        public String ruleTemplateName;

        /**
         * <p>The rule items.</p>
         */
        @NameInMap("SelectedPolicy")
        public java.util.List<String> selectedPolicy;

        /**
         * <p>The ID of the switch.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-CONTAINER-RULE-SWITCH-TYPE_***</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The images that are added to the whitelist.</p>
         */
        @NameInMap("WhiteImages")
        public java.util.List<String> whiteImages;

        public static GetAegisContainerPluginRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAegisContainerPluginRuleResponseBodyData self = new GetAegisContainerPluginRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAegisContainerPluginRuleResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAegisContainerPluginRuleResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAegisContainerPluginRuleResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetAegisContainerPluginRuleResponseBodyData setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetAegisContainerPluginRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetAegisContainerPluginRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetAegisContainerPluginRuleResponseBodyData setRuleTemplateId(String ruleTemplateId) {
            this.ruleTemplateId = ruleTemplateId;
            return this;
        }
        public String getRuleTemplateId() {
            return this.ruleTemplateId;
        }

        public GetAegisContainerPluginRuleResponseBodyData setRuleTemplateName(String ruleTemplateName) {
            this.ruleTemplateName = ruleTemplateName;
            return this;
        }
        public String getRuleTemplateName() {
            return this.ruleTemplateName;
        }

        public GetAegisContainerPluginRuleResponseBodyData setSelectedPolicy(java.util.List<String> selectedPolicy) {
            this.selectedPolicy = selectedPolicy;
            return this;
        }
        public java.util.List<String> getSelectedPolicy() {
            return this.selectedPolicy;
        }

        public GetAegisContainerPluginRuleResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public GetAegisContainerPluginRuleResponseBodyData setWhiteImages(java.util.List<String> whiteImages) {
            this.whiteImages = whiteImages;
            return this;
        }
        public java.util.List<String> getWhiteImages() {
            return this.whiteImages;
        }

    }

}
