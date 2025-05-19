// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListSampleConsistencyJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SampleConsistencyJobs")
    public java.util.List<ListSampleConsistencyJobsResponseBodySampleConsistencyJobs> sampleConsistencyJobs;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSampleConsistencyJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSampleConsistencyJobsResponseBody self = new ListSampleConsistencyJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSampleConsistencyJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSampleConsistencyJobsResponseBody setSampleConsistencyJobs(java.util.List<ListSampleConsistencyJobsResponseBodySampleConsistencyJobs> sampleConsistencyJobs) {
        this.sampleConsistencyJobs = sampleConsistencyJobs;
        return this;
    }
    public java.util.List<ListSampleConsistencyJobsResponseBodySampleConsistencyJobs> getSampleConsistencyJobs() {
        return this.sampleConsistencyJobs;
    }

    public ListSampleConsistencyJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSampleConsistencyJobsResponseBodySampleConsistencyJobs extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("EasModelServiceName")
        public String easModelServiceName;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FeatureSaveResourceId")
        public String featureSaveResourceId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("ItemIdField")
        public String itemIdField;

        @NameInMap("Logs")
        public String logs;

        @NameInMap("Name")
        public String name;

        @NameInMap("PartitionField")
        public String partitionField;

        @NameInMap("PartitionFieldFormat")
        public String partitionFieldFormat;

        @NameInMap("RequestIdField")
        public String requestIdField;

        @NameInMap("SampleConsistencyJobId")
        public String sampleConsistencyJobId;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("SampleTableName")
        public String sampleTableName;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserIdField")
        public String userIdField;

        public static ListSampleConsistencyJobsResponseBodySampleConsistencyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListSampleConsistencyJobsResponseBodySampleConsistencyJobs self = new ListSampleConsistencyJobsResponseBodySampleConsistencyJobs();
            return TeaModel.build(map, self);
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setEasModelServiceName(String easModelServiceName) {
            this.easModelServiceName = easModelServiceName;
            return this;
        }
        public String getEasModelServiceName() {
            return this.easModelServiceName;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setFeatureSaveResourceId(String featureSaveResourceId) {
            this.featureSaveResourceId = featureSaveResourceId;
            return this;
        }
        public String getFeatureSaveResourceId() {
            return this.featureSaveResourceId;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setItemIdField(String itemIdField) {
            this.itemIdField = itemIdField;
            return this;
        }
        public String getItemIdField() {
            return this.itemIdField;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setLogs(String logs) {
            this.logs = logs;
            return this;
        }
        public String getLogs() {
            return this.logs;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setPartitionField(String partitionField) {
            this.partitionField = partitionField;
            return this;
        }
        public String getPartitionField() {
            return this.partitionField;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setPartitionFieldFormat(String partitionFieldFormat) {
            this.partitionFieldFormat = partitionFieldFormat;
            return this;
        }
        public String getPartitionFieldFormat() {
            return this.partitionFieldFormat;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setRequestIdField(String requestIdField) {
            this.requestIdField = requestIdField;
            return this;
        }
        public String getRequestIdField() {
            return this.requestIdField;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setSampleConsistencyJobId(String sampleConsistencyJobId) {
            this.sampleConsistencyJobId = sampleConsistencyJobId;
            return this;
        }
        public String getSampleConsistencyJobId() {
            return this.sampleConsistencyJobId;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setSampleTableName(String sampleTableName) {
            this.sampleTableName = sampleTableName;
            return this;
        }
        public String getSampleTableName() {
            return this.sampleTableName;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSampleConsistencyJobsResponseBodySampleConsistencyJobs setUserIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }
        public String getUserIdField() {
            return this.userIdField;
        }

    }

}
