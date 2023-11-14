// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerPluginRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddContainerPluginRuleResponseBodyData data;

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
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

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
