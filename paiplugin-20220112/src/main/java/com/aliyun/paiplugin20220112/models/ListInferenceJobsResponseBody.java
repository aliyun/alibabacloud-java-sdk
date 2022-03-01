// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListInferenceJobsResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public ListInferenceJobsResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListInferenceJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobsResponseBody self = new ListInferenceJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobsResponseBody setData(ListInferenceJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInferenceJobsResponseBodyData getData() {
        return this.data;
    }

    public ListInferenceJobsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListInferenceJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInferenceJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInferenceJobsResponseBodyDataInferenceJobs extends TeaModel {
        // 关联算法。
        @NameInMap("Algorithm")
        public String algorithm;

        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 关联人群Id，如果任务失败则人群无效。
        @NameInMap("GroupId")
        public String groupId;

        // 预测任务日志。
        @NameInMap("History")
        public String history;

        // 预测任务Id。
        @NameInMap("Id")
        public String id;

        // 预测任务名称。
        @NameInMap("Name")
        public String name;

        // 备注。
        @NameInMap("Remark")
        public String remark;

        // 预测任务状态。
        @NameInMap("Status")
        public Integer status;

        // 关联训练任务。
        @NameInMap("TrainingJobId")
        public String trainingJobId;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        // 用户配置。
        @NameInMap("UserConfig")
        public String userConfig;

        public static ListInferenceJobsResponseBodyDataInferenceJobs build(java.util.Map<String, ?> map) throws Exception {
            ListInferenceJobsResponseBodyDataInferenceJobs self = new ListInferenceJobsResponseBodyDataInferenceJobs();
            return TeaModel.build(map, self);
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setTrainingJobId(String trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }
        public String getTrainingJobId() {
            return this.trainingJobId;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

    public static class ListInferenceJobsResponseBodyData extends TeaModel {
        // 预测任务列表。
        @NameInMap("InferenceJobs")
        public java.util.List<ListInferenceJobsResponseBodyDataInferenceJobs> inferenceJobs;

        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总预测任务数量。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInferenceJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInferenceJobsResponseBodyData self = new ListInferenceJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInferenceJobsResponseBodyData setInferenceJobs(java.util.List<ListInferenceJobsResponseBodyDataInferenceJobs> inferenceJobs) {
            this.inferenceJobs = inferenceJobs;
            return this;
        }
        public java.util.List<ListInferenceJobsResponseBodyDataInferenceJobs> getInferenceJobs() {
            return this.inferenceJobs;
        }

        public ListInferenceJobsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInferenceJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInferenceJobsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
