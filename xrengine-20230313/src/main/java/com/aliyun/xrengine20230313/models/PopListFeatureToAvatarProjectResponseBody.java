// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListFeatureToAvatarProjectResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static PopListFeatureToAvatarProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarProjectResponseBody self = new PopListFeatureToAvatarProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListFeatureToAvatarProjectResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListFeatureToAvatarProjectResponseBody setData(java.util.List<PopListFeatureToAvatarProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListFeatureToAvatarProjectResponseBodyData> getData() {
        return this.data;
    }

    public PopListFeatureToAvatarProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListFeatureToAvatarProjectResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListFeatureToAvatarProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListFeatureToAvatarProjectResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListFeatureToAvatarProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListFeatureToAvatarProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListFeatureToAvatarProjectResponseBodyDataBuildDetail extends TeaModel {
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

        public static PopListFeatureToAvatarProjectResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopListFeatureToAvatarProjectResponseBodyDataBuildDetail self = new PopListFeatureToAvatarProjectResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy self = new PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListFeatureToAvatarProjectResponseBodyDataDataset extends TeaModel {
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

        @NameInMap("Policy")
        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopListFeatureToAvatarProjectResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopListFeatureToAvatarProjectResponseBodyDataDataset self = new PopListFeatureToAvatarProjectResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setPolicy(PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListFeatureToAvatarProjectResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopListFeatureToAvatarProjectResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public PopListFeatureToAvatarProjectResponseBodyDataDataset dataset;

        @NameInMap("Deleted")
        public Boolean deleted;

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

        public static PopListFeatureToAvatarProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListFeatureToAvatarProjectResponseBodyData self = new PopListFeatureToAvatarProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListFeatureToAvatarProjectResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setBuildDetail(PopListFeatureToAvatarProjectResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopListFeatureToAvatarProjectResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setDataset(PopListFeatureToAvatarProjectResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopListFeatureToAvatarProjectResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopListFeatureToAvatarProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
