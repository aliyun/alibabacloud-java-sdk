// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListDeployOrdersResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeployOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployOrdersResponseBody self = new ListDeployOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployOrdersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeployOrdersResponseBody setData(java.util.List<ListDeployOrdersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeployOrdersResponseBodyData> getData() {
        return this.data;
    }

    public ListDeployOrdersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDeployOrdersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeployOrdersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeployOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployOrdersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeployOrdersResponseBodyData extends TeaModel {
        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("CurrentPartitionNum")
        public Integer currentPartitionNum;

        @NameInMap("DeployOrderId")
        public Long deployOrderId;

        @NameInMap("DeployPauseType")
        public String deployPauseType;

        @NameInMap("DeployPauseTypeName")
        public String deployPauseTypeName;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DeployTypeName")
        public String deployTypeName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ElapsedTime")
        public Integer elapsedTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("FailureRate")
        public String failureRate;

        @NameInMap("FinishAppInstanceCt")
        public Integer finishAppInstanceCt;

        @NameInMap("Name")
        public String name;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("PartitionTypeName")
        public String partitionTypeName;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("ResultName")
        public String resultName;

        @NameInMap("SchemaId")
        public Long schemaId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TotalAppInstanceCt")
        public Integer totalAppInstanceCt;

        @NameInMap("TotalPartitions")
        public Integer totalPartitions;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserNick")
        public String userNick;

        public static ListDeployOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeployOrdersResponseBodyData self = new ListDeployOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeployOrdersResponseBodyData setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListDeployOrdersResponseBodyData setCurrentPartitionNum(Integer currentPartitionNum) {
            this.currentPartitionNum = currentPartitionNum;
            return this;
        }
        public Integer getCurrentPartitionNum() {
            return this.currentPartitionNum;
        }

        public ListDeployOrdersResponseBodyData setDeployOrderId(Long deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        public ListDeployOrdersResponseBodyData setDeployPauseType(String deployPauseType) {
            this.deployPauseType = deployPauseType;
            return this;
        }
        public String getDeployPauseType() {
            return this.deployPauseType;
        }

        public ListDeployOrdersResponseBodyData setDeployPauseTypeName(String deployPauseTypeName) {
            this.deployPauseTypeName = deployPauseTypeName;
            return this;
        }
        public String getDeployPauseTypeName() {
            return this.deployPauseTypeName;
        }

        public ListDeployOrdersResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListDeployOrdersResponseBodyData setDeployTypeName(String deployTypeName) {
            this.deployTypeName = deployTypeName;
            return this;
        }
        public String getDeployTypeName() {
            return this.deployTypeName;
        }

        public ListDeployOrdersResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeployOrdersResponseBodyData setElapsedTime(Integer elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Integer getElapsedTime() {
            return this.elapsedTime;
        }

        public ListDeployOrdersResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDeployOrdersResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public ListDeployOrdersResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDeployOrdersResponseBodyData setFailureRate(String failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public String getFailureRate() {
            return this.failureRate;
        }

        public ListDeployOrdersResponseBodyData setFinishAppInstanceCt(Integer finishAppInstanceCt) {
            this.finishAppInstanceCt = finishAppInstanceCt;
            return this;
        }
        public Integer getFinishAppInstanceCt() {
            return this.finishAppInstanceCt;
        }

        public ListDeployOrdersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeployOrdersResponseBodyData setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public ListDeployOrdersResponseBodyData setPartitionTypeName(String partitionTypeName) {
            this.partitionTypeName = partitionTypeName;
            return this;
        }
        public String getPartitionTypeName() {
            return this.partitionTypeName;
        }

        public ListDeployOrdersResponseBodyData setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public ListDeployOrdersResponseBodyData setResultName(String resultName) {
            this.resultName = resultName;
            return this;
        }
        public String getResultName() {
            return this.resultName;
        }

        public ListDeployOrdersResponseBodyData setSchemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Long getSchemaId() {
            return this.schemaId;
        }

        public ListDeployOrdersResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDeployOrdersResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDeployOrdersResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public ListDeployOrdersResponseBodyData setTotalAppInstanceCt(Integer totalAppInstanceCt) {
            this.totalAppInstanceCt = totalAppInstanceCt;
            return this;
        }
        public Integer getTotalAppInstanceCt() {
            return this.totalAppInstanceCt;
        }

        public ListDeployOrdersResponseBodyData setTotalPartitions(Integer totalPartitions) {
            this.totalPartitions = totalPartitions;
            return this;
        }
        public Integer getTotalPartitions() {
            return this.totalPartitions;
        }

        public ListDeployOrdersResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListDeployOrdersResponseBodyData setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
