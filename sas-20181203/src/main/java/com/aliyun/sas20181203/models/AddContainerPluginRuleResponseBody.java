// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerPluginRuleResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddContainerPluginRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddContainerPluginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddContainerPluginRuleResponseBody self = new AddContainerPluginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddContainerPluginRuleResponseBody setData(AddContainerPluginRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddContainerPluginRuleResponseBodyData getData() {
        return this.data;
    }

    public AddContainerPluginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddContainerPluginRuleResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>219</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The ID of the switch.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-CONTAINER-RULE-SWITCH-TYPE_xxxx</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static AddContainerPluginRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddContainerPluginRuleResponseBodyData self = new AddContainerPluginRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddContainerPluginRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public AddContainerPluginRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public AddContainerPluginRuleResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
