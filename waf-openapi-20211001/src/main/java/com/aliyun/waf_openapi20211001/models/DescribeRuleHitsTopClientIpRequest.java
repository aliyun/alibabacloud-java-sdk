// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopClientIpRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeRuleHitsTopClientIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopClientIpRequest self = new DescribeRuleHitsTopClientIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopClientIpRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopClientIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopClientIpRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeRuleHitsTopClientIpRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleHitsTopClientIpRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
