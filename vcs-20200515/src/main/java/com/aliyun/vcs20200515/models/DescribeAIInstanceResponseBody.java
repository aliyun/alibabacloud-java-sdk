// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAIInstanceResponseBody extends TeaModel {
    // 返回错误码
    @NameInMap("Code")
    public String code;

    // 返回数据
    @NameInMap("Data")
    public DescribeAIInstanceResponseBodyData data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIInstanceResponseBody self = new DescribeAIInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAIInstanceResponseBody setData(DescribeAIInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAIInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeAIInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAIInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIInstanceResponseBodyDataRecords extends TeaModel {
        // ACU使用数量
        @NameInMap("AcuUsed")
        public Long acuUsed;

        // 算子ID
        @NameInMap("AlgorithmId")
        public String algorithmId;

        // 算子名称
        @NameInMap("AlgorithmName")
        public String algorithmName;

        // 实例中计算的摄像机数量。 仅当DataSource是Camera时返回。
        @NameInMap("CameraNumber")
        public Long cameraNumber;

        // 计算类型
        @NameInMap("ComputeType")
        public String computeType;

        // 实例创建时间
        @NameInMap("CreateDateTime")
        public String createDateTime;

        // 数据来源
        @NameInMap("DataSource")
        public String dataSource;

        // 数据源时间段
        @NameInMap("DataSourceTimes")
        public String dataSourceTimes;

        // 数据类型
        @NameInMap("DataType")
        public String dataType;

        // 实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 实例名称
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        // 含义随ScheduleType取值不同
        @NameInMap("ScheduleCycleDates")
        public String scheduleCycleDates;

        // 执行时间段
        @NameInMap("ScheduleTimes")
        public String scheduleTimes;

        // 调度类型
        @NameInMap("ScheduleType")
        public String scheduleType;

        // 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
        @NameInMap("Spf")
        public Long spf;

        // 实力状态
        @NameInMap("Status")
        public String status;

        // 预计存储量
        @NameInMap("Storage")
        public Double storage;

        public static DescribeAIInstanceResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIInstanceResponseBodyDataRecords self = new DescribeAIInstanceResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeAIInstanceResponseBodyDataRecords setAcuUsed(Long acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        public DescribeAIInstanceResponseBodyDataRecords setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public DescribeAIInstanceResponseBodyDataRecords setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public DescribeAIInstanceResponseBodyDataRecords setCameraNumber(Long cameraNumber) {
            this.cameraNumber = cameraNumber;
            return this;
        }
        public Long getCameraNumber() {
            return this.cameraNumber;
        }

        public DescribeAIInstanceResponseBodyDataRecords setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public DescribeAIInstanceResponseBodyDataRecords setCreateDateTime(String createDateTime) {
            this.createDateTime = createDateTime;
            return this;
        }
        public String getCreateDateTime() {
            return this.createDateTime;
        }

        public DescribeAIInstanceResponseBodyDataRecords setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeAIInstanceResponseBodyDataRecords setDataSourceTimes(String dataSourceTimes) {
            this.dataSourceTimes = dataSourceTimes;
            return this;
        }
        public String getDataSourceTimes() {
            return this.dataSourceTimes;
        }

        public DescribeAIInstanceResponseBodyDataRecords setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeAIInstanceResponseBodyDataRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAIInstanceResponseBodyDataRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAIInstanceResponseBodyDataRecords setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAIInstanceResponseBodyDataRecords setScheduleCycleDates(String scheduleCycleDates) {
            this.scheduleCycleDates = scheduleCycleDates;
            return this;
        }
        public String getScheduleCycleDates() {
            return this.scheduleCycleDates;
        }

        public DescribeAIInstanceResponseBodyDataRecords setScheduleTimes(String scheduleTimes) {
            this.scheduleTimes = scheduleTimes;
            return this;
        }
        public String getScheduleTimes() {
            return this.scheduleTimes;
        }

        public DescribeAIInstanceResponseBodyDataRecords setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public DescribeAIInstanceResponseBodyDataRecords setSpf(Long spf) {
            this.spf = spf;
            return this;
        }
        public Long getSpf() {
            return this.spf;
        }

        public DescribeAIInstanceResponseBodyDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAIInstanceResponseBodyDataRecords setStorage(Double storage) {
            this.storage = storage;
            return this;
        }
        public Double getStorage() {
            return this.storage;
        }

    }

    public static class DescribeAIInstanceResponseBodyData extends TeaModel {
        // 当前页序号
        @NameInMap("PageNumber")
        public Long pageNumber;

        // 每页显示多少条
        @NameInMap("PageSize")
        public Long pageSize;

        // 返回数据条目
        @NameInMap("Records")
        public java.util.List<DescribeAIInstanceResponseBodyDataRecords> records;

        // 总数据数
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAIInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIInstanceResponseBodyData self = new DescribeAIInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAIInstanceResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAIInstanceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAIInstanceResponseBodyData setRecords(java.util.List<DescribeAIInstanceResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeAIInstanceResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeAIInstanceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
