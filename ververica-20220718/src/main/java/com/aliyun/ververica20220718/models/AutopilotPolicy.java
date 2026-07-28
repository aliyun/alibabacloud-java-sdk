// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AutopilotPolicy extends TeaModel {
    @NameInMap("advancedRules")
    public AutopilotPolicyAdvancedRules advancedRules;

    @NameInMap("limits")
    public AutopilotPolicyLimits limits;

    @NameInMap("scaleDownRules")
    public AutopilotPolicyScaleDownRules scaleDownRules;

    @NameInMap("scaleUpRules")
    public AutopilotPolicyScaleUpRules scaleUpRules;

    @NameInMap("silentPeriodConfig")
    public AutopilotPolicySilentPeriodConfig silentPeriodConfig;

    public static AutopilotPolicy build(java.util.Map<String, ?> map) throws Exception {
        AutopilotPolicy self = new AutopilotPolicy();
        return TeaModel.build(map, self);
    }

    public AutopilotPolicy setAdvancedRules(AutopilotPolicyAdvancedRules advancedRules) {
        this.advancedRules = advancedRules;
        return this;
    }
    public AutopilotPolicyAdvancedRules getAdvancedRules() {
        return this.advancedRules;
    }

    public AutopilotPolicy setLimits(AutopilotPolicyLimits limits) {
        this.limits = limits;
        return this;
    }
    public AutopilotPolicyLimits getLimits() {
        return this.limits;
    }

    public AutopilotPolicy setScaleDownRules(AutopilotPolicyScaleDownRules scaleDownRules) {
        this.scaleDownRules = scaleDownRules;
        return this;
    }
    public AutopilotPolicyScaleDownRules getScaleDownRules() {
        return this.scaleDownRules;
    }

    public AutopilotPolicy setScaleUpRules(AutopilotPolicyScaleUpRules scaleUpRules) {
        this.scaleUpRules = scaleUpRules;
        return this;
    }
    public AutopilotPolicyScaleUpRules getScaleUpRules() {
        return this.scaleUpRules;
    }

    public AutopilotPolicy setSilentPeriodConfig(AutopilotPolicySilentPeriodConfig silentPeriodConfig) {
        this.silentPeriodConfig = silentPeriodConfig;
        return this;
    }
    public AutopilotPolicySilentPeriodConfig getSilentPeriodConfig() {
        return this.silentPeriodConfig;
    }

    public static class AutopilotPolicyAdvancedRules extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        public static AutopilotPolicyAdvancedRules build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyAdvancedRules self = new AutopilotPolicyAdvancedRules();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyAdvancedRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyAdvancedRules setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

    }

    public static class AutopilotPolicyLimits extends TeaModel {
        @NameInMap("coolDownMinutes")
        public Long coolDownMinutes;

        @NameInMap("jobMaxCpu")
        public Double jobMaxCpu;

        @NameInMap("jobMaxMemory")
        public String jobMaxMemory;

        @NameInMap("jobMaxParallelism")
        public Integer jobMaxParallelism;

        @NameInMap("jobMinParallelism")
        public Integer jobMinParallelism;

        public static AutopilotPolicyLimits build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyLimits self = new AutopilotPolicyLimits();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyLimits setCoolDownMinutes(Long coolDownMinutes) {
            this.coolDownMinutes = coolDownMinutes;
            return this;
        }
        public Long getCoolDownMinutes() {
            return this.coolDownMinutes;
        }

        public AutopilotPolicyLimits setJobMaxCpu(Double jobMaxCpu) {
            this.jobMaxCpu = jobMaxCpu;
            return this;
        }
        public Double getJobMaxCpu() {
            return this.jobMaxCpu;
        }

        public AutopilotPolicyLimits setJobMaxMemory(String jobMaxMemory) {
            this.jobMaxMemory = jobMaxMemory;
            return this;
        }
        public String getJobMaxMemory() {
            return this.jobMaxMemory;
        }

        public AutopilotPolicyLimits setJobMaxParallelism(Integer jobMaxParallelism) {
            this.jobMaxParallelism = jobMaxParallelism;
            return this;
        }
        public Integer getJobMaxParallelism() {
            return this.jobMaxParallelism;
        }

        public AutopilotPolicyLimits setJobMinParallelism(Integer jobMinParallelism) {
            this.jobMinParallelism = jobMinParallelism;
            return this;
        }
        public Integer getJobMinParallelism() {
            return this.jobMinParallelism;
        }

    }

    public static class AutopilotPolicyScaleDownRulesMemoryScaleDownRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("memUsageScaleDownSampleInterval")
        public String memUsageScaleDownSampleInterval;

        @NameInMap("memUsageScaleDownThreshold")
        public Double memUsageScaleDownThreshold;

        public static AutopilotPolicyScaleDownRulesMemoryScaleDownRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleDownRulesMemoryScaleDownRule self = new AutopilotPolicyScaleDownRulesMemoryScaleDownRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule setMemUsageScaleDownSampleInterval(String memUsageScaleDownSampleInterval) {
            this.memUsageScaleDownSampleInterval = memUsageScaleDownSampleInterval;
            return this;
        }
        public String getMemUsageScaleDownSampleInterval() {
            return this.memUsageScaleDownSampleInterval;
        }

        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule setMemUsageScaleDownThreshold(Double memUsageScaleDownThreshold) {
            this.memUsageScaleDownThreshold = memUsageScaleDownThreshold;
            return this;
        }
        public Double getMemUsageScaleDownThreshold() {
            return this.memUsageScaleDownThreshold;
        }

    }

    public static class AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("slotBusyScaleDownSampleInterval")
        public String slotBusyScaleDownSampleInterval;

        @NameInMap("slotBusyScaleDownThreshold")
        public Double slotBusyScaleDownThreshold;

        public static AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule self = new AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule setSlotBusyScaleDownSampleInterval(String slotBusyScaleDownSampleInterval) {
            this.slotBusyScaleDownSampleInterval = slotBusyScaleDownSampleInterval;
            return this;
        }
        public String getSlotBusyScaleDownSampleInterval() {
            return this.slotBusyScaleDownSampleInterval;
        }

        public AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule setSlotBusyScaleDownThreshold(Double slotBusyScaleDownThreshold) {
            this.slotBusyScaleDownThreshold = slotBusyScaleDownThreshold;
            return this;
        }
        public Double getSlotBusyScaleDownThreshold() {
            return this.slotBusyScaleDownThreshold;
        }

    }

    public static class AutopilotPolicyScaleDownRules extends TeaModel {
        @NameInMap("memoryScaleDownRule")
        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule memoryScaleDownRule;

        @NameInMap("slotBusyScaleDownRule")
        public AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule slotBusyScaleDownRule;

        public static AutopilotPolicyScaleDownRules build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleDownRules self = new AutopilotPolicyScaleDownRules();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleDownRules setMemoryScaleDownRule(AutopilotPolicyScaleDownRulesMemoryScaleDownRule memoryScaleDownRule) {
            this.memoryScaleDownRule = memoryScaleDownRule;
            return this;
        }
        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule getMemoryScaleDownRule() {
            return this.memoryScaleDownRule;
        }

        public AutopilotPolicyScaleDownRules setSlotBusyScaleDownRule(AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule slotBusyScaleDownRule) {
            this.slotBusyScaleDownRule = slotBusyScaleDownRule;
            return this;
        }
        public AutopilotPolicyScaleDownRulesSlotBusyScaleDownRule getSlotBusyScaleDownRule() {
            return this.slotBusyScaleDownRule;
        }

    }

    public static class AutopilotPolicyScaleUpRulesDelayRule extends TeaModel {
        @NameInMap("delaySampleInterval")
        public String delaySampleInterval;

        @NameInMap("delayThreshold")
        public String delayThreshold;

        @NameInMap("enabled")
        public Boolean enabled;

        public static AutopilotPolicyScaleUpRulesDelayRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRulesDelayRule self = new AutopilotPolicyScaleUpRulesDelayRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRulesDelayRule setDelaySampleInterval(String delaySampleInterval) {
            this.delaySampleInterval = delaySampleInterval;
            return this;
        }
        public String getDelaySampleInterval() {
            return this.delaySampleInterval;
        }

        public AutopilotPolicyScaleUpRulesDelayRule setDelayThreshold(String delayThreshold) {
            this.delayThreshold = delayThreshold;
            return this;
        }
        public String getDelayThreshold() {
            return this.delayThreshold;
        }

        public AutopilotPolicyScaleUpRulesDelayRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AutopilotPolicyScaleUpRulesGcRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("gcSampleInterval")
        public String gcSampleInterval;

        @NameInMap("gcTimeRatioThreshold")
        public Double gcTimeRatioThreshold;

        public static AutopilotPolicyScaleUpRulesGcRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRulesGcRule self = new AutopilotPolicyScaleUpRulesGcRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRulesGcRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyScaleUpRulesGcRule setGcSampleInterval(String gcSampleInterval) {
            this.gcSampleInterval = gcSampleInterval;
            return this;
        }
        public String getGcSampleInterval() {
            return this.gcSampleInterval;
        }

        public AutopilotPolicyScaleUpRulesGcRule setGcTimeRatioThreshold(Double gcTimeRatioThreshold) {
            this.gcTimeRatioThreshold = gcTimeRatioThreshold;
            return this;
        }
        public Double getGcTimeRatioThreshold() {
            return this.gcTimeRatioThreshold;
        }

    }

    public static class AutopilotPolicyScaleUpRulesMemoryScaleUpRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("memUsageScaleUpThreshold")
        public Double memUsageScaleUpThreshold;

        public static AutopilotPolicyScaleUpRulesMemoryScaleUpRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRulesMemoryScaleUpRule self = new AutopilotPolicyScaleUpRulesMemoryScaleUpRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRulesMemoryScaleUpRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyScaleUpRulesMemoryScaleUpRule setMemUsageScaleUpThreshold(Double memUsageScaleUpThreshold) {
            this.memUsageScaleUpThreshold = memUsageScaleUpThreshold;
            return this;
        }
        public Double getMemUsageScaleUpThreshold() {
            return this.memUsageScaleUpThreshold;
        }

    }

    public static class AutopilotPolicyScaleUpRulesOomScaleUpRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        public static AutopilotPolicyScaleUpRulesOomScaleUpRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRulesOomScaleUpRule self = new AutopilotPolicyScaleUpRulesOomScaleUpRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRulesOomScaleUpRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("slotBusyScaleUpSampleInterval")
        public String slotBusyScaleUpSampleInterval;

        @NameInMap("slotBusyScaleUpThreshold")
        public Double slotBusyScaleUpThreshold;

        public static AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule self = new AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule setSlotBusyScaleUpSampleInterval(String slotBusyScaleUpSampleInterval) {
            this.slotBusyScaleUpSampleInterval = slotBusyScaleUpSampleInterval;
            return this;
        }
        public String getSlotBusyScaleUpSampleInterval() {
            return this.slotBusyScaleUpSampleInterval;
        }

        public AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule setSlotBusyScaleUpThreshold(Double slotBusyScaleUpThreshold) {
            this.slotBusyScaleUpThreshold = slotBusyScaleUpThreshold;
            return this;
        }
        public Double getSlotBusyScaleUpThreshold() {
            return this.slotBusyScaleUpThreshold;
        }

    }

    public static class AutopilotPolicyScaleUpRules extends TeaModel {
        @NameInMap("delayRule")
        public AutopilotPolicyScaleUpRulesDelayRule delayRule;

        @NameInMap("gcRule")
        public AutopilotPolicyScaleUpRulesGcRule gcRule;

        @NameInMap("memoryScaleUpRule")
        public AutopilotPolicyScaleUpRulesMemoryScaleUpRule memoryScaleUpRule;

        @NameInMap("oomScaleUpRule")
        public AutopilotPolicyScaleUpRulesOomScaleUpRule oomScaleUpRule;

        @NameInMap("slotBusyScaleUpRule")
        public AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule slotBusyScaleUpRule;

        public static AutopilotPolicyScaleUpRules build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicyScaleUpRules self = new AutopilotPolicyScaleUpRules();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicyScaleUpRules setDelayRule(AutopilotPolicyScaleUpRulesDelayRule delayRule) {
            this.delayRule = delayRule;
            return this;
        }
        public AutopilotPolicyScaleUpRulesDelayRule getDelayRule() {
            return this.delayRule;
        }

        public AutopilotPolicyScaleUpRules setGcRule(AutopilotPolicyScaleUpRulesGcRule gcRule) {
            this.gcRule = gcRule;
            return this;
        }
        public AutopilotPolicyScaleUpRulesGcRule getGcRule() {
            return this.gcRule;
        }

        public AutopilotPolicyScaleUpRules setMemoryScaleUpRule(AutopilotPolicyScaleUpRulesMemoryScaleUpRule memoryScaleUpRule) {
            this.memoryScaleUpRule = memoryScaleUpRule;
            return this;
        }
        public AutopilotPolicyScaleUpRulesMemoryScaleUpRule getMemoryScaleUpRule() {
            return this.memoryScaleUpRule;
        }

        public AutopilotPolicyScaleUpRules setOomScaleUpRule(AutopilotPolicyScaleUpRulesOomScaleUpRule oomScaleUpRule) {
            this.oomScaleUpRule = oomScaleUpRule;
            return this;
        }
        public AutopilotPolicyScaleUpRulesOomScaleUpRule getOomScaleUpRule() {
            return this.oomScaleUpRule;
        }

        public AutopilotPolicyScaleUpRules setSlotBusyScaleUpRule(AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule slotBusyScaleUpRule) {
            this.slotBusyScaleUpRule = slotBusyScaleUpRule;
            return this;
        }
        public AutopilotPolicyScaleUpRulesSlotBusyScaleUpRule getSlotBusyScaleUpRule() {
            return this.slotBusyScaleUpRule;
        }

    }

    public static class AutopilotPolicySilentPeriodConfigSilentPeriods extends TeaModel {
        @NameInMap("beginTime")
        public Long beginTime;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("level")
        public String level;

        public static AutopilotPolicySilentPeriodConfigSilentPeriods build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicySilentPeriodConfigSilentPeriods self = new AutopilotPolicySilentPeriodConfigSilentPeriods();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicySilentPeriodConfigSilentPeriods setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public AutopilotPolicySilentPeriodConfigSilentPeriods setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public AutopilotPolicySilentPeriodConfigSilentPeriods setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class AutopilotPolicySilentPeriodConfig extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("silentPeriods")
        public java.util.List<AutopilotPolicySilentPeriodConfigSilentPeriods> silentPeriods;

        public static AutopilotPolicySilentPeriodConfig build(java.util.Map<String, ?> map) throws Exception {
            AutopilotPolicySilentPeriodConfig self = new AutopilotPolicySilentPeriodConfig();
            return TeaModel.build(map, self);
        }

        public AutopilotPolicySilentPeriodConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AutopilotPolicySilentPeriodConfig setSilentPeriods(java.util.List<AutopilotPolicySilentPeriodConfigSilentPeriods> silentPeriods) {
            this.silentPeriods = silentPeriods;
            return this;
        }
        public java.util.List<AutopilotPolicySilentPeriodConfigSilentPeriods> getSilentPeriods() {
            return this.silentPeriods;
        }

    }

}
