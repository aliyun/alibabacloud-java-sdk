// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TuningHistory extends TeaModel {
    @NameInMap("actionType")
    public String actionType;

    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("deploymentName")
    public String deploymentName;

    @NameInMap("isHotUpdate")
    public Boolean isHotUpdate;

    @NameInMap("jobId")
    public String jobId;

    @NameInMap("newResourceSetting")
    public TuningHistoryNewResourceSetting newResourceSetting;

    @NameInMap("oldResourceSetting")
    public TuningHistoryOldResourceSetting oldResourceSetting;

    @NameInMap("triggerTime")
    public Long triggerTime;

    @NameInMap("tuningId")
    public String tuningId;

    @NameInMap("tuningMessage")
    public String tuningMessage;

    @NameInMap("tuningState")
    public String tuningState;

    public static TuningHistory build(java.util.Map<String, ?> map) throws Exception {
        TuningHistory self = new TuningHistory();
        return TeaModel.build(map, self);
    }

    public TuningHistory setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public TuningHistory setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public TuningHistory setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

    public TuningHistory setIsHotUpdate(Boolean isHotUpdate) {
        this.isHotUpdate = isHotUpdate;
        return this;
    }
    public Boolean getIsHotUpdate() {
        return this.isHotUpdate;
    }

    public TuningHistory setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TuningHistory setNewResourceSetting(TuningHistoryNewResourceSetting newResourceSetting) {
        this.newResourceSetting = newResourceSetting;
        return this;
    }
    public TuningHistoryNewResourceSetting getNewResourceSetting() {
        return this.newResourceSetting;
    }

    public TuningHistory setOldResourceSetting(TuningHistoryOldResourceSetting oldResourceSetting) {
        this.oldResourceSetting = oldResourceSetting;
        return this;
    }
    public TuningHistoryOldResourceSetting getOldResourceSetting() {
        return this.oldResourceSetting;
    }

    public TuningHistory setTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }
    public Long getTriggerTime() {
        return this.triggerTime;
    }

    public TuningHistory setTuningId(String tuningId) {
        this.tuningId = tuningId;
        return this;
    }
    public String getTuningId() {
        return this.tuningId;
    }

    public TuningHistory setTuningMessage(String tuningMessage) {
        this.tuningMessage = tuningMessage;
        return this;
    }
    public String getTuningMessage() {
        return this.tuningMessage;
    }

    public TuningHistory setTuningState(String tuningState) {
        this.tuningState = tuningState;
        return this;
    }
    public String getTuningState() {
        return this.tuningState;
    }

    public static class TuningHistoryNewResourceSetting extends TeaModel {
        @NameInMap("cpu")
        public Double cpu;

        @NameInMap("memory")
        public String memory;

        @NameInMap("parallelism")
        public Integer parallelism;

        public static TuningHistoryNewResourceSetting build(java.util.Map<String, ?> map) throws Exception {
            TuningHistoryNewResourceSetting self = new TuningHistoryNewResourceSetting();
            return TeaModel.build(map, self);
        }

        public TuningHistoryNewResourceSetting setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public TuningHistoryNewResourceSetting setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public TuningHistoryNewResourceSetting setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

    }

    public static class TuningHistoryOldResourceSetting extends TeaModel {
        @NameInMap("cpu")
        public Double cpu;

        @NameInMap("memory")
        public String memory;

        @NameInMap("parallelism")
        public Integer parallelism;

        public static TuningHistoryOldResourceSetting build(java.util.Map<String, ?> map) throws Exception {
            TuningHistoryOldResourceSetting self = new TuningHistoryOldResourceSetting();
            return TeaModel.build(map, self);
        }

        public TuningHistoryOldResourceSetting setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public TuningHistoryOldResourceSetting setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public TuningHistoryOldResourceSetting setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

    }

}
