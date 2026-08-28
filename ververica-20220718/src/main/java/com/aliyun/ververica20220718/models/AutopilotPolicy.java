// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AutopilotPolicy extends TeaModel {
    /**
     * <p>The advanced rule configuration. This includes advanced parameters such as chain-break optimization, minimum parallelism, and TM CPU scaling. Disabled by default and must be explicitly enabled.</p>
     */
    @NameInMap("advancedRules")
    public AutopilotPolicyAdvancedRules advancedRules;

    /**
     * <p>The upper and lower limits for tuning resources.</p>
     */
    @NameInMap("limits")
    public AutopilotPolicyLimits limits;

    /**
     * <p>The scale-down rule configuration.</p>
     */
    @NameInMap("scaleDownRules")
    public AutopilotPolicyScaleDownRules scaleDownRules;

    /**
     * <p>The scale-up rule configuration.</p>
     */
    @NameInMap("scaleUpRules")
    public AutopilotPolicyScaleUpRules scaleUpRules;

    /**
     * <p>The silent period configuration. Automatic tuning operations are not performed during silent periods.</p>
     */
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
        /**
         * <p>Specifies whether to enable advanced rules.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The advanced rule parameters. An empty map indicates that internal default parameters are used. You can override specific internal parameters by using key-value pairs. The entire map is replaced.</p>
         */
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
        /**
         * <p>The minimum cool-down time between two tuning operations, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("coolDownMinutes")
        public Long coolDownMinutes;

        /**
         * <p>The maximum CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("jobMaxCpu")
        public Double jobMaxCpu;

        /**
         * <p>The maximum memory. Format examples: 4Gi, 256GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>64GiB</p>
         */
        @NameInMap("jobMaxMemory")
        public String jobMaxMemory;

        /**
         * <p>The maximum parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("jobMaxParallelism")
        public Integer jobMaxParallelism;

        /**
         * <p>The minimum parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Specifies whether to enable memory scale-down.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The memory scale-down sampling interval. Format examples: 4h, 5m.</p>
         * 
         * <strong>example:</strong>
         * <p>25h</p>
         */
        @NameInMap("memUsageScaleDownSampleInterval")
        public String memUsageScaleDownSampleInterval;

        /**
         * <p>The memory scale-down threshold. Valid values: 0.0 to 1.0. Scale-down is triggered when memory usage falls below this value. This value must be less than the scale-up threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
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
        /**
         * <p>Specifies whether to enable slot idle scale-down.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The slot idle sampling interval. Format examples: 4h, 5m.</p>
         * 
         * <strong>example:</strong>
         * <p>24h</p>
         */
        @NameInMap("slotBusyScaleDownSampleInterval")
        public String slotBusyScaleDownSampleInterval;

        /**
         * <p>The slot idle scale-down threshold. Valid values: 0.0 to 1.0. Scale-down is triggered when the slot busy ratio falls below this value. This value must be less than the scale-up threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
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
        /**
         * <p>The memory scale-down rule. Scale-down is triggered when memory usage falls below the threshold.</p>
         */
        @NameInMap("memoryScaleDownRule")
        public AutopilotPolicyScaleDownRulesMemoryScaleDownRule memoryScaleDownRule;

        /**
         * <p>The slot idle scale-down rule. Scale-down is triggered when the slot busy ratio falls below the threshold.</p>
         */
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
        /**
         * <p>The delay sampling interval. Format examples: 3min, 5m, 1h.</p>
         * 
         * <strong>example:</strong>
         * <p>3min</p>
         */
        @NameInMap("delaySampleInterval")
        public String delaySampleInterval;

        /**
         * <p>The latency threshold. Format examples: 1min, 10m. Scale-up is triggered when the delay continuously exceeds this threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>1min</p>
         */
        @NameInMap("delayThreshold")
        public String delayThreshold;

        /**
         * <p>Specifies whether to enable delay detection scale-up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Specifies whether to enable GC tuning.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The GC sampling interval. Format examples: 3min, 5m.</p>
         * 
         * <strong>example:</strong>
         * <p>3min</p>
         */
        @NameInMap("gcSampleInterval")
        public String gcSampleInterval;

        /**
         * <p>The GC time ratio threshold. Valid values: 0.0 to 1.0. Scale-up is triggered when the GC time ratio exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
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
        /**
         * <p>Specifies whether to enable memory scale-up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The memory scale-up threshold. Valid values: 0.0 to 1.0. Scale-up is triggered when memory usage exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
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
        /**
         * <p>Specifies whether to enable OOM scale-up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Specifies whether to enable slot busy scale-up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The slot busy sampling interval. Format examples: 6min, 5m.</p>
         * 
         * <strong>example:</strong>
         * <p>6min</p>
         */
        @NameInMap("slotBusyScaleUpSampleInterval")
        public String slotBusyScaleUpSampleInterval;

        /**
         * <p>The slot busy scale-up threshold. Valid values: 0.0 to 1.0. Scale-up is triggered when the slot busy ratio exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
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
        /**
         * <p>The delay detection scale-up rule. Scale-up is triggered when the job delay exceeds the threshold.</p>
         */
        @NameInMap("delayRule")
        public AutopilotPolicyScaleUpRulesDelayRule delayRule;

        /**
         * <p>The GC tuning rule. Scale-up is triggered when the GC time ratio exceeds the threshold.</p>
         */
        @NameInMap("gcRule")
        public AutopilotPolicyScaleUpRulesGcRule gcRule;

        /**
         * <p>The memory scale-up rule. Scale-up is triggered when memory usage exceeds the threshold.</p>
         */
        @NameInMap("memoryScaleUpRule")
        public AutopilotPolicyScaleUpRulesMemoryScaleUpRule memoryScaleUpRule;

        /**
         * <p>The OOM scale-up rule. Scale-up is triggered when an OOM risk is detected.</p>
         */
        @NameInMap("oomScaleUpRule")
        public AutopilotPolicyScaleUpRulesOomScaleUpRule oomScaleUpRule;

        /**
         * <p>The slot busy scale-up rule. Scale-up is triggered when the slot busy ratio exceeds the threshold.</p>
         */
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
        /**
         * <p>The start time. For the DAY level: 0-1439, representing the minute offset of the day (for example, 540 represents 9:00). For the WEEK level: 1-7, representing the day of the week (ISO 8601, 1=Monday, 7=Sunday).</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("beginTime")
        public Long beginTime;

        /**
         * <p>The end time. The format is the same as beginTime. For the WEEK level, if endTime is less than beginTime, it indicates a cross-week period (for example, beginTime=6, endTime=2 means silent from Saturday to the following Tuesday).</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The silent level. DAY indicates daily repetition. WEEK indicates weekly repetition.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
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
        /**
         * <p>Specifies whether to enable silent periods.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of silent periods. This is a full replacement, not an append operation.</p>
         */
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
