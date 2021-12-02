// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeDeployOrderDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDeployOrderDetailResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDeployOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployOrderDetailResponseBody self = new DescribeDeployOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployOrderDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDeployOrderDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeDeployOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployOrderDetailResponseBody setResult(DescribeDeployOrderDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDeployOrderDetailResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeDeployOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDeployOrderDetailResponseBodyResult extends TeaModel {
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

        public static DescribeDeployOrderDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployOrderDetailResponseBodyResult self = new DescribeDeployOrderDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDeployOrderDetailResponseBodyResult setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public DescribeDeployOrderDetailResponseBodyResult setCurrentPartitionNum(Integer currentPartitionNum) {
            this.currentPartitionNum = currentPartitionNum;
            return this;
        }
        public Integer getCurrentPartitionNum() {
            return this.currentPartitionNum;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDeployOrderId(Long deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDeployPauseType(String deployPauseType) {
            this.deployPauseType = deployPauseType;
            return this;
        }
        public String getDeployPauseType() {
            return this.deployPauseType;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDeployPauseTypeName(String deployPauseTypeName) {
            this.deployPauseTypeName = deployPauseTypeName;
            return this;
        }
        public String getDeployPauseTypeName() {
            return this.deployPauseTypeName;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDeployTypeName(String deployTypeName) {
            this.deployTypeName = deployTypeName;
            return this;
        }
        public String getDeployTypeName() {
            return this.deployTypeName;
        }

        public DescribeDeployOrderDetailResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployOrderDetailResponseBodyResult setElapsedTime(Integer elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Integer getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeDeployOrderDetailResponseBodyResult setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDeployOrderDetailResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeDeployOrderDetailResponseBodyResult setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public DescribeDeployOrderDetailResponseBodyResult setFailureRate(String failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public String getFailureRate() {
            return this.failureRate;
        }

        public DescribeDeployOrderDetailResponseBodyResult setFinishAppInstanceCt(Integer finishAppInstanceCt) {
            this.finishAppInstanceCt = finishAppInstanceCt;
            return this;
        }
        public Integer getFinishAppInstanceCt() {
            return this.finishAppInstanceCt;
        }

        public DescribeDeployOrderDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeployOrderDetailResponseBodyResult setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public DescribeDeployOrderDetailResponseBodyResult setPartitionTypeName(String partitionTypeName) {
            this.partitionTypeName = partitionTypeName;
            return this;
        }
        public String getPartitionTypeName() {
            return this.partitionTypeName;
        }

        public DescribeDeployOrderDetailResponseBodyResult setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeDeployOrderDetailResponseBodyResult setResultName(String resultName) {
            this.resultName = resultName;
            return this;
        }
        public String getResultName() {
            return this.resultName;
        }

        public DescribeDeployOrderDetailResponseBodyResult setSchemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Long getSchemaId() {
            return this.schemaId;
        }

        public DescribeDeployOrderDetailResponseBodyResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDeployOrderDetailResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDeployOrderDetailResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeDeployOrderDetailResponseBodyResult setTotalAppInstanceCt(Integer totalAppInstanceCt) {
            this.totalAppInstanceCt = totalAppInstanceCt;
            return this;
        }
        public Integer getTotalAppInstanceCt() {
            return this.totalAppInstanceCt;
        }

        public DescribeDeployOrderDetailResponseBodyResult setTotalPartitions(Integer totalPartitions) {
            this.totalPartitions = totalPartitions;
            return this;
        }
        public Integer getTotalPartitions() {
            return this.totalPartitions;
        }

        public DescribeDeployOrderDetailResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeDeployOrderDetailResponseBodyResult setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
