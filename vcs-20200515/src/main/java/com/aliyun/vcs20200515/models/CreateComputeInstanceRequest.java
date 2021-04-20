// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceRequest extends TeaModel {
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
    public java.util.Map<String, ?> devices;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Algorithms")
    public java.util.Map<String, ?> algorithms;

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

    public static CreateComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceRequest self = new CreateComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateComputeInstanceRequest setPicType(String picType) {
        this.picType = picType;
        return this;
    }
    public String getPicType() {
        return this.picType;
    }

    public CreateComputeInstanceRequest setPicTopic(String picTopic) {
        this.picTopic = picTopic;
        return this;
    }
    public String getPicTopic() {
        return this.picTopic;
    }

    public CreateComputeInstanceRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public CreateComputeInstanceRequest setAcuUsed(Long acuUsed) {
        this.acuUsed = acuUsed;
        return this;
    }
    public Long getAcuUsed() {
        return this.acuUsed;
    }

    public CreateComputeInstanceRequest setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public CreateComputeInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateComputeInstanceRequest setDevices(java.util.Map<String, ?> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.Map<String, ?> getDevices() {
        return this.devices;
    }

    public CreateComputeInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateComputeInstanceRequest setAlgorithms(java.util.Map<String, ?> algorithms) {
        this.algorithms = algorithms;
        return this;
    }
    public java.util.Map<String, ?> getAlgorithms() {
        return this.algorithms;
    }

    public CreateComputeInstanceRequest setScheduleDay(String scheduleDay) {
        this.scheduleDay = scheduleDay;
        return this;
    }
    public String getScheduleDay() {
        return this.scheduleDay;
    }

    public CreateComputeInstanceRequest setScheduleDaySize(String scheduleDaySize) {
        this.scheduleDaySize = scheduleDaySize;
        return this;
    }
    public String getScheduleDaySize() {
        return this.scheduleDaySize;
    }

    public CreateComputeInstanceRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateComputeInstanceRequest setScheduleCycleDate(String scheduleCycleDate) {
        this.scheduleCycleDate = scheduleCycleDate;
        return this;
    }
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
    }

    public CreateComputeInstanceRequest setScheduleTimes(String scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    public CreateComputeInstanceRequest setIsPolling(Boolean isPolling) {
        this.isPolling = isPolling;
        return this;
    }
    public Boolean getIsPolling() {
        return this.isPolling;
    }

    public CreateComputeInstanceRequest setSliceExecutionTime(String sliceExecutionTime) {
        this.sliceExecutionTime = sliceExecutionTime;
        return this;
    }
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    public CreateComputeInstanceRequest setOverallExecutionTime(String overallExecutionTime) {
        this.overallExecutionTime = overallExecutionTime;
        return this;
    }
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    public CreateComputeInstanceRequest setPollingConfigs(String pollingConfigs) {
        this.pollingConfigs = pollingConfigs;
        return this;
    }
    public String getPollingConfigs() {
        return this.pollingConfigs;
    }

    public CreateComputeInstanceRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateComputeInstanceRequest setComputePictureType(String computePictureType) {
        this.computePictureType = computePictureType;
        return this;
    }
    public String getComputePictureType() {
        return this.computePictureType;
    }

    public CreateComputeInstanceRequest setComputePictureValue(String computePictureValue) {
        this.computePictureValue = computePictureValue;
        return this;
    }
    public String getComputePictureValue() {
        return this.computePictureValue;
    }

    public CreateComputeInstanceRequest setIsFrameExtraction(String isFrameExtraction) {
        this.isFrameExtraction = isFrameExtraction;
        return this;
    }
    public String getIsFrameExtraction() {
        return this.isFrameExtraction;
    }

}
