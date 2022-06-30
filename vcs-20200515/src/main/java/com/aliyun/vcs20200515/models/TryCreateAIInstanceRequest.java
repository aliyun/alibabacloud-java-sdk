// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TryCreateAIInstanceRequest extends TeaModel {
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
    public java.util.List<TryCreateAIInstanceRequestDataSourceTimes> dataSourceTimes;

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
    public java.util.List<Long> scheduleCycleDates;

    // 执行时间段，支持多段，指定多段时不能重合交错。
    @NameInMap("ScheduleTimes")
    public java.util.List<TryCreateAIInstanceRequestScheduleTimes> scheduleTimes;

    // 调度类型
    @NameInMap("ScheduleType")
    public String scheduleType;

    // 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
    @NameInMap("Spf")
    public Long spf;

    public static TryCreateAIInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TryCreateAIInstanceRequest self = new TryCreateAIInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TryCreateAIInstanceRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public TryCreateAIInstanceRequest setCameraNumber(Long cameraNumber) {
        this.cameraNumber = cameraNumber;
        return this;
    }
    public Long getCameraNumber() {
        return this.cameraNumber;
    }

    public TryCreateAIInstanceRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public TryCreateAIInstanceRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public TryCreateAIInstanceRequest setDataSourceTimes(java.util.List<TryCreateAIInstanceRequestDataSourceTimes> dataSourceTimes) {
        this.dataSourceTimes = dataSourceTimes;
        return this;
    }
    public java.util.List<TryCreateAIInstanceRequestDataSourceTimes> getDataSourceTimes() {
        return this.dataSourceTimes;
    }

    public TryCreateAIInstanceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public TryCreateAIInstanceRequest setFps(Long fps) {
        this.fps = fps;
        return this;
    }
    public Long getFps() {
        return this.fps;
    }

    public TryCreateAIInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public TryCreateAIInstanceRequest setScheduleCycleDates(java.util.List<Long> scheduleCycleDates) {
        this.scheduleCycleDates = scheduleCycleDates;
        return this;
    }
    public java.util.List<Long> getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    public TryCreateAIInstanceRequest setScheduleTimes(java.util.List<TryCreateAIInstanceRequestScheduleTimes> scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public java.util.List<TryCreateAIInstanceRequestScheduleTimes> getScheduleTimes() {
        return this.scheduleTimes;
    }

    public TryCreateAIInstanceRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public TryCreateAIInstanceRequest setSpf(Long spf) {
        this.spf = spf;
        return this;
    }
    public Long getSpf() {
        return this.spf;
    }

    public static class TryCreateAIInstanceRequestDataSourceTimes extends TeaModel {
        // 视频结束时间
        @NameInMap("EndTime")
        public String endTime;

        // 视频开始时间
        @NameInMap("StartTime")
        public String startTime;

        public static TryCreateAIInstanceRequestDataSourceTimes build(java.util.Map<String, ?> map) throws Exception {
            TryCreateAIInstanceRequestDataSourceTimes self = new TryCreateAIInstanceRequestDataSourceTimes();
            return TeaModel.build(map, self);
        }

        public TryCreateAIInstanceRequestDataSourceTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TryCreateAIInstanceRequestDataSourceTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class TryCreateAIInstanceRequestScheduleTimes extends TeaModel {
        // 结束执行时间
        @NameInMap("EndTime")
        public String endTime;

        // 开始执行时间
        @NameInMap("StartTime")
        public String startTime;

        public static TryCreateAIInstanceRequestScheduleTimes build(java.util.Map<String, ?> map) throws Exception {
            TryCreateAIInstanceRequestScheduleTimes self = new TryCreateAIInstanceRequestScheduleTimes();
            return TeaModel.build(map, self);
        }

        public TryCreateAIInstanceRequestScheduleTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TryCreateAIInstanceRequestScheduleTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
