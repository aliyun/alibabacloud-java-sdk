// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAIInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAIInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestID</p>
     */
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
        @NameInMap("AcuUsed")
        public Long acuUsed;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("CameraNumber")
        public Long cameraNumber;

        @NameInMap("ComputeType")
        public String computeType;

        @NameInMap("ContainerType")
        public String containerType;

        @NameInMap("CreateDateTime")
        public String createDateTime;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("DataSourceTimes")
        public String dataSourceTimes;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Fps")
        public Long fps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ScheduleCycleDates")
        public String scheduleCycleDates;

        @NameInMap("ScheduleTimes")
        public String scheduleTimes;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("Spf")
        public Long spf;

        @NameInMap("Status")
        public String status;

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

        public DescribeAIInstanceResponseBodyDataRecords setContainerType(String containerType) {
            this.containerType = containerType;
            return this;
        }
        public String getContainerType() {
            return this.containerType;
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

        public DescribeAIInstanceResponseBodyDataRecords setFps(Long fps) {
            this.fps = fps;
            return this;
        }
        public Long getFps() {
            return this.fps;
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
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeAIInstanceResponseBodyDataRecords> records;

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
