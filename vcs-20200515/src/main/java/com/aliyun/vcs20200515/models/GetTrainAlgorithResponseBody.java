// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetTrainAlgorithResponseBodyData data;

    public static GetTrainAlgorithResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithResponseBody self = new GetTrainAlgorithResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrainAlgorithResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrainAlgorithResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrainAlgorithResponseBody setData(GetTrainAlgorithResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainAlgorithResponseBodyData getData() {
        return this.data;
    }

    public static class GetTrainAlgorithResponseBodyDataInstanceList extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstaceId")
        public String instaceId;

        @NameInMap("ProjectId")
        public String projectId;

        public static GetTrainAlgorithResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetTrainAlgorithResponseBodyDataInstanceList self = new GetTrainAlgorithResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public GetTrainAlgorithResponseBodyDataInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetTrainAlgorithResponseBodyDataInstanceList setInstaceId(String instaceId) {
            this.instaceId = instaceId;
            return this;
        }
        public String getInstaceId() {
            return this.instaceId;
        }

        public GetTrainAlgorithResponseBodyDataInstanceList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class GetTrainAlgorithResponseBodyData extends TeaModel {
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

        @NameInMap("NoReadyReason")
        public String noReadyReason;

        @NameInMap("InstanceList")
        public java.util.List<GetTrainAlgorithResponseBodyDataInstanceList> instanceList;

        public static GetTrainAlgorithResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainAlgorithResponseBodyData self = new GetTrainAlgorithResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainAlgorithResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTrainAlgorithResponseBodyData setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public GetTrainAlgorithResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetTrainAlgorithResponseBodyData setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public GetTrainAlgorithResponseBodyData setTrainSampleCount(Long trainSampleCount) {
            this.trainSampleCount = trainSampleCount;
            return this;
        }
        public Long getTrainSampleCount() {
            return this.trainSampleCount;
        }

        public GetTrainAlgorithResponseBodyData setTestSampleCount(Long testSampleCount) {
            this.testSampleCount = testSampleCount;
            return this;
        }
        public Long getTestSampleCount() {
            return this.testSampleCount;
        }

        public GetTrainAlgorithResponseBodyData setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public GetTrainAlgorithResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrainAlgorithResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTrainAlgorithResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

        public GetTrainAlgorithResponseBodyData setTrainProgress(Long trainProgress) {
            this.trainProgress = trainProgress;
            return this;
        }
        public Long getTrainProgress() {
            return this.trainProgress;
        }

        public GetTrainAlgorithResponseBodyData setTrainQueueSize(Long trainQueueSize) {
            this.trainQueueSize = trainQueueSize;
            return this;
        }
        public Long getTrainQueueSize() {
            return this.trainQueueSize;
        }

        public GetTrainAlgorithResponseBodyData setTrainEstimateTime(Long trainEstimateTime) {
            this.trainEstimateTime = trainEstimateTime;
            return this;
        }
        public Long getTrainEstimateTime() {
            return this.trainEstimateTime;
        }

        public GetTrainAlgorithResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetTrainAlgorithResponseBodyData setReadyTrain(String readyTrain) {
            this.readyTrain = readyTrain;
            return this;
        }
        public String getReadyTrain() {
            return this.readyTrain;
        }

        public GetTrainAlgorithResponseBodyData setDeployVersion(String deployVersion) {
            this.deployVersion = deployVersion;
            return this;
        }
        public String getDeployVersion() {
            return this.deployVersion;
        }

        public GetTrainAlgorithResponseBodyData setPrecision(Float precision) {
            this.precision = precision;
            return this;
        }
        public Float getPrecision() {
            return this.precision;
        }

        public GetTrainAlgorithResponseBodyData setRecall(Float recall) {
            this.recall = recall;
            return this;
        }
        public Float getRecall() {
            return this.recall;
        }

        public GetTrainAlgorithResponseBodyData setNoReadyReason(String noReadyReason) {
            this.noReadyReason = noReadyReason;
            return this;
        }
        public String getNoReadyReason() {
            return this.noReadyReason;
        }

        public GetTrainAlgorithResponseBodyData setInstanceList(java.util.List<GetTrainAlgorithResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<GetTrainAlgorithResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
