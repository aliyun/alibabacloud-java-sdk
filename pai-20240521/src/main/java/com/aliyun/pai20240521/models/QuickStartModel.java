// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class QuickStartModel extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DeploymentCount")
    public Long deploymentCount;

    /**
     * <strong>example:</strong>
     * <p>cv</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("LatestVersion")
    public ModelVersion latestVersion;

    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <strong>example:</strong>
     * <p>https://***.md</p>
     */
    @NameInMap("ModelDoc")
    public String modelDoc;

    /**
     * <strong>example:</strong>
     * <p>model-1123*****</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <strong>example:</strong>
     * <p>1557702098******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>{&quot;en-US&quot;:&quot;Large Language Model&quot;  &quot;zh-CN&quot;:&quot;大语言模型&quot;}</p>
     */
    @NameInMap("QuickStartModelDescription")
    public java.util.Map<String, ?> quickStartModelDescription;

    /**
     * <strong>example:</strong>
     * <p>{&quot;en-US&quot;:&quot;qwen&quot;，  &quot;zh-CN&quot;:&quot;千问&quot;}</p>
     */
    @NameInMap("QuickStartModelName")
    public java.util.Map<String, ?> quickStartModelName;

    /**
     * <strong>example:</strong>
     * <p>model-12346</p>
     */
    @NameInMap("RelatedModelId")
    public String relatedModelId;

    /**
     * <strong>example:</strong>
     * <p>text-classifiaction</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TrainingCount")
    public Long trainingCount;

    /**
     * <strong>example:</strong>
     * <p>1557702098******</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ViewCount")
    public Long viewCount;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ViewCount7Days")
    public Long viewCount7Days;

    /**
     * <strong>example:</strong>
     * <p>234**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QuickStartModel build(java.util.Map<String, ?> map) throws Exception {
        QuickStartModel self = new QuickStartModel();
        return TeaModel.build(map, self);
    }

    public QuickStartModel setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public QuickStartModel setDeploymentCount(Long deploymentCount) {
        this.deploymentCount = deploymentCount;
        return this;
    }
    public Long getDeploymentCount() {
        return this.deploymentCount;
    }

    public QuickStartModel setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public QuickStartModel setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public QuickStartModel setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public QuickStartModel setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public QuickStartModel setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public QuickStartModel setLatestVersion(ModelVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
    }

    public QuickStartModel setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public QuickStartModel setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public QuickStartModel setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public QuickStartModel setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public QuickStartModel setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public QuickStartModel setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public QuickStartModel setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public QuickStartModel setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QuickStartModel setQuickStartModelDescription(java.util.Map<String, ?> quickStartModelDescription) {
        this.quickStartModelDescription = quickStartModelDescription;
        return this;
    }
    public java.util.Map<String, ?> getQuickStartModelDescription() {
        return this.quickStartModelDescription;
    }

    public QuickStartModel setQuickStartModelName(java.util.Map<String, ?> quickStartModelName) {
        this.quickStartModelName = quickStartModelName;
        return this;
    }
    public java.util.Map<String, ?> getQuickStartModelName() {
        return this.quickStartModelName;
    }

    public QuickStartModel setRelatedModelId(String relatedModelId) {
        this.relatedModelId = relatedModelId;
        return this;
    }
    public String getRelatedModelId() {
        return this.relatedModelId;
    }

    public QuickStartModel setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public QuickStartModel setTrainingCount(Long trainingCount) {
        this.trainingCount = trainingCount;
        return this;
    }
    public Long getTrainingCount() {
        return this.trainingCount;
    }

    public QuickStartModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QuickStartModel setViewCount(Long viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    public Long getViewCount() {
        return this.viewCount;
    }

    public QuickStartModel setViewCount7Days(Long viewCount7Days) {
        this.viewCount7Days = viewCount7Days;
        return this;
    }
    public Long getViewCount7Days() {
        return this.viewCount7Days;
    }

    public QuickStartModel setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
