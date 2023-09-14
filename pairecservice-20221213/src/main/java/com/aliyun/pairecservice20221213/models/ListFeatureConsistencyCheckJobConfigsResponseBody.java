// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobConfigsResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckConfigs")
    public java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFeatureConsistencyCheckJobConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobConfigsResponseBody self = new ListFeatureConsistencyCheckJobConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setFeatureConsistencyCheckConfigs(java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs) {
        this.featureConsistencyCheckConfigs = featureConsistencyCheckConfigs;
        return this;
    }
    public java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> getFeatureConsistencyCheckConfigs() {
        return this.featureConsistencyCheckConfigs;
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs extends TeaModel {
        @NameInMap("CompareFeature")
        public Boolean compareFeature;

        @NameInMap("EasServiceName")
        public String easServiceName;

        @NameInMap("EasyRecPackagePath")
        public String easyRecPackagePath;

        @NameInMap("EasyRecVersion")
        public String easyRecVersion;

        @NameInMap("FeatureConsistencyCheckJobConfigId")
        public String featureConsistencyCheckJobConfigId;

        @NameInMap("FeatureDisplayExclude")
        public String featureDisplayExclude;

        @NameInMap("FeatureLandingResourceId")
        public String featureLandingResourceId;

        @NameInMap("FeatureLandingResourceUri")
        public String featureLandingResourceUri;

        @NameInMap("FeaturePriority")
        public String featurePriority;

        @NameInMap("FgJarVersion")
        public String fgJarVersion;

        @NameInMap("FgJsonFileName")
        public String fgJsonFileName;

        @NameInMap("GenerateZip")
        public Boolean generateZip;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("ItemIdField")
        public String itemIdField;

        @NameInMap("ItemTable")
        public String itemTable;

        @NameInMap("ItemTablePartitionField")
        public String itemTablePartitionField;

        @NameInMap("ItemTablePartitionFieldFormat")
        public String itemTablePartitionFieldFormat;

        @NameInMap("LatestJobGmtSamplingEndTime")
        public String latestJobGmtSamplingEndTime;

        @NameInMap("LatestJobGmtSamplingStartTime")
        public String latestJobGmtSamplingStartTime;

        @NameInMap("LatestJobId")
        public String latestJobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssResourceId")
        public String ossResourceId;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserIdField")
        public String userIdField;

        @NameInMap("UserTable")
        public String userTable;

        @NameInMap("UserTablePartitionField")
        public String userTablePartitionField;

        @NameInMap("UserTablePartitionFieldFormat")
        public String userTablePartitionFieldFormat;

        @NameInMap("WorkflowName")
        public String workflowName;

        public static ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs self = new ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs();
            return TeaModel.build(map, self);
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setCompareFeature(Boolean compareFeature) {
            this.compareFeature = compareFeature;
            return this;
        }
        public Boolean getCompareFeature() {
            return this.compareFeature;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasyRecPackagePath(String easyRecPackagePath) {
            this.easyRecPackagePath = easyRecPackagePath;
            return this;
        }
        public String getEasyRecPackagePath() {
            return this.easyRecPackagePath;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasyRecVersion(String easyRecVersion) {
            this.easyRecVersion = easyRecVersion;
            return this;
        }
        public String getEasyRecVersion() {
            return this.easyRecVersion;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }
        public String getFeatureConsistencyCheckJobConfigId() {
            return this.featureConsistencyCheckJobConfigId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureDisplayExclude(String featureDisplayExclude) {
            this.featureDisplayExclude = featureDisplayExclude;
            return this;
        }
        public String getFeatureDisplayExclude() {
            return this.featureDisplayExclude;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureLandingResourceId(String featureLandingResourceId) {
            this.featureLandingResourceId = featureLandingResourceId;
            return this;
        }
        public String getFeatureLandingResourceId() {
            return this.featureLandingResourceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureLandingResourceUri(String featureLandingResourceUri) {
            this.featureLandingResourceUri = featureLandingResourceUri;
            return this;
        }
        public String getFeatureLandingResourceUri() {
            return this.featureLandingResourceUri;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeaturePriority(String featurePriority) {
            this.featurePriority = featurePriority;
            return this;
        }
        public String getFeaturePriority() {
            return this.featurePriority;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFgJarVersion(String fgJarVersion) {
            this.fgJarVersion = fgJarVersion;
            return this;
        }
        public String getFgJarVersion() {
            return this.fgJarVersion;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFgJsonFileName(String fgJsonFileName) {
            this.fgJsonFileName = fgJsonFileName;
            return this;
        }
        public String getFgJsonFileName() {
            return this.fgJsonFileName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGenerateZip(Boolean generateZip) {
            this.generateZip = generateZip;
            return this;
        }
        public Boolean getGenerateZip() {
            return this.generateZip;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemIdField(String itemIdField) {
            this.itemIdField = itemIdField;
            return this;
        }
        public String getItemIdField() {
            return this.itemIdField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTable(String itemTable) {
            this.itemTable = itemTable;
            return this;
        }
        public String getItemTable() {
            return this.itemTable;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTablePartitionField(String itemTablePartitionField) {
            this.itemTablePartitionField = itemTablePartitionField;
            return this;
        }
        public String getItemTablePartitionField() {
            return this.itemTablePartitionField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
            this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
            return this;
        }
        public String getItemTablePartitionFieldFormat() {
            return this.itemTablePartitionFieldFormat;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobGmtSamplingEndTime(String latestJobGmtSamplingEndTime) {
            this.latestJobGmtSamplingEndTime = latestJobGmtSamplingEndTime;
            return this;
        }
        public String getLatestJobGmtSamplingEndTime() {
            return this.latestJobGmtSamplingEndTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobGmtSamplingStartTime(String latestJobGmtSamplingStartTime) {
            this.latestJobGmtSamplingStartTime = latestJobGmtSamplingStartTime;
            return this;
        }
        public String getLatestJobGmtSamplingStartTime() {
            return this.latestJobGmtSamplingStartTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobId(String latestJobId) {
            this.latestJobId = latestJobId;
            return this;
        }
        public String getLatestJobId() {
            return this.latestJobId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setOssResourceId(String ossResourceId) {
            this.ossResourceId = ossResourceId;
            return this;
        }
        public String getOssResourceId() {
            return this.ossResourceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }
        public String getUserIdField() {
            return this.userIdField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTable(String userTable) {
            this.userTable = userTable;
            return this;
        }
        public String getUserTable() {
            return this.userTable;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTablePartitionField(String userTablePartitionField) {
            this.userTablePartitionField = userTablePartitionField;
            return this;
        }
        public String getUserTablePartitionField() {
            return this.userTablePartitionField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
            this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
            return this;
        }
        public String getUserTablePartitionFieldFormat() {
            return this.userTablePartitionFieldFormat;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

}
