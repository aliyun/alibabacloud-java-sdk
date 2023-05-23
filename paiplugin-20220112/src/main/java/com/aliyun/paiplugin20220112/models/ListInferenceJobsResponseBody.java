// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListInferenceJobsResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListInferenceJobsResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
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
        /**
         * <p>关联算法。</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>关联运营活动ID。</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>预测数据路径，当预测人群数据分布在多个csv文件时可指定目录，指定路径前需确保已在控制台完成一键授权。</p>
         */
        @NameInMap("DataPath")
        public String dataPath;

        /**
         * <p>预测人群，人群来源必须为多列csv，当同时指定DataPath与GroupId时，以GroupId为准。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>预测任务日志。</p>
         */
        @NameInMap("History")
        public String history;

        /**
         * <p>预测任务ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>预测任务名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>备注。</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>预测任务状态。</p>
         * <p>- 0: 队列中。</p>
         * <p>- 1: 已提交。</p>
         * <p>- 2: 运行中。</p>
         * <p>- 3: 成功。</p>
         * <p>- 4: 失败。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>关联目标人群ID，如果任务失败则人群无效。</p>
         */
        @NameInMap("TargetGroupId")
        public String targetGroupId;

        /**
         * <p>输出数据路径，需要为空目录，指定路径前需确保已在控制台完成一键授权。</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>关联训练任务。</p>
         */
        @NameInMap("TrainingJobId")
        public String trainingJobId;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <p>用户配置。</p>
         */
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

        public ListInferenceJobsResponseBodyDataInferenceJobs setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public String getDataPath() {
            return this.dataPath;
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

        public ListInferenceJobsResponseBodyDataInferenceJobs setTargetGroupId(String targetGroupId) {
            this.targetGroupId = targetGroupId;
            return this;
        }
        public String getTargetGroupId() {
            return this.targetGroupId;
        }

        public ListInferenceJobsResponseBodyDataInferenceJobs setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
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
        /**
         * <p>预测任务列表。</p>
         */
        @NameInMap("InferenceJobs")
        public java.util.List<ListInferenceJobsResponseBodyDataInferenceJobs> inferenceJobs;

        /**
         * <p>分页数，从1开始，默认为1。</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>分页大小，默认为10。</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>总预测任务数量。</p>
         */
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
