// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerPluginRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyContainerPluginRuleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyContainerPluginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerPluginRuleResponseBody self = new ModifyContainerPluginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyContainerPluginRuleResponseBody setData(ModifyContainerPluginRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyContainerPluginRuleResponseBodyData getData() {
        return this.data;
    }

    public ModifyContainerPluginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyContainerPluginRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SwitchId")
        public String switchId;

        public static ModifyContainerPluginRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyContainerPluginRuleResponseBodyData self = new ModifyContainerPluginRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyContainerPluginRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ModifyContainerPluginRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ModifyContainerPluginRuleResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
