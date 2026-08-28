// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TuningHistory extends TeaModel {
    /**
     * <p>The action type. Valid values:</p>
     * <ul>
     * <li>SCALE_UP_PARALLELISM: scales up parallelism.</li>
     * <li>SCALE_DOWN_PARALLELISM: scales down parallelism.</li>
     * <li>SCALE_UP_MEMORY: scales up memory.</li>
     * <li>RESTART: restarts the job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SCALE_UP_PARALLELISM</p>
     */
    @NameInMap("actionType")
    public String actionType;

    /**
     * <p>The additional annotations.</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>The full path name of the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>namespaces/ns-xxx/deployments/6aa0d4d1-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <p>Indicates whether this is a hot update. A value of true indicates that the change takes effect without restarting the job. A value of false indicates that the job must be restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isHotUpdate")
    public Boolean isHotUpdate;

    /**
     * <p>The ID of the associated job.</p>
     * 
     * <strong>example:</strong>
     * <p>b462c053-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>The resource configuration after tuning. This value may be null if the tuning failed.</p>
     */
    @NameInMap("newResourceSetting")
    public TuningHistoryNewResourceSetting newResourceSetting;

    /**
     * <p>The resource configuration before tuning.</p>
     */
    @NameInMap("oldResourceSetting")
    public TuningHistoryOldResourceSetting oldResourceSetting;

    /**
     * <p>The trigger timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1718270936000</p>
     */
    @NameInMap("triggerTime")
    public Long triggerTime;

    /**
     * <p>The UUID of the tuning record.</p>
     * 
     * <strong>example:</strong>
     * <p>06d81ae2-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("tuningId")
    public String tuningId;

    /**
     * <p>The tuning message. This is an internationalized, human-readable string that is not recommended for programmatic parsing.</p>
     * 
     * <strong>example:</strong>
     * <p>Scale up parallelism from 2 to 4</p>
     */
    @NameInMap("tuningMessage")
    public String tuningMessage;

    /**
     * <p>The tuning state. Valid values:</p>
     * <ul>
     * <li>SUCCESS: The tuning succeeded.</li>
     * <li>FAILED: The tuning failed.</li>
     * <li>EXECUTING: The tuning is in progress.</li>
     * <li>TERMINATED: The tuning was terminated.</li>
     * <li>FAILED_WITH_ROLLBACK_SUCCESS: The tuning failed but the rollback succeeded.</li>
     * <li>FAILED_WITH_ROLLBACK_FAILED: The tuning failed and the rollback also failed.</li>
     * <li>FAILED_WITH_RESOURCE_LACK: The tuning failed due to insufficient resources.</li>
     * <li>FAILED_WITH_SAME_RESOURCE_SETTING: The tuning failed because the resource configuration did not change.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
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
        /**
         * <p>The number of CPU cores per TaskManager.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>The memory per TaskManager, in a format such as 4 Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>2 Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
        /**
         * <p>The number of CPU cores per TaskManager.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>The memory per TaskManager, in a format such as 4 Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>2 Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
