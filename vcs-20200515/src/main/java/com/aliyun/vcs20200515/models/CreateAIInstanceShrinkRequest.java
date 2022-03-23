// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceShrinkRequest extends TeaModel {
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
    public String scheduleCycleDatesShrink;

    // 执行时间段，支持多段，指定多段时不能重合交错。
    @NameInMap("ScheduleTimes")
    public String scheduleTimesShrink;

    // 调度类型
    @NameInMap("ScheduleType")
    public String scheduleType;

    // 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
    @NameInMap("Spf")
    public Long spf;

    public static CreateAIInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIInstanceShrinkRequest self = new CreateAIInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIInstanceShrinkRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateAIInstanceShrinkRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public CreateAIInstanceShrinkRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public CreateAIInstanceShrinkRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateAIInstanceShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateAIInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAIInstanceShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAIInstanceShrinkRequest setScheduleCycleDatesShrink(String scheduleCycleDatesShrink) {
        this.scheduleCycleDatesShrink = scheduleCycleDatesShrink;
        return this;
    }
    public String getScheduleCycleDatesShrink() {
        return this.scheduleCycleDatesShrink;
    }

    public CreateAIInstanceShrinkRequest setScheduleTimesShrink(String scheduleTimesShrink) {
        this.scheduleTimesShrink = scheduleTimesShrink;
        return this;
    }
    public String getScheduleTimesShrink() {
        return this.scheduleTimesShrink;
    }

    public CreateAIInstanceShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateAIInstanceShrinkRequest setSpf(Long spf) {
        this.spf = spf;
        return this;
    }
    public Long getSpf() {
        return this.spf;
    }

}
