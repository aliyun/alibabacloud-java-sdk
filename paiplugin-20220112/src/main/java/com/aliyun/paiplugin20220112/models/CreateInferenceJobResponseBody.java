// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public CreateInferenceJobResponseBodyData data;

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

    public static CreateInferenceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInferenceJobResponseBody self = new CreateInferenceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInferenceJobResponseBody setData(CreateInferenceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateInferenceJobResponseBodyData getData() {
        return this.data;
    }

    public CreateInferenceJobResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateInferenceJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateInferenceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateInferenceJobResponseBodyData extends TeaModel {
        /**
         * <p>关联算法。</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>关联运营活动Id。</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>预测数据路径。</p>
         */
        @NameInMap("DataPath")
        public String dataPath;

        /**
         * <p>关联人群Id，如果任务失败则人群无效。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>预测任务日志。</p>
         */
        @NameInMap("History")
        public String history;

        /**
         * <p>预测任务Id。</p>
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
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>输出数据路径，需要为空目录。</p>
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

        public static CreateInferenceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInferenceJobResponseBodyData self = new CreateInferenceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInferenceJobResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public CreateInferenceJobResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public CreateInferenceJobResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateInferenceJobResponseBodyData setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public String getDataPath() {
            return this.dataPath;
        }

        public CreateInferenceJobResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateInferenceJobResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public CreateInferenceJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateInferenceJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInferenceJobResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateInferenceJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateInferenceJobResponseBodyData setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public CreateInferenceJobResponseBodyData setTrainingJobId(String trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }
        public String getTrainingJobId() {
            return this.trainingJobId;
        }

        public CreateInferenceJobResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public CreateInferenceJobResponseBodyData setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

}
