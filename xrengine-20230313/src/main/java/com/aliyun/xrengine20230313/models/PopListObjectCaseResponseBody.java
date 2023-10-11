// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectCaseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListObjectCaseResponseBodyData> data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

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

    public static PopListObjectCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectCaseResponseBody self = new PopListObjectCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListObjectCaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListObjectCaseResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListObjectCaseResponseBody setData(java.util.List<PopListObjectCaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListObjectCaseResponseBodyData> getData() {
        return this.data;
    }

    public PopListObjectCaseResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public PopListObjectCaseResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public PopListObjectCaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListObjectCaseResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListObjectCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListObjectCaseResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListObjectCaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListObjectCaseResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListObjectCaseResponseBodyDataBuildDetail extends TeaModel {
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

        public static PopListObjectCaseResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataBuildDetail self = new PopListObjectCaseResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopListObjectCaseResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopListObjectCaseResponseBodyDataDatasetPolicy extends TeaModel {
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

        public static PopListObjectCaseResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataDatasetPolicy self = new PopListObjectCaseResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListObjectCaseResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListObjectCaseResponseBodyDataDataset extends TeaModel {
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
        public PopListObjectCaseResponseBodyDataDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopListObjectCaseResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataDataset self = new PopListObjectCaseResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListObjectCaseResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListObjectCaseResponseBodyDataDataset setPolicy(PopListObjectCaseResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListObjectCaseResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopListObjectCaseResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopListObjectCaseResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopListObjectCaseResponseBodyDataSourceClothes extends TeaModel {
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

        public static PopListObjectCaseResponseBodyDataSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataSourceClothes self = new PopListObjectCaseResponseBodyDataSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListObjectCaseResponseBodyDataSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListObjectCaseResponseBodyDataSourcePolicy extends TeaModel {
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

        public static PopListObjectCaseResponseBodyDataSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataSourcePolicy self = new PopListObjectCaseResponseBodyDataSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListObjectCaseResponseBodyDataSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListObjectCaseResponseBodyDataSourceSourceFiles extends TeaModel {
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

        public static PopListObjectCaseResponseBodyDataSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataSourceSourceFiles self = new PopListObjectCaseResponseBodyDataSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopListObjectCaseResponseBodyDataSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopListObjectCaseResponseBodyDataSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopListObjectCaseResponseBodyDataSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopListObjectCaseResponseBodyDataSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopListObjectCaseResponseBodyDataSourceSourceFiles> sourceFiles;

        public static PopListObjectCaseResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyDataSource self = new PopListObjectCaseResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyDataSource setClothes(java.util.List<PopListObjectCaseResponseBodyDataSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopListObjectCaseResponseBodyDataSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopListObjectCaseResponseBodyDataSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyDataSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyDataSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListObjectCaseResponseBodyDataSource setPolicy(PopListObjectCaseResponseBodyDataSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListObjectCaseResponseBodyDataSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopListObjectCaseResponseBodyDataSource setSourceFiles(java.util.List<PopListObjectCaseResponseBodyDataSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopListObjectCaseResponseBodyDataSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

    }

    public static class PopListObjectCaseResponseBodyData extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopListObjectCaseResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopListObjectCaseResponseBodyDataDataset dataset;

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
        public PopListObjectCaseResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopListObjectCaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectCaseResponseBodyData self = new PopListObjectCaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListObjectCaseResponseBodyData setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopListObjectCaseResponseBodyData setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopListObjectCaseResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopListObjectCaseResponseBodyData setBuildDetail(PopListObjectCaseResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopListObjectCaseResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopListObjectCaseResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListObjectCaseResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopListObjectCaseResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListObjectCaseResponseBodyData setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopListObjectCaseResponseBodyData setDataset(PopListObjectCaseResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopListObjectCaseResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopListObjectCaseResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListObjectCaseResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopListObjectCaseResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListObjectCaseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListObjectCaseResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListObjectCaseResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListObjectCaseResponseBodyData setSource(PopListObjectCaseResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public PopListObjectCaseResponseBodyDataSource getSource() {
            return this.source;
        }

        public PopListObjectCaseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListObjectCaseResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopListObjectCaseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
