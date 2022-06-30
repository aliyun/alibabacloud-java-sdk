// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TryCreateAIInstanceShrinkRequest extends TeaModel {
    // 算子Id
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("CameraNumber")
    public Long cameraNumber;

    // 计算类型
    @NameInMap("ComputeType")
    public String computeType;

    // 数据来源
    @NameInMap("DataSource")
    public String dataSource;

    // 数据源时间段
    @NameInMap("DataSourceTimes")
    public String dataSourceTimesShrink;

    // 数据类型
    @NameInMap("DataType")
    public String dataType;

    // 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
    @NameInMap("Fps")
    public Long fps;

    // 实例类型
    @NameInMap("InstanceType")
    public String instanceType;

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
