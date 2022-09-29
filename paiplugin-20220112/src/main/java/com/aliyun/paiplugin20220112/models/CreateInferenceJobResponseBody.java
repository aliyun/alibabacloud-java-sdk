// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateInferenceJobResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("CampaignId")
        public String campaignId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DataPath")
        public String dataPath;

        @NameInMap("GroupId")
        public String groupId;

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

        @NameInMap("TargetPath")
        public String targetPath;

        @NameInMap("TrainingJobId")
        public String trainingJobId;

        @NameInMap("UpdatedTime")
        public String updatedTime;

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
