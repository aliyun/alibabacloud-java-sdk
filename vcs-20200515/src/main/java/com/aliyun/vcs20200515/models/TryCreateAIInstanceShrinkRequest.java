// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TryCreateAIInstanceShrinkRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("CameraNumber")
    public Long cameraNumber;

    @NameInMap("ComputeType")
    public String computeType;

    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("DataSourceTimes")
    public String dataSourceTimesShrink;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Fps")
    public Long fps;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ScheduleCycleDates")
    public String scheduleCycleDatesShrink;

    @NameInMap("ScheduleTimes")
    public String scheduleTimesShrink;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("Spf")
    public Long spf;

    public static TryCreateAIInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TryCreateAIInstanceShrinkRequest self = new TryCreateAIInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TryCreateAIInstanceShrinkRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public TryCreateAIInstanceShrinkRequest setCameraNumber(Long cameraNumber) {
        this.cameraNumber = cameraNumber;
        return this;
    }
    public Long getCameraNumber() {
        return this.cameraNumber;
    }

    public TryCreateAIInstanceShrinkRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public TryCreateAIInstanceShrinkRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public TryCreateAIInstanceShrinkRequest setDataSourceTimesShrink(String dataSourceTimesShrink) {
        this.dataSourceTimesShrink = dataSourceTimesShrink;
        return this;
    }
    public String getDataSourceTimesShrink() {
        return this.dataSourceTimesShrink;
    }

    public TryCreateAIInstanceShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public TryCreateAIInstanceShrinkRequest setFps(Long fps) {
        this.fps = fps;
        return this;
    }
    public Long getFps() {
        return this.fps;
    }

    public TryCreateAIInstanceShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public TryCreateAIInstanceShrinkRequest setScheduleCycleDatesShrink(String scheduleCycleDatesShrink) {
        this.scheduleCycleDatesShrink = scheduleCycleDatesShrink;
        return this;
    }
    public String getScheduleCycleDatesShrink() {
        return this.scheduleCycleDatesShrink;
    }

    public TryCreateAIInstanceShrinkRequest setScheduleTimesShrink(String scheduleTimesShrink) {
        this.scheduleTimesShrink = scheduleTimesShrink;
        return this;
    }
    public String getScheduleTimesShrink() {
        return this.scheduleTimesShrink;
    }

    public TryCreateAIInstanceShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public TryCreateAIInstanceShrinkRequest setSpf(Long spf) {
        this.spf = spf;
        return this;
    }
    public Long getSpf() {
        return this.spf;
    }

}
