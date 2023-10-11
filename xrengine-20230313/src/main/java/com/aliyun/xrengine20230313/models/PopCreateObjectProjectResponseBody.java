// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateObjectProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopCreateObjectProjectResponseBodyData data;

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

    public static PopCreateObjectProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopCreateObjectProjectResponseBody self = new PopCreateObjectProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopCreateObjectProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopCreateObjectProjectResponseBody setData(PopCreateObjectProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopCreateObjectProjectResponseBodyData getData() {
        return this.data;
    }

    public PopCreateObjectProjectResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public PopCreateObjectProjectResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public PopCreateObjectProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopCreateObjectProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopCreateObjectProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopCreateObjectProjectResponseBodyDataBuildDetail extends TeaModel {
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

        public static PopCreateObjectProjectResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataBuildDetail self = new PopCreateObjectProjectResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopCreateObjectProjectResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataDatasetPolicy extends TeaModel {
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

        public static PopCreateObjectProjectResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataDatasetPolicy self = new PopCreateObjectProjectResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataDatasetToken extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("Host")
        public String host;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static PopCreateObjectProjectResponseBodyDataDatasetToken build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataDatasetToken self = new PopCreateObjectProjectResponseBodyDataDatasetToken();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopCreateObjectProjectResponseBodyDataDatasetToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataDataset extends TeaModel {
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
        public PopCreateObjectProjectResponseBodyDataDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Token")
        public PopCreateObjectProjectResponseBodyDataDatasetToken token;

        public static PopCreateObjectProjectResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataDataset self = new PopCreateObjectProjectResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setPolicy(PopCreateObjectProjectResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopCreateObjectProjectResponseBodyDataDataset setToken(PopCreateObjectProjectResponseBodyDataDatasetToken token) {
            this.token = token;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataDatasetToken getToken() {
            return this.token;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataSourceClothes extends TeaModel {
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

        public static PopCreateObjectProjectResponseBodyDataSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataSourceClothes self = new PopCreateObjectProjectResponseBodyDataSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopCreateObjectProjectResponseBodyDataSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataSourcePolicy extends TeaModel {
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

        public static PopCreateObjectProjectResponseBodyDataSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataSourcePolicy self = new PopCreateObjectProjectResponseBodyDataSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopCreateObjectProjectResponseBodyDataSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataSourceSourceFiles extends TeaModel {
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

        public static PopCreateObjectProjectResponseBodyDataSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataSourceSourceFiles self = new PopCreateObjectProjectResponseBodyDataSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopCreateObjectProjectResponseBodyDataSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataSourceToken extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("Host")
        public String host;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static PopCreateObjectProjectResponseBodyDataSourceToken build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataSourceToken self = new PopCreateObjectProjectResponseBodyDataSourceToken();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopCreateObjectProjectResponseBodyDataSourceToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopCreateObjectProjectResponseBodyDataSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopCreateObjectProjectResponseBodyDataSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopCreateObjectProjectResponseBodyDataSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopCreateObjectProjectResponseBodyDataSourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        public PopCreateObjectProjectResponseBodyDataSourceToken token;

        public static PopCreateObjectProjectResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyDataSource self = new PopCreateObjectProjectResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyDataSource setClothes(java.util.List<PopCreateObjectProjectResponseBodyDataSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopCreateObjectProjectResponseBodyDataSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopCreateObjectProjectResponseBodyDataSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyDataSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyDataSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopCreateObjectProjectResponseBodyDataSource setPolicy(PopCreateObjectProjectResponseBodyDataSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopCreateObjectProjectResponseBodyDataSource setSourceFiles(java.util.List<PopCreateObjectProjectResponseBodyDataSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopCreateObjectProjectResponseBodyDataSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public PopCreateObjectProjectResponseBodyDataSource setToken(PopCreateObjectProjectResponseBodyDataSourceToken token) {
            this.token = token;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataSourceToken getToken() {
            return this.token;
        }

    }

    public static class PopCreateObjectProjectResponseBodyData extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopCreateObjectProjectResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopCreateObjectProjectResponseBodyDataDataset dataset;

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

        @NameInMap("RecommendStatus")
        public String recommendStatus;

        @NameInMap("Source")
        public PopCreateObjectProjectResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopCreateObjectProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectProjectResponseBodyData self = new PopCreateObjectProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectProjectResponseBodyData setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopCreateObjectProjectResponseBodyData setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopCreateObjectProjectResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopCreateObjectProjectResponseBodyData setBuildDetail(PopCreateObjectProjectResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopCreateObjectProjectResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopCreateObjectProjectResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopCreateObjectProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreateObjectProjectResponseBodyData setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopCreateObjectProjectResponseBodyData setDataset(PopCreateObjectProjectResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopCreateObjectProjectResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreateObjectProjectResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopCreateObjectProjectResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopCreateObjectProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopCreateObjectProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopCreateObjectProjectResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreateObjectProjectResponseBodyData setRecommendStatus(String recommendStatus) {
            this.recommendStatus = recommendStatus;
            return this;
        }
        public String getRecommendStatus() {
            return this.recommendStatus;
        }

        public PopCreateObjectProjectResponseBodyData setSource(PopCreateObjectProjectResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public PopCreateObjectProjectResponseBodyDataSource getSource() {
            return this.source;
        }

        public PopCreateObjectProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopCreateObjectProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopCreateObjectProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
