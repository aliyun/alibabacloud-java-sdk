// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceRequest extends TeaModel {
    @NameInMap("AcuUsed")
    public Long acuUsed;

    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("Algorithms")
    public java.util.List<CreateComputeInstanceRequestAlgorithms> algorithms;

    @NameInMap("ComputePictureType")
    public String computePictureType;

    @NameInMap("ComputePictureValue")
    public String computePictureValue;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("Devices")
    public java.util.List<CreateComputeInstanceRequestDevices> devices;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsFrameExtraction")
    public String isFrameExtraction;

    @NameInMap("IsPolling")
    public Boolean isPolling;

    @NameInMap("OverallExecutionTime")
    public String overallExecutionTime;

    @NameInMap("PicTopic")
    public String picTopic;

    @NameInMap("PicType")
    public String picType;

    @NameInMap("PollingConfigs")
    public String pollingConfigs;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ScheduleCycleDate")
    public String scheduleCycleDate;

    @NameInMap("ScheduleDay")
    public String scheduleDay;

    @NameInMap("ScheduleDaySize")
    public String scheduleDaySize;

    @NameInMap("ScheduleTimes")
    public String scheduleTimes;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("SliceExecutionTime")
    public String sliceExecutionTime;

    @NameInMap("StorageUsed")
    public String storageUsed;

    public static CreateComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceRequest self = new CreateComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceRequest setAcuUsed(Long acuUsed) {
        this.acuUsed = acuUsed;
        return this;
    }
    public Long getAcuUsed() {
        return this.acuUsed;
    }

    public CreateComputeInstanceRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public CreateComputeInstanceRequest setAlgorithms(java.util.List<CreateComputeInstanceRequestAlgorithms> algorithms) {
        this.algorithms = algorithms;
        return this;
    }
    public java.util.List<CreateComputeInstanceRequestAlgorithms> getAlgorithms() {
        return this.algorithms;
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

    public CreateComputeInstanceRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateComputeInstanceRequest setDevices(java.util.List<CreateComputeInstanceRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<CreateComputeInstanceRequestDevices> getDevices() {
        return this.devices;
    }

    public CreateComputeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateComputeInstanceRequest setIsFrameExtraction(String isFrameExtraction) {
        this.isFrameExtraction = isFrameExtraction;
        return this;
    }
    public String getIsFrameExtraction() {
        return this.isFrameExtraction;
    }

    public CreateComputeInstanceRequest setIsPolling(Boolean isPolling) {
        this.isPolling = isPolling;
        return this;
    }
    public Boolean getIsPolling() {
        return this.isPolling;
    }

    public CreateComputeInstanceRequest setOverallExecutionTime(String overallExecutionTime) {
        this.overallExecutionTime = overallExecutionTime;
        return this;
    }
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    public CreateComputeInstanceRequest setPicTopic(String picTopic) {
        this.picTopic = picTopic;
        return this;
    }
    public String getPicTopic() {
        return this.picTopic;
    }

    public CreateComputeInstanceRequest setPicType(String picType) {
        this.picType = picType;
        return this;
    }
    public String getPicType() {
        return this.picType;
    }

    public CreateComputeInstanceRequest setPollingConfigs(String pollingConfigs) {
        this.pollingConfigs = pollingConfigs;
        return this;
    }
    public String getPollingConfigs() {
        return this.pollingConfigs;
    }

    public CreateComputeInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateComputeInstanceRequest setScheduleCycleDate(String scheduleCycleDate) {
        this.scheduleCycleDate = scheduleCycleDate;
        return this;
    }
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
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

    public CreateComputeInstanceRequest setScheduleTimes(String scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    public CreateComputeInstanceRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateComputeInstanceRequest setSliceExecutionTime(String sliceExecutionTime) {
        this.sliceExecutionTime = sliceExecutionTime;
        return this;
    }
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    public CreateComputeInstanceRequest setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public static class CreateComputeInstanceRequestAlgorithms extends TeaModel {
        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("AlgorithmName")
        public String algorithmName;

        public static CreateComputeInstanceRequestAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeInstanceRequestAlgorithms self = new CreateComputeInstanceRequestAlgorithms();
            return TeaModel.build(map, self);
        }

        public CreateComputeInstanceRequestAlgorithms setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public CreateComputeInstanceRequestAlgorithms setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

    }

    public static class CreateComputeInstanceRequestDevices extends TeaModel {
        @NameInMap("BitRate")
        public String bitRate;

        @NameInMap("CodingFormat")
        public String codingFormat;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResolvingPower")
        public String resolvingPower;

        @NameInMap("StartStream")
        public Boolean startStream;

        public static CreateComputeInstanceRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeInstanceRequestDevices self = new CreateComputeInstanceRequestDevices();
            return TeaModel.build(map, self);
        }

        public CreateComputeInstanceRequestDevices setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public CreateComputeInstanceRequestDevices setCodingFormat(String codingFormat) {
            this.codingFormat = codingFormat;
            return this;
        }
        public String getCodingFormat() {
            return this.codingFormat;
        }

        public CreateComputeInstanceRequestDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CreateComputeInstanceRequestDevices setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateComputeInstanceRequestDevices setResolvingPower(String resolvingPower) {
            this.resolvingPower = resolvingPower;
            return this;
        }
        public String getResolvingPower() {
            return this.resolvingPower;
        }

        public CreateComputeInstanceRequestDevices setStartStream(Boolean startStream) {
            this.startStream = startStream;
            return this;
        }
        public Boolean getStartStream() {
            return this.startStream;
        }

    }

}
