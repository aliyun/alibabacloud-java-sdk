// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCElasticScalingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gn8is</p>
     */
    @NameInMap("AcuType")
    public String acuType;

    /**
     * <strong>example:</strong>
     * <p>rc-a0e466b01tif2pk</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1F7B8B09-36F3-1165-BADB-13E376FE9BD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingEnabled")
    public Boolean scalingEnabled;

    @NameInMap("ScalingSupported")
    public Boolean scalingSupported;

    /**
     * <strong>example:</strong>
     * <p>{&quot;rule&quot;:[{&quot;beginTime&quot;:&quot;09:00&quot;,&quot;endTime&quot;:&quot;17:00&quot;,&quot;acu&quot;:4}]}</p>
     */
    @NameInMap("ScheduledRule")
    public String scheduledRule;

    @NameInMap("ScheduledRuleTemplates")
    public DescribeRCElasticScalingResponseBodyScheduledRuleTemplates scheduledRuleTemplates;

    /**
     * <strong>example:</strong>
     * <p>mysql.x2.medium.9cm</p>
     */
    @NameInMap("TargetInstanceType")
    public String targetInstanceType;

    public static DescribeRCElasticScalingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCElasticScalingResponseBody self = new DescribeRCElasticScalingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCElasticScalingResponseBody setAcuType(String acuType) {
        this.acuType = acuType;
        return this;
    }
    public String getAcuType() {
        return this.acuType;
    }

    public DescribeRCElasticScalingResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCElasticScalingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCElasticScalingResponseBody setScalingEnabled(Boolean scalingEnabled) {
        this.scalingEnabled = scalingEnabled;
        return this;
    }
    public Boolean getScalingEnabled() {
        return this.scalingEnabled;
    }

    public DescribeRCElasticScalingResponseBody setScalingSupported(Boolean scalingSupported) {
        this.scalingSupported = scalingSupported;
        return this;
    }
    public Boolean getScalingSupported() {
        return this.scalingSupported;
    }

    public DescribeRCElasticScalingResponseBody setScheduledRule(String scheduledRule) {
        this.scheduledRule = scheduledRule;
        return this;
    }
    public String getScheduledRule() {
        return this.scheduledRule;
    }

    public DescribeRCElasticScalingResponseBody setScheduledRuleTemplates(DescribeRCElasticScalingResponseBodyScheduledRuleTemplates scheduledRuleTemplates) {
        this.scheduledRuleTemplates = scheduledRuleTemplates;
        return this;
    }
    public DescribeRCElasticScalingResponseBodyScheduledRuleTemplates getScheduledRuleTemplates() {
        return this.scheduledRuleTemplates;
    }

    public DescribeRCElasticScalingResponseBody setTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }
    public String getTargetInstanceType() {
        return this.targetInstanceType;
    }

    public static class DescribeRCElasticScalingResponseBodyScheduledRuleTemplates extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static DescribeRCElasticScalingResponseBodyScheduledRuleTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCElasticScalingResponseBodyScheduledRuleTemplates self = new DescribeRCElasticScalingResponseBodyScheduledRuleTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeRCElasticScalingResponseBodyScheduledRuleTemplates setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
