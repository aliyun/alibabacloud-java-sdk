// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPodsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListPodsResponseBodyData> data;

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

    public static ListPodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPodsResponseBody self = new ListPodsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPodsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPodsResponseBody setData(java.util.List<ListPodsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPodsResponseBodyData> getData() {
        return this.data;
    }

    public ListPodsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListPodsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPodsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPodsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPodsResponseBodyDataDeploySteps extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StepCode")
        public String stepCode;

        @NameInMap("StepName")
        public String stepName;

        public static ListPodsResponseBodyDataDeploySteps build(java.util.Map<String, ?> map) throws Exception {
            ListPodsResponseBodyDataDeploySteps self = new ListPodsResponseBodyDataDeploySteps();
            return TeaModel.build(map, self);
        }

        public ListPodsResponseBodyDataDeploySteps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPodsResponseBodyDataDeploySteps setStepCode(String stepCode) {
            this.stepCode = stepCode;
            return this;
        }
        public String getStepCode() {
            return this.stepCode;
        }

        public ListPodsResponseBodyDataDeploySteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

    }

    public static class ListPodsResponseBodyData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("DeployOrderId")
        public Long deployOrderId;

        @NameInMap("DeployPartitionNum")
        public Integer deployPartitionNum;

        @NameInMap("DeploySteps")
        public java.util.List<ListPodsResponseBodyDataDeploySteps> deploySteps;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Region")
        public String region;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("ResultName")
        public String resultName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPodsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPodsResponseBodyData self = new ListPodsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPodsResponseBodyData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListPodsResponseBodyData setDeployOrderId(Long deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        public ListPodsResponseBodyData setDeployPartitionNum(Integer deployPartitionNum) {
            this.deployPartitionNum = deployPartitionNum;
            return this;
        }
        public Integer getDeployPartitionNum() {
            return this.deployPartitionNum;
        }

        public ListPodsResponseBodyData setDeploySteps(java.util.List<ListPodsResponseBodyDataDeploySteps> deploySteps) {
            this.deploySteps = deploySteps;
            return this;
        }
        public java.util.List<ListPodsResponseBodyDataDeploySteps> getDeploySteps() {
            return this.deploySteps;
        }

        public ListPodsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListPodsResponseBodyData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListPodsResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListPodsResponseBodyData setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public ListPodsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListPodsResponseBodyData setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public ListPodsResponseBodyData setResultName(String resultName) {
            this.resultName = resultName;
            return this;
        }
        public String getResultName() {
            return this.resultName;
        }

        public ListPodsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPodsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPodsResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public ListPodsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
