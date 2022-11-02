// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopResourceRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeRuleHitsTopResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopResourceRequest self = new DescribeRuleHitsTopResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopResourceRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopResourceRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleHitsTopResourceRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
