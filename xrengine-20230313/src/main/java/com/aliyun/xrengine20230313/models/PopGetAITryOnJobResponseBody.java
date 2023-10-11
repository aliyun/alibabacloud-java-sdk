// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopGetAITryOnJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopGetAITryOnJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopGetAITryOnJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopGetAITryOnJobResponseBody self = new PopGetAITryOnJobResponseBody();
        return TeaModel.build(map, self);
    }

    public PopGetAITryOnJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopGetAITryOnJobResponseBody setData(PopGetAITryOnJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopGetAITryOnJobResponseBodyData getData() {
        return this.data;
    }

    public PopGetAITryOnJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopGetAITryOnJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopGetAITryOnJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setPolicy(PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public java.util.List<String> options;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Part")
        public String part;

        @NameInMap("Size")
        public String size;

        @NameInMap("SkuProps")
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps> skuProps;

        @NameInMap("Skus")
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus> skus;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Integer version;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setSkuProps(java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps> skuProps) {
            this.skuProps = skuProps;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkuProps> getSkuProps() {
            return this.skuProps;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setSkus(java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothesSkus> getSkus() {
            return this.skus;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken token;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setClothes(java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setPolicy(PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setSourceFiles(java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource setToken(PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken token) {
            this.token = token;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSourceToken getToken() {
            return this.token;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataDummyProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset dataset;

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

        @NameInMap("Source")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataDummyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataDummyProjectInfo self = new PopGetAITryOnJobResponseBodyDataDummyProjectInfo();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setBuildDetail(PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setDataset(PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoDataset getDataset() {
            return this.dataset;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setSource(PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource source) {
            this.source = source;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfoSource getSource() {
            return this.source;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ListStatus")
        public String listStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms self = new PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataMaterialInfoModel extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ListStatus")
        public String listStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataMaterialInfoModel build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataMaterialInfoModel self = new PopGetAITryOnJobResponseBodyDataMaterialInfoModel();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataMaterialInfoSuit extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ListStatus")
        public String listStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataMaterialInfoSuit build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataMaterialInfoSuit self = new PopGetAITryOnJobResponseBodyDataMaterialInfoSuit();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataMaterialInfoTops extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ListStatus")
        public String listStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataMaterialInfoTops build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataMaterialInfoTops self = new PopGetAITryOnJobResponseBodyDataMaterialInfoTops();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataMaterialInfo extends TeaModel {
        @NameInMap("Bottoms")
        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms bottoms;

        @NameInMap("ClothingType")
        public String clothingType;

        @NameInMap("Model")
        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel model;

        @NameInMap("ShoeType")
        public String shoeType;

        @NameInMap("Suit")
        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit suit;

        @NameInMap("Tops")
        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops tops;

        public static PopGetAITryOnJobResponseBodyDataMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataMaterialInfo self = new PopGetAITryOnJobResponseBodyDataMaterialInfo();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setBottoms(PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms bottoms) {
            this.bottoms = bottoms;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataMaterialInfoBottoms getBottoms() {
            return this.bottoms;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setClothingType(String clothingType) {
            this.clothingType = clothingType;
            return this;
        }
        public String getClothingType() {
            return this.clothingType;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setModel(PopGetAITryOnJobResponseBodyDataMaterialInfoModel model) {
            this.model = model;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataMaterialInfoModel getModel() {
            return this.model;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setShoeType(String shoeType) {
            this.shoeType = shoeType;
            return this;
        }
        public String getShoeType() {
            return this.shoeType;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setSuit(PopGetAITryOnJobResponseBodyDataMaterialInfoSuit suit) {
            this.suit = suit;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataMaterialInfoSuit getSuit() {
            return this.suit;
        }

        public PopGetAITryOnJobResponseBodyDataMaterialInfo setTops(PopGetAITryOnJobResponseBodyDataMaterialInfoTops tops) {
            this.tops = tops;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataMaterialInfoTops getTops() {
            return this.tops;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksFeedback extends TeaModel {
        @NameInMap("DislikeTags")
        public java.util.List<Integer> dislikeTags;

        @NameInMap("OtherReason")
        public String otherReason;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Rating")
        public Integer rating;

        public static PopGetAITryOnJobResponseBodyDataSubTasksFeedback build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksFeedback self = new PopGetAITryOnJobResponseBodyDataSubTasksFeedback();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback setDislikeTags(java.util.List<Integer> dislikeTags) {
            this.dislikeTags = dislikeTags;
            return this;
        }
        public java.util.List<Integer> getDislikeTags() {
            return this.dislikeTags;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback setOtherReason(String otherReason) {
            this.otherReason = otherReason;
            return this;
        }
        public String getOtherReason() {
            return this.otherReason;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setPolicy(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public java.util.List<String> options;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Part")
        public String part;

        @NameInMap("Size")
        public String size;

        @NameInMap("SkuProps")
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> skuProps;

        @NameInMap("Skus")
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> skus;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Integer version;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setSkuProps(java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> skuProps) {
            this.skuProps = skuProps;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> getSkuProps() {
            return this.skuProps;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setSkus(java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> getSkus() {
            return this.skus;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles extends TeaModel {
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

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken extends TeaModel {
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

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken token;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setClothes(java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setPolicy(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setSourceFiles(java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource setToken(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken token) {
            this.token = token;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSourceToken getToken() {
            return this.token;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset dataset;

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

        @NameInMap("Source")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo self = new PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setBuildDetail(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setDataset(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoDataset getDataset() {
            return this.dataset;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setSource(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource source) {
            this.source = source;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfoSource getSource() {
            return this.source;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopGetAITryOnJobResponseBodyDataSubTasks extends TeaModel {
        @NameInMap("Feedback")
        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback feedback;

        @NameInMap("SubProjectInfo")
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo subProjectInfo;

        public static PopGetAITryOnJobResponseBodyDataSubTasks build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyDataSubTasks self = new PopGetAITryOnJobResponseBodyDataSubTasks();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyDataSubTasks setFeedback(PopGetAITryOnJobResponseBodyDataSubTasksFeedback feedback) {
            this.feedback = feedback;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksFeedback getFeedback() {
            return this.feedback;
        }

        public PopGetAITryOnJobResponseBodyDataSubTasks setSubProjectInfo(PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo subProjectInfo) {
            this.subProjectInfo = subProjectInfo;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataSubTasksSubProjectInfo getSubProjectInfo() {
            return this.subProjectInfo;
        }

    }

    public static class PopGetAITryOnJobResponseBodyData extends TeaModel {
        @NameInMap("DummyProjectInfo")
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo dummyProjectInfo;

        @NameInMap("MaterialInfo")
        public PopGetAITryOnJobResponseBodyDataMaterialInfo materialInfo;

        @NameInMap("SubTasks")
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasks> subTasks;

        public static PopGetAITryOnJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopGetAITryOnJobResponseBodyData self = new PopGetAITryOnJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopGetAITryOnJobResponseBodyData setDummyProjectInfo(PopGetAITryOnJobResponseBodyDataDummyProjectInfo dummyProjectInfo) {
            this.dummyProjectInfo = dummyProjectInfo;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataDummyProjectInfo getDummyProjectInfo() {
            return this.dummyProjectInfo;
        }

        public PopGetAITryOnJobResponseBodyData setMaterialInfo(PopGetAITryOnJobResponseBodyDataMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public PopGetAITryOnJobResponseBodyDataMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public PopGetAITryOnJobResponseBodyData setSubTasks(java.util.List<PopGetAITryOnJobResponseBodyDataSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<PopGetAITryOnJobResponseBodyDataSubTasks> getSubTasks() {
            return this.subTasks;
        }

    }

}
