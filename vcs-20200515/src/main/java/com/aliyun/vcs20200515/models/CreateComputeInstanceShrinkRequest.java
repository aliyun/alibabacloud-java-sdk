// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicType")
    public String picType;

    @NameInMap("PicTopic")
    public String picTopic;

    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("AcuUsed")
    public Long acuUsed;

    @NameInMap("StorageUsed")
    public String storageUsed;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Devices")
    public String devicesShrink;

    @NameInMap("Algorithms")
    public String algorithmsShrink;

    @NameInMap("ScheduleDay")
    public String scheduleDay;

    @NameInMap("ScheduleDaySize")
    public String scheduleDaySize;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("ScheduleCycleDate")
    public String scheduleCycleDate;

    @NameInMap("ScheduleTimes")
    public String scheduleTimes;

    @NameInMap("IsPolling")
    public Boolean isPolling;

    @NameInMap("SliceExecutionTime")
    public String sliceExecutionTime;

    @NameInMap("OverallExecutionTime")
    public String overallExecutionTime;

    @NameInMap("PollingConfigs")
    public String pollingConfigs;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("ComputePictureType")
    public String computePictureType;

    @NameInMap("ComputePictureValue")
    public String computePictureValue;

    @NameInMap("IsFrameExtraction")
    public String isFrameExtraction;

    public static CreateComputeInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceShrinkRequest self = new CreateComputeInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateComputeInstanceShrinkRequest setPicType(String picType) {
        this.picType = picType;
        return this;
    }
    public String getPicType() {
        return this.picType;
    }

    public CreateComputeInstanceShrinkRequest setPicTopic(String picTopic) {
        this.picTopic = picTopic;
        return this;
    }
    public String getPicTopic() {
        return this.picTopic;
    }

    public CreateComputeInstanceShrinkRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public CreateComputeInstanceShrinkRequest setAcuUsed(Long acuUsed) {
        this.acuUsed = acuUsed;
        return this;
    }
    public Long getAcuUsed() {
        return this.acuUsed;
    }

    public CreateComputeInstanceShrinkRequest setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public CreateComputeInstanceShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateComputeInstanceShrinkRequest setDevicesShrink(String devicesShrink) {
        this.devicesShrink = devicesShrink;
        return this;
    }
    public String getDevicesShrink() {
        return this.devicesShrink;
    }

    public CreateComputeInstanceShrinkRequest setAlgorithmsShrink(String algorithmsShrink) {
        this.algorithmsShrink = algorithmsShrink;
        return this;
    }
    public String getAlgorithmsShrink() {
        return this.algorithmsShrink;
    }

    public CreateComputeInstanceShrinkRequest setScheduleDay(String scheduleDay) {
        this.scheduleDay = scheduleDay;
        return this;
    }
    public String getScheduleDay() {
        return this.scheduleDay;
    }

    public CreateComputeInstanceShrinkRequest setScheduleDaySize(String scheduleDaySize) {
        this.scheduleDaySize = scheduleDaySize;
        return this;
    }
    public String getScheduleDaySize() {
        return this.scheduleDaySize;
    }

    public CreateComputeInstanceShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateComputeInstanceShrinkRequest setScheduleCycleDate(String scheduleCycleDate) {
        this.scheduleCycleDate = scheduleCycleDate;
        return this;
    }
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
    }

    public CreateComputeInstanceShrinkRequest setScheduleTimes(String scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    public CreateComputeInstanceShrinkRequest setIsPolling(Boolean isPolling) {
        this.isPolling = isPolling;
        return this;
    }
    public Boolean getIsPolling() {
        return this.isPolling;
    }

    public CreateComputeInstanceShrinkRequest setSliceExecutionTime(String sliceExecutionTime) {
        this.sliceExecutionTime = sliceExecutionTime;
        return this;
    }
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    public CreateComputeInstanceShrinkRequest setOverallExecutionTime(String overallExecutionTime) {
        this.overallExecutionTime = overallExecutionTime;
        return this;
    }
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    public CreateComputeInstanceShrinkRequest setPollingConfigs(String pollingConfigs) {
        this.pollingConfigs = pollingConfigs;
        return this;
    }
    public String getPollingConfigs() {
        return this.pollingConfigs;
    }

    public CreateComputeInstanceShrinkRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateComputeInstanceShrinkRequest setComputePictureType(String computePictureType) {
        this.computePictureType = computePictureType;
        return this;
    }
    public String getComputePictureType() {
        return this.computePictureType;
    }

    public CreateComputeInstanceShrinkRequest setComputePictureValue(String computePictureValue) {
        this.computePictureValue = computePictureValue;
        return this;
    }
    public String getComputePictureValue() {
        return this.computePictureValue;
    }

    public CreateComputeInstanceShrinkRequest setIsFrameExtraction(String isFrameExtraction) {
        this.isFrameExtraction = isFrameExtraction;
        return this;
    }
    public String getIsFrameExtraction() {
        return this.isFrameExtraction;
    }

}
