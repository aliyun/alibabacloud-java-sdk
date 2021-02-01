// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithmResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetTrainAlgorithmResponseBodyData data;

    public static GetTrainAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithmResponseBody self = new GetTrainAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrainAlgorithmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrainAlgorithmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrainAlgorithmResponseBody setData(GetTrainAlgorithmResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainAlgorithmResponseBodyData getData() {
        return this.data;
    }

    public static class GetTrainAlgorithmResponseBodyDataInstanceList extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstaceId")
        public String instaceId;

        @NameInMap("ProjectId")
        public String projectId;

        public static GetTrainAlgorithmResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetTrainAlgorithmResponseBodyDataInstanceList self = new GetTrainAlgorithmResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public GetTrainAlgorithmResponseBodyDataInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetTrainAlgorithmResponseBodyDataInstanceList setInstaceId(String instaceId) {
            this.instaceId = instaceId;
            return this;
        }
        public String getInstaceId() {
            return this.instaceId;
        }

        public GetTrainAlgorithmResponseBodyDataInstanceList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class GetTrainAlgorithmResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("AlgorithmType")
        public String algorithmType;

        @NameInMap("TrainSampleCount")
        public Long trainSampleCount;

        @NameInMap("TestSampleCount")
        public Long testSampleCount;

        @NameInMap("Deleted")
        public String deleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("TrainStatus")
        public String trainStatus;

        @NameInMap("TrainProgress")
        public Long trainProgress;

        @NameInMap("TrainQueueSize")
        public Long trainQueueSize;

        @NameInMap("TrainEstimateTime")
        public Long trainEstimateTime;

        @NameInMap("DeployStatus")
        public String deployStatus;

        @NameInMap("ReadyTrain")
        public String readyTrain;

        @NameInMap("DeployVersion")
        public String deployVersion;

        @NameInMap("Precision")
        public Float precision;

        @NameInMap("Recall")
        public Float recall;

        @NameInMap("TrainTime")
        public String trainTime;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("NoReadyReason")
        public String noReadyReason;

        @NameInMap("CanUnpublish")
        public String canUnpublish;

        @NameInMap("InstanceList")
        public java.util.List<GetTrainAlgorithmResponseBodyDataInstanceList> instanceList;

        public static GetTrainAlgorithmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainAlgorithmResponseBodyData self = new GetTrainAlgorithmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainAlgorithmResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTrainAlgorithmResponseBodyData setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public GetTrainAlgorithmResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetTrainAlgorithmResponseBodyData setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public GetTrainAlgorithmResponseBodyData setTrainSampleCount(Long trainSampleCount) {
            this.trainSampleCount = trainSampleCount;
            return this;
        }
        public Long getTrainSampleCount() {
            return this.trainSampleCount;
        }

        public GetTrainAlgorithmResponseBodyData setTestSampleCount(Long testSampleCount) {
            this.testSampleCount = testSampleCount;
            return this;
        }
        public Long getTestSampleCount() {
            return this.testSampleCount;
        }

        public GetTrainAlgorithmResponseBodyData setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public GetTrainAlgorithmResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrainAlgorithmResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTrainAlgorithmResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

        public GetTrainAlgorithmResponseBodyData setTrainProgress(Long trainProgress) {
            this.trainProgress = trainProgress;
            return this;
        }
        public Long getTrainProgress() {
            return this.trainProgress;
        }

        public GetTrainAlgorithmResponseBodyData setTrainQueueSize(Long trainQueueSize) {
            this.trainQueueSize = trainQueueSize;
            return this;
        }
        public Long getTrainQueueSize() {
            return this.trainQueueSize;
        }

        public GetTrainAlgorithmResponseBodyData setTrainEstimateTime(Long trainEstimateTime) {
            this.trainEstimateTime = trainEstimateTime;
            return this;
        }
        public Long getTrainEstimateTime() {
            return this.trainEstimateTime;
        }

        public GetTrainAlgorithmResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetTrainAlgorithmResponseBodyData setReadyTrain(String readyTrain) {
            this.readyTrain = readyTrain;
            return this;
        }
        public String getReadyTrain() {
            return this.readyTrain;
        }

        public GetTrainAlgorithmResponseBodyData setDeployVersion(String deployVersion) {
            this.deployVersion = deployVersion;
            return this;
        }
        public String getDeployVersion() {
            return this.deployVersion;
        }

        public GetTrainAlgorithmResponseBodyData setPrecision(Float precision) {
            this.precision = precision;
            return this;
        }
        public Float getPrecision() {
            return this.precision;
        }

        public GetTrainAlgorithmResponseBodyData setRecall(Float recall) {
            this.recall = recall;
            return this;
        }
        public Float getRecall() {
            return this.recall;
        }

        public GetTrainAlgorithmResponseBodyData setTrainTime(String trainTime) {
            this.trainTime = trainTime;
            return this;
        }
        public String getTrainTime() {
            return this.trainTime;
        }

        public GetTrainAlgorithmResponseBodyData setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public GetTrainAlgorithmResponseBodyData setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GetTrainAlgorithmResponseBodyData setNoReadyReason(String noReadyReason) {
            this.noReadyReason = noReadyReason;
            return this;
        }
        public String getNoReadyReason() {
            return this.noReadyReason;
        }

        public GetTrainAlgorithmResponseBodyData setCanUnpublish(String canUnpublish) {
            this.canUnpublish = canUnpublish;
            return this;
        }
        public String getCanUnpublish() {
            return this.canUnpublish;
        }

        public GetTrainAlgorithmResponseBodyData setInstanceList(java.util.List<GetTrainAlgorithmResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<GetTrainAlgorithmResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
