// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskStatistic extends TeaModel {
    /**
     * <p>Data items that passed</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcceptItemCount")
    public Float acceptItemCount;

    /**
     * <p>Quantity abandoned in the check flow</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckAbandon")
    public Float checkAbandon;

    /**
     * <p>Inspection accuracy</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckAccuracy")
    public Float checkAccuracy;

    /**
     * <p>Inspection efficiency (items/hour)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckEfficiency")
    public Float checkEfficiency;

    /**
     * <p>Check accuracy</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckedAccuracy")
    public Float checkedAccuracy;

    /**
     * <p>Number of errors found in the inspection flow</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckedError")
    public Float checkedError;

    /**
     * <p>Number of checks</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckedRejectCount")
    public Float checkedRejectCount;

    /**
     * <p>Discarded data items</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FinalAbandonCount")
    public Float finalAbandonCount;

    /**
     * <p>Completed data items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FinishedItemCount")
    public Long finishedItemCount;

    /**
     * <p>Quantity of completed subtasks</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FinishedSubtaskCount")
    public Long finishedSubtaskCount;

    /**
     * <p>Annotation efficiency (items/hour)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MarkEfficiency")
    public Float markEfficiency;

    /**
     * <p>Quantity of corrections made during pre-annotation</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("PreMarkFixedCount")
    public Float preMarkFixedCount;

    /**
     * <p>Sampling accuracy</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SampledAccuracy")
    public Float sampledAccuracy;

    /**
     * <p>Number of sampled fault samples</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SampledErrorCount")
    public Float sampledErrorCount;

    /**
     * <p>Number of samples denied</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SampledRejectCount")
    public Float sampledRejectCount;

    /**
     * <p>Sampling accuracy</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplingAccuracy")
    public Float samplingAccuracy;

    /**
     * <p>Total number of check flow steps</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCheckCount")
    public Float totalCheckCount;

    /**
     * <p>Total check time (hours)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCheckTime")
    public Float totalCheckTime;

    /**
     * <p>Total number of checks</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCheckedCount")
    public Float totalCheckedCount;

    /**
     * <p>Total number of data items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalItemCount")
    public Long totalItemCount;

    /**
     * <p>Total time spent in the annotation phase (hours)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalMarkTime")
    public Float totalMarkTime;

    /**
     * <p>Total sampling quantity</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalSampledCount")
    public Float totalSampledCount;

    /**
     * <p>Total number of sampled validations</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalSamplingCount")
    public Float totalSamplingCount;

    /**
     * <p>Total number of subtasks</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalSubtaskCount")
    public Long totalSubtaskCount;

    /**
     * <p>Total work time (hours)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalWorkTime")
    public Float totalWorkTime;

    public static TaskStatistic build(java.util.Map<String, ?> map) throws Exception {
        TaskStatistic self = new TaskStatistic();
        return TeaModel.build(map, self);
    }

    public TaskStatistic setAcceptItemCount(Float acceptItemCount) {
        this.acceptItemCount = acceptItemCount;
        return this;
    }
    public Float getAcceptItemCount() {
        return this.acceptItemCount;
    }

    public TaskStatistic setCheckAbandon(Float checkAbandon) {
        this.checkAbandon = checkAbandon;
        return this;
    }
    public Float getCheckAbandon() {
        return this.checkAbandon;
    }

    public TaskStatistic setCheckAccuracy(Float checkAccuracy) {
        this.checkAccuracy = checkAccuracy;
        return this;
    }
    public Float getCheckAccuracy() {
        return this.checkAccuracy;
    }

    public TaskStatistic setCheckEfficiency(Float checkEfficiency) {
        this.checkEfficiency = checkEfficiency;
        return this;
    }
    public Float getCheckEfficiency() {
        return this.checkEfficiency;
    }

    public TaskStatistic setCheckedAccuracy(Float checkedAccuracy) {
        this.checkedAccuracy = checkedAccuracy;
        return this;
    }
    public Float getCheckedAccuracy() {
        return this.checkedAccuracy;
    }

    public TaskStatistic setCheckedError(Float checkedError) {
        this.checkedError = checkedError;
        return this;
    }
    public Float getCheckedError() {
        return this.checkedError;
    }

    public TaskStatistic setCheckedRejectCount(Float checkedRejectCount) {
        this.checkedRejectCount = checkedRejectCount;
        return this;
    }
    public Float getCheckedRejectCount() {
        return this.checkedRejectCount;
    }

    public TaskStatistic setFinalAbandonCount(Float finalAbandonCount) {
        this.finalAbandonCount = finalAbandonCount;
        return this;
    }
    public Float getFinalAbandonCount() {
        return this.finalAbandonCount;
    }

    public TaskStatistic setFinishedItemCount(Long finishedItemCount) {
        this.finishedItemCount = finishedItemCount;
        return this;
    }
    public Long getFinishedItemCount() {
        return this.finishedItemCount;
    }

    public TaskStatistic setFinishedSubtaskCount(Long finishedSubtaskCount) {
        this.finishedSubtaskCount = finishedSubtaskCount;
        return this;
    }
    public Long getFinishedSubtaskCount() {
        return this.finishedSubtaskCount;
    }

    public TaskStatistic setMarkEfficiency(Float markEfficiency) {
        this.markEfficiency = markEfficiency;
        return this;
    }
    public Float getMarkEfficiency() {
        return this.markEfficiency;
    }

    public TaskStatistic setPreMarkFixedCount(Float preMarkFixedCount) {
        this.preMarkFixedCount = preMarkFixedCount;
        return this;
    }
    public Float getPreMarkFixedCount() {
        return this.preMarkFixedCount;
    }

    public TaskStatistic setSampledAccuracy(Float sampledAccuracy) {
        this.sampledAccuracy = sampledAccuracy;
        return this;
    }
    public Float getSampledAccuracy() {
        return this.sampledAccuracy;
    }

    public TaskStatistic setSampledErrorCount(Float sampledErrorCount) {
        this.sampledErrorCount = sampledErrorCount;
        return this;
    }
    public Float getSampledErrorCount() {
        return this.sampledErrorCount;
    }

    public TaskStatistic setSampledRejectCount(Float sampledRejectCount) {
        this.sampledRejectCount = sampledRejectCount;
        return this;
    }
    public Float getSampledRejectCount() {
        return this.sampledRejectCount;
    }

    public TaskStatistic setSamplingAccuracy(Float samplingAccuracy) {
        this.samplingAccuracy = samplingAccuracy;
        return this;
    }
    public Float getSamplingAccuracy() {
        return this.samplingAccuracy;
    }

    public TaskStatistic setTotalCheckCount(Float totalCheckCount) {
        this.totalCheckCount = totalCheckCount;
        return this;
    }
    public Float getTotalCheckCount() {
        return this.totalCheckCount;
    }

    public TaskStatistic setTotalCheckTime(Float totalCheckTime) {
        this.totalCheckTime = totalCheckTime;
        return this;
    }
    public Float getTotalCheckTime() {
        return this.totalCheckTime;
    }

    public TaskStatistic setTotalCheckedCount(Float totalCheckedCount) {
        this.totalCheckedCount = totalCheckedCount;
        return this;
    }
    public Float getTotalCheckedCount() {
        return this.totalCheckedCount;
    }

    public TaskStatistic setTotalItemCount(Long totalItemCount) {
        this.totalItemCount = totalItemCount;
        return this;
    }
    public Long getTotalItemCount() {
        return this.totalItemCount;
    }

    public TaskStatistic setTotalMarkTime(Float totalMarkTime) {
        this.totalMarkTime = totalMarkTime;
        return this;
    }
    public Float getTotalMarkTime() {
        return this.totalMarkTime;
    }

    public TaskStatistic setTotalSampledCount(Float totalSampledCount) {
        this.totalSampledCount = totalSampledCount;
        return this;
    }
    public Float getTotalSampledCount() {
        return this.totalSampledCount;
    }

    public TaskStatistic setTotalSamplingCount(Float totalSamplingCount) {
        this.totalSamplingCount = totalSamplingCount;
        return this;
    }
    public Float getTotalSamplingCount() {
        return this.totalSamplingCount;
    }

    public TaskStatistic setTotalSubtaskCount(Long totalSubtaskCount) {
        this.totalSubtaskCount = totalSubtaskCount;
        return this;
    }
    public Long getTotalSubtaskCount() {
        return this.totalSubtaskCount;
    }

    public TaskStatistic setTotalWorkTime(Float totalWorkTime) {
        this.totalWorkTime = totalWorkTime;
        return this;
    }
    public Float getTotalWorkTime() {
        return this.totalWorkTime;
    }

}
