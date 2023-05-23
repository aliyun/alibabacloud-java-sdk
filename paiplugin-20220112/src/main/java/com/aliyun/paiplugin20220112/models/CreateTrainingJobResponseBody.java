// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public CreateTrainingJobResponseBodyData data;

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

    public static CreateTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainingJobResponseBody self = new CreateTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrainingJobResponseBody setData(CreateTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public CreateTrainingJobResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateTrainingJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTrainingJobResponseBodyData extends TeaModel {
        /**
         * <p>关联算法ID。</p>
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
         * <p>训练数据路径，指定路径前需确保已在控制台完成一键授权。</p>
         */
        @NameInMap("DataPath")
        public String dataPath;

        @NameInMap("HasModelInfo")
        public Boolean hasModelInfo;

        /**
         * <p>训练任务日志。</p>
         */
        @NameInMap("History")
        public String history;

        /**
         * <p>训练任务ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>训练任务名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>备注。</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>训练任务状态。</p>
         * <p>- 0: 队列中。</p>
         * <p>- 1: 已提交。</p>
         * <p>- 2: 运行中。</p>
         * <p>- 3: 成功。</p>
         * <p>- 4: 失败。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>关联训练计划ID。</p>
         */
        @NameInMap("TrainingScheduleId")
        public String trainingScheduleId;

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

        public static CreateTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobResponseBodyData self = new CreateTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public CreateTrainingJobResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public CreateTrainingJobResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateTrainingJobResponseBodyData setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public String getDataPath() {
            return this.dataPath;
        }

        public CreateTrainingJobResponseBodyData setHasModelInfo(Boolean hasModelInfo) {
            this.hasModelInfo = hasModelInfo;
            return this;
        }
        public Boolean getHasModelInfo() {
            return this.hasModelInfo;
        }

        public CreateTrainingJobResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public CreateTrainingJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTrainingJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTrainingJobResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateTrainingJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateTrainingJobResponseBodyData setTrainingScheduleId(String trainingScheduleId) {
            this.trainingScheduleId = trainingScheduleId;
            return this;
        }
        public String getTrainingScheduleId() {
            return this.trainingScheduleId;
        }

        public CreateTrainingJobResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public CreateTrainingJobResponseBodyData setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

}
