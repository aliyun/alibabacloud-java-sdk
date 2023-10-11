// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopObjectProjectDetailResponseBodyData data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopObjectProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopObjectProjectDetailResponseBody self = new PopObjectProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public PopObjectProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopObjectProjectDetailResponseBody setData(PopObjectProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopObjectProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public PopObjectProjectDetailResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public PopObjectProjectDetailResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public PopObjectProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopObjectProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopObjectProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopObjectProjectDetailResponseBodyDataBuildDetail extends TeaModel {
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

        @NameInMap("SubmitTime")
        public String submitTime;

        public static PopObjectProjectDetailResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataBuildDetail self = new PopObjectProjectDetailResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopObjectProjectDetailResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataDatasetPolicy extends TeaModel {
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

        public static PopObjectProjectDetailResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataDatasetPolicy self = new PopObjectProjectDetailResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopObjectProjectDetailResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

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
        public PopObjectProjectDetailResponseBodyDataDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopObjectProjectDetailResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataDataset self = new PopObjectProjectDetailResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setPolicy(PopObjectProjectDetailResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopObjectProjectDetailResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopObjectProjectDetailResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataSourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        public static PopObjectProjectDetailResponseBodyDataSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataSourceClothes self = new PopObjectProjectDetailResponseBodyDataSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopObjectProjectDetailResponseBodyDataSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataSourcePolicy extends TeaModel {
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

        public static PopObjectProjectDetailResponseBodyDataSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataSourcePolicy self = new PopObjectProjectDetailResponseBodyDataSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopObjectProjectDetailResponseBodyDataSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataSourceSourceFiles extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Filesize")
        public Long filesize;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static PopObjectProjectDetailResponseBodyDataSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataSourceSourceFiles self = new PopObjectProjectDetailResponseBodyDataSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopObjectProjectDetailResponseBodyDataSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopObjectProjectDetailResponseBodyDataSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopObjectProjectDetailResponseBodyDataSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopObjectProjectDetailResponseBodyDataSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopObjectProjectDetailResponseBodyDataSourceSourceFiles> sourceFiles;

        public static PopObjectProjectDetailResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyDataSource self = new PopObjectProjectDetailResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyDataSource setClothes(java.util.List<PopObjectProjectDetailResponseBodyDataSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopObjectProjectDetailResponseBodyDataSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopObjectProjectDetailResponseBodyDataSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyDataSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyDataSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopObjectProjectDetailResponseBodyDataSource setPolicy(PopObjectProjectDetailResponseBodyDataSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopObjectProjectDetailResponseBodyDataSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopObjectProjectDetailResponseBodyDataSource setSourceFiles(java.util.List<PopObjectProjectDetailResponseBodyDataSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopObjectProjectDetailResponseBodyDataSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

    }

    public static class PopObjectProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopObjectProjectDetailResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public PopObjectProjectDetailResponseBodyDataDataset dataset;

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

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public PopObjectProjectDetailResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopObjectProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopObjectProjectDetailResponseBodyData self = new PopObjectProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopObjectProjectDetailResponseBodyData setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopObjectProjectDetailResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopObjectProjectDetailResponseBodyData setBuildDetail(PopObjectProjectDetailResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopObjectProjectDetailResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopObjectProjectDetailResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopObjectProjectDetailResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopObjectProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopObjectProjectDetailResponseBodyData setDataset(PopObjectProjectDetailResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopObjectProjectDetailResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopObjectProjectDetailResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopObjectProjectDetailResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopObjectProjectDetailResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopObjectProjectDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopObjectProjectDetailResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopObjectProjectDetailResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopObjectProjectDetailResponseBodyData setSource(PopObjectProjectDetailResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public PopObjectProjectDetailResponseBodyDataSource getSource() {
            return this.source;
        }

        public PopObjectProjectDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopObjectProjectDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopObjectProjectDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
