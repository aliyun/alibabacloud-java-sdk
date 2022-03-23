// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceRequest extends TeaModel {
    // 算子Id
    @NameInMap("AlgorithmId")
    public String algorithmId;

    // 算法名称
    @NameInMap("AlgorithmName")
    public String algorithmName;

    // 计算类型
    @NameInMap("ComputeType")
    public String computeType;

    // 数据来源
    @NameInMap("DataSource")
    public String dataSource;

    // 数据类型
    @NameInMap("DataType")
    public String dataType;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 所属项目Id
    @NameInMap("ProjectId")
    public String projectId;

    // ScheduleType为EVERY_WEEK、EVERY_MONTH时必填
    @NameInMap("ScheduleCycleDates")
    public java.util.List<Long> scheduleCycleDates;

    // 执行时间段，支持多段，指定多段时不能重合交错。
    @NameInMap("ScheduleTimes")
    public java.util.List<CreateAIInstanceRequestScheduleTimes> scheduleTimes;

    // 调度类型
    @NameInMap("ScheduleType")
    public String scheduleType;

    // 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
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

    public CreateAIInstanceRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateAIInstanceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateAIInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
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

    public static class CreateAIInstanceRequestScheduleTimes extends TeaModel {
        // 结束执行时间
        @NameInMap("EndTime")
        public String endTime;

        // 开始执行时间
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
