// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("ComputeType")
    public String computeType;

    @NameInMap("ContainerType")
    public String containerType;

    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("DataSourceTimes")
    public java.util.List<CreateAIInstanceRequestDataSourceTimes> dataSourceTimes;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Fps")
    public Long fps;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ScheduleCycleDates")
    public java.util.List<Long> scheduleCycleDates;

    @NameInMap("ScheduleTimes")
    public java.util.List<CreateAIInstanceRequestScheduleTimes> scheduleTimes;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("Spf")
    public Long spf;

    public static CreateAIInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIInstanceRequest self = new CreateAIInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIInstanceRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateAIInstanceRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public CreateAIInstanceRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public CreateAIInstanceRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public CreateAIInstanceRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateAIInstanceRequest setDataSourceTimes(java.util.List<CreateAIInstanceRequestDataSourceTimes> dataSourceTimes) {
        this.dataSourceTimes = dataSourceTimes;
        return this;
    }
    public java.util.List<CreateAIInstanceRequestDataSourceTimes> getDataSourceTimes() {
        return this.dataSourceTimes;
    }

    public CreateAIInstanceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateAIInstanceRequest setFps(Long fps) {
        this.fps = fps;
        return this;
    }
    public Long getFps() {
        return this.fps;
    }

    public CreateAIInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAIInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateAIInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAIInstanceRequest setScheduleCycleDates(java.util.List<Long> scheduleCycleDates) {
        this.scheduleCycleDates = scheduleCycleDates;
        return this;
    }
    public java.util.List<Long> getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    public CreateAIInstanceRequest setScheduleTimes(java.util.List<CreateAIInstanceRequestScheduleTimes> scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public java.util.List<CreateAIInstanceRequestScheduleTimes> getScheduleTimes() {
        return this.scheduleTimes;
    }

    public CreateAIInstanceRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateAIInstanceRequest setSpf(Long spf) {
        this.spf = spf;
        return this;
    }
    public Long getSpf() {
        return this.spf;
    }

    public static class CreateAIInstanceRequestDataSourceTimes extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static CreateAIInstanceRequestDataSourceTimes build(java.util.Map<String, ?> map) throws Exception {
            CreateAIInstanceRequestDataSourceTimes self = new CreateAIInstanceRequestDataSourceTimes();
            return TeaModel.build(map, self);
        }

        public CreateAIInstanceRequestDataSourceTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateAIInstanceRequestDataSourceTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateAIInstanceRequestScheduleTimes extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static CreateAIInstanceRequestScheduleTimes build(java.util.Map<String, ?> map) throws Exception {
            CreateAIInstanceRequestScheduleTimes self = new CreateAIInstanceRequestScheduleTimes();
            return TeaModel.build(map, self);
        }

        public CreateAIInstanceRequestScheduleTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateAIInstanceRequestScheduleTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
