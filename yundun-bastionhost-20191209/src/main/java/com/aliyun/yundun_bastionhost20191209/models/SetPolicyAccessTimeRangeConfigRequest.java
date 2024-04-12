// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigRequest extends TeaModel {
    @NameInMap("AccessTimeRangeConfig")
    public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig accessTimeRangeConfig;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyAccessTimeRangeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAccessTimeRangeConfigRequest self = new SetPolicyAccessTimeRangeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyAccessTimeRangeConfigRequest setAccessTimeRangeConfig(SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig accessTimeRangeConfig) {
        this.accessTimeRangeConfig = accessTimeRangeConfig;
        return this;
    }
    public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig getAccessTimeRangeConfig() {
        return this.accessTimeRangeConfig;
    }

    public SetPolicyAccessTimeRangeConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyAccessTimeRangeConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyAccessTimeRangeConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime extends TeaModel {
        @NameInMap("Days")
        public java.util.List<Integer> days;

        @NameInMap("Hours")
        public java.util.List<Integer> hours;

        public static SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime self = new SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime();
            return TeaModel.build(map, self);
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime setDays(java.util.List<Integer> days) {
            this.days = days;
            return this;
        }
        public java.util.List<Integer> getDays() {
            return this.days;
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime setHours(java.util.List<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

    }

    public static class SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig extends TeaModel {
        @NameInMap("EffectiveTime")
        public java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> effectiveTime;

        public static SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig self = new SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig setEffectiveTime(java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> getEffectiveTime() {
            return this.effectiveTime;
        }

    }

}
