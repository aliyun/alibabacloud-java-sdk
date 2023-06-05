// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceShrinkRequest extends TeaModel {
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
    public String dataSourceTimesShrink;

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
    public String scheduleCycleDatesShrink;

    @NameInMap("ScheduleTimes")
    public String scheduleTimesShrink;

    @NameInMap("ScheduleType")
    public String scheduleType;

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

    public CreateAIInstanceShrinkRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public CreateAIInstanceShrinkRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateAIInstanceShrinkRequest setDataSourceTimesShrink(String dataSourceTimesShrink) {
        this.dataSourceTimesShrink = dataSourceTimesShrink;
        return this;
    }
    public String getDataSourceTimesShrink() {
        return this.dataSourceTimesShrink;
    }

    public CreateAIInstanceShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateAIInstanceShrinkRequest setFps(Long fps) {
        this.fps = fps;
        return this;
    }
    public Long getFps() {
        return this.fps;
    }

    public CreateAIInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAIInstanceShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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
