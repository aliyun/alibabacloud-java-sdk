// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public ListTrainingJobsResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ListTrainingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsResponseBody self = new ListTrainingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsResponseBody setData(ListTrainingJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTrainingJobsResponseBodyData getData() {
        return this.data;
    }

    public ListTrainingJobsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListTrainingJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTrainingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrainingJobsResponseBodyDataTrainingJobs extends TeaModel {
        // 关联算法Id。
        @NameInMap("Algorithm")
        public String algorithm;

        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 训练任务日志。
        @NameInMap("History")
        public String history;

        // 训练任务Id。
        @NameInMap("Id")
        public String id;

        // 训练任务名称。
        @NameInMap("Name")
        public String name;

        // 备注。
        @NameInMap("Remark")
        public String remark;

        // 训练任务状态。
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        // 用户配置。
        @NameInMap("UserConfig")
        public String userConfig;

        public static ListTrainingJobsResponseBodyDataTrainingJobs build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyDataTrainingJobs self = new ListTrainingJobsResponseBodyDataTrainingJobs();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

    public static class ListTrainingJobsResponseBodyData extends TeaModel {
        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总训练任务数量。
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 训练任务列表。
        @NameInMap("TrainingJobs")
        public java.util.List<ListTrainingJobsResponseBodyDataTrainingJobs> trainingJobs;

        public static ListTrainingJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyData self = new ListTrainingJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTrainingJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTrainingJobsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListTrainingJobsResponseBodyData setTrainingJobs(java.util.List<ListTrainingJobsResponseBodyDataTrainingJobs> trainingJobs) {
            this.trainingJobs = trainingJobs;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyDataTrainingJobs> getTrainingJobs() {
            return this.trainingJobs;
        }

    }

}
