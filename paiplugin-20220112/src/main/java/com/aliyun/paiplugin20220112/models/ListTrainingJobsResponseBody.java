// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListTrainingJobsResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("CampaignId")
        public String campaignId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DataPath")
        public String dataPath;

        @NameInMap("History")
        public String history;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TrainingScheduleId")
        public String trainingScheduleId;

        @NameInMap("UpdatedTime")
        public String updatedTime;

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

        public ListTrainingJobsResponseBodyDataTrainingJobs setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTrainingJobsResponseBodyDataTrainingJobs setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public String getDataPath() {
            return this.dataPath;
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

        public ListTrainingJobsResponseBodyDataTrainingJobs setTrainingScheduleId(String trainingScheduleId) {
            this.trainingScheduleId = trainingScheduleId;
            return this;
        }
        public String getTrainingScheduleId() {
            return this.trainingScheduleId;
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

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
