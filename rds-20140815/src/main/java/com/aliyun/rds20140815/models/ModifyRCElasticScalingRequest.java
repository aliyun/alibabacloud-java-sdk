// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCElasticScalingRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>rc-3ndh4shwes*</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>mysql.x2.medium.9cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>cn-hanghzou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingEnabled")
    public Boolean scalingEnabled;

    /**
     * <strong>example:</strong>
     * <p>{&quot;rule&quot;:[{&quot;beginTime&quot;:&quot;09:00&quot;,&quot;endTime&quot;:&quot;17:00&quot;,&quot;acu&quot;:4}]}</p>
     */
    @NameInMap("ScheduledRule")
    public String scheduledRule;

    public static ModifyRCElasticScalingRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCElasticScalingRequest self = new ModifyRCElasticScalingRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCElasticScalingRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyRCElasticScalingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCElasticScalingRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyRCElasticScalingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRCElasticScalingRequest setScalingEnabled(Boolean scalingEnabled) {
        this.scalingEnabled = scalingEnabled;
        return this;
    }
    public Boolean getScalingEnabled() {
        return this.scalingEnabled;
    }

    public ModifyRCElasticScalingRequest setScheduledRule(String scheduledRule) {
        this.scheduledRule = scheduledRule;
        return this;
    }
    public String getScheduledRule() {
        return this.scheduledRule;
    }

}
