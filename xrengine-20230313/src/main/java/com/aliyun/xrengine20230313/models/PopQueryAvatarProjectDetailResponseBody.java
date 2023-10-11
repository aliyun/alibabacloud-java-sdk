// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryAvatarProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopQueryAvatarProjectDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopQueryAvatarProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopQueryAvatarProjectDetailResponseBody self = new PopQueryAvatarProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public PopQueryAvatarProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopQueryAvatarProjectDetailResponseBody setData(PopQueryAvatarProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopQueryAvatarProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public PopQueryAvatarProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopQueryAvatarProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopQueryAvatarProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopQueryAvatarProjectDetailResponseBodyDataBuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        public String completedTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EstimatedDuration")
        public Long estimatedDuration;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static PopQueryAvatarProjectDetailResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopQueryAvatarProjectDetailResponseBodyDataBuildDetail self = new PopQueryAvatarProjectDetailResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopQueryAvatarProjectDetailResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GlbModelUrl")
        public String glbModelUrl;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopQueryAvatarProjectDetailResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopQueryAvatarProjectDetailResponseBodyDataDataset self = new PopQueryAvatarProjectDetailResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopQueryAvatarProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public PopQueryAvatarProjectDetailResponseBodyDataDataset dataset;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Dependencies")
        public String dependencies;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("MaterialCoverUrl")
        public String materialCoverUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopQueryAvatarProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopQueryAvatarProjectDetailResponseBodyData self = new PopQueryAvatarProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopQueryAvatarProjectDetailResponseBodyData setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setBuildDetail(PopQueryAvatarProjectDetailResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopQueryAvatarProjectDetailResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setDataset(PopQueryAvatarProjectDetailResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopQueryAvatarProjectDetailResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopQueryAvatarProjectDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
