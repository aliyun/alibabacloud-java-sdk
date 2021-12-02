// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployOrdersRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("DeployCategory")
    public String deployCategory;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("EndTimeGreaterThan")
    public String endTimeGreaterThan;

    @NameInMap("EndTimeGreaterThanOrEqualTo")
    public String endTimeGreaterThanOrEqualTo;

    @NameInMap("EndTimeLessThan")
    public String endTimeLessThan;

    @NameInMap("EndTimeLessThanOrEqualTo")
    public String endTimeLessThanOrEqualTo;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PartitionType")
    public String partitionType;

    @NameInMap("PauseType")
    public String pauseType;

    @NameInMap("ResultList")
    public java.util.List<Integer> resultList;

    @NameInMap("StartTimeGreaterThan")
    public String startTimeGreaterThan;

    @NameInMap("StartTimeGreaterThanOrEqualTo")
    public String startTimeGreaterThanOrEqualTo;

    @NameInMap("StartTimeLessThan")
    public String startTimeLessThan;

    @NameInMap("StartTimeLessThanOrEqualTo")
    public String startTimeLessThanOrEqualTo;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StatusList")
    public java.util.List<Integer> statusList;

    public static ListDeployOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployOrdersRequest self = new ListDeployOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployOrdersRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListDeployOrdersRequest setDeployCategory(String deployCategory) {
        this.deployCategory = deployCategory;
        return this;
    }
    public String getDeployCategory() {
        return this.deployCategory;
    }

    public ListDeployOrdersRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public ListDeployOrdersRequest setEndTimeGreaterThan(String endTimeGreaterThan) {
        this.endTimeGreaterThan = endTimeGreaterThan;
        return this;
    }
    public String getEndTimeGreaterThan() {
        return this.endTimeGreaterThan;
    }

    public ListDeployOrdersRequest setEndTimeGreaterThanOrEqualTo(String endTimeGreaterThanOrEqualTo) {
        this.endTimeGreaterThanOrEqualTo = endTimeGreaterThanOrEqualTo;
        return this;
    }
    public String getEndTimeGreaterThanOrEqualTo() {
        return this.endTimeGreaterThanOrEqualTo;
    }

    public ListDeployOrdersRequest setEndTimeLessThan(String endTimeLessThan) {
        this.endTimeLessThan = endTimeLessThan;
        return this;
    }
    public String getEndTimeLessThan() {
        return this.endTimeLessThan;
    }

    public ListDeployOrdersRequest setEndTimeLessThanOrEqualTo(String endTimeLessThanOrEqualTo) {
        this.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
        return this;
    }
    public String getEndTimeLessThanOrEqualTo() {
        return this.endTimeLessThanOrEqualTo;
    }

    public ListDeployOrdersRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public ListDeployOrdersRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListDeployOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeployOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeployOrdersRequest setPartitionType(String partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public String getPartitionType() {
        return this.partitionType;
    }

    public ListDeployOrdersRequest setPauseType(String pauseType) {
        this.pauseType = pauseType;
        return this;
    }
    public String getPauseType() {
        return this.pauseType;
    }

    public ListDeployOrdersRequest setResultList(java.util.List<Integer> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<Integer> getResultList() {
        return this.resultList;
    }

    public ListDeployOrdersRequest setStartTimeGreaterThan(String startTimeGreaterThan) {
        this.startTimeGreaterThan = startTimeGreaterThan;
        return this;
    }
    public String getStartTimeGreaterThan() {
        return this.startTimeGreaterThan;
    }

    public ListDeployOrdersRequest setStartTimeGreaterThanOrEqualTo(String startTimeGreaterThanOrEqualTo) {
        this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
        return this;
    }
    public String getStartTimeGreaterThanOrEqualTo() {
        return this.startTimeGreaterThanOrEqualTo;
    }

    public ListDeployOrdersRequest setStartTimeLessThan(String startTimeLessThan) {
        this.startTimeLessThan = startTimeLessThan;
        return this;
    }
    public String getStartTimeLessThan() {
        return this.startTimeLessThan;
    }

    public ListDeployOrdersRequest setStartTimeLessThanOrEqualTo(String startTimeLessThanOrEqualTo) {
        this.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
        return this;
    }
    public String getStartTimeLessThanOrEqualTo() {
        return this.startTimeLessThanOrEqualTo;
    }

    public ListDeployOrdersRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDeployOrdersRequest setStatusList(java.util.List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<Integer> getStatusList() {
        return this.statusList;
    }

}
