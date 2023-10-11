// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListAITryOnJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListAITryOnJobsResponseBodyData> data;

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

    public static PopListAITryOnJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListAITryOnJobsResponseBody self = new PopListAITryOnJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListAITryOnJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListAITryOnJobsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListAITryOnJobsResponseBody setData(java.util.List<PopListAITryOnJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListAITryOnJobsResponseBodyData> getData() {
        return this.data;
    }

    public PopListAITryOnJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListAITryOnJobsResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListAITryOnJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListAITryOnJobsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListAITryOnJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListAITryOnJobsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset extends TeaModel {
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
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setPolicy(PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public java.util.List<String> options;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes extends TeaModel {
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
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps> skuProps;

        @NameInMap("Skus")
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus> skus;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Integer version;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setSkuProps(java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps> skuProps) {
            this.skuProps = skuProps;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkuProps> getSkuProps() {
            return this.skuProps;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setSkus(java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothesSkus> getSkus() {
            return this.skus;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes> clothes;

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
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken token;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setClothes(java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setPolicy(PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setSourceFiles(java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource setToken(PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken token) {
            this.token = token;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSourceToken getToken() {
            return this.token;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataDummyProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset dataset;

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
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopListAITryOnJobsResponseBodyDataDummyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataDummyProjectInfo self = new PopListAITryOnJobsResponseBodyDataDummyProjectInfo();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setBuildDetail(PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setDataset(PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoDataset getDataset() {
            return this.dataset;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setSource(PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource source) {
            this.source = source;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfoSource getSource() {
            return this.source;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms self = new PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataMaterialInfoModel extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataMaterialInfoModel build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataMaterialInfoModel self = new PopListAITryOnJobsResponseBodyDataMaterialInfoModel();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataMaterialInfoSuit extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataMaterialInfoSuit build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataMaterialInfoSuit self = new PopListAITryOnJobsResponseBodyDataMaterialInfoSuit();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataMaterialInfoTops extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataMaterialInfoTops build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataMaterialInfoTops self = new PopListAITryOnJobsResponseBodyDataMaterialInfoTops();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataMaterialInfo extends TeaModel {
        @NameInMap("Bottoms")
        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms bottoms;

        @NameInMap("ClothingType")
        public String clothingType;

        @NameInMap("Model")
        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel model;

        @NameInMap("ShoeType")
        public String shoeType;

        @NameInMap("Suit")
        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit suit;

        @NameInMap("Tops")
        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops tops;

        public static PopListAITryOnJobsResponseBodyDataMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataMaterialInfo self = new PopListAITryOnJobsResponseBodyDataMaterialInfo();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setBottoms(PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms bottoms) {
            this.bottoms = bottoms;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataMaterialInfoBottoms getBottoms() {
            return this.bottoms;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setClothingType(String clothingType) {
            this.clothingType = clothingType;
            return this;
        }
        public String getClothingType() {
            return this.clothingType;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setModel(PopListAITryOnJobsResponseBodyDataMaterialInfoModel model) {
            this.model = model;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataMaterialInfoModel getModel() {
            return this.model;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setShoeType(String shoeType) {
            this.shoeType = shoeType;
            return this;
        }
        public String getShoeType() {
            return this.shoeType;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setSuit(PopListAITryOnJobsResponseBodyDataMaterialInfoSuit suit) {
            this.suit = suit;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataMaterialInfoSuit getSuit() {
            return this.suit;
        }

        public PopListAITryOnJobsResponseBodyDataMaterialInfo setTops(PopListAITryOnJobsResponseBodyDataMaterialInfoTops tops) {
            this.tops = tops;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataMaterialInfoTops getTops() {
            return this.tops;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksFeedback extends TeaModel {
        @NameInMap("DislikeTags")
        public java.util.List<Integer> dislikeTags;

        @NameInMap("OtherReason")
        public String otherReason;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Rating")
        public Integer rating;

        public static PopListAITryOnJobsResponseBodyDataSubTasksFeedback build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksFeedback self = new PopListAITryOnJobsResponseBodyDataSubTasksFeedback();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback setDislikeTags(java.util.List<Integer> dislikeTags) {
            this.dislikeTags = dislikeTags;
            return this;
        }
        public java.util.List<Integer> getDislikeTags() {
            return this.dislikeTags;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback setOtherReason(String otherReason) {
            this.otherReason = otherReason;
            return this;
        }
        public String getOtherReason() {
            return this.otherReason;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset extends TeaModel {
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
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setPolicy(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDatasetPolicy getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public java.util.List<String> options;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes extends TeaModel {
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
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> skuProps;

        @NameInMap("Skus")
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> skus;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Integer version;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setSkuProps(java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> skuProps) {
            this.skuProps = skuProps;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkuProps> getSkuProps() {
            return this.skuProps;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setSkus(java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothesSkus> getSkus() {
            return this.skus;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken extends TeaModel {
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

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes> clothes;

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
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy policy;

        @NameInMap("SourceFiles")
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken token;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setClothes(java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceClothes> getClothes() {
            return this.clothes;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setPolicy(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourcePolicy getPolicy() {
            return this.policy;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setSourceFiles(java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource setToken(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken token) {
            this.token = token;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSourceToken getToken() {
            return this.token;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomSource")
        public String customSource;

        @NameInMap("Dataset")
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset dataset;

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
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo self = new PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setBuildDetail(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setCustomSource(String customSource) {
            this.customSource = customSource;
            return this;
        }
        public String getCustomSource() {
            return this.customSource;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setDataset(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoDataset getDataset() {
            return this.dataset;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setSource(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource source) {
            this.source = source;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfoSource getSource() {
            return this.source;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PopListAITryOnJobsResponseBodyDataSubTasks extends TeaModel {
        @NameInMap("Feedback")
        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback feedback;

        @NameInMap("SubProjectInfo")
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo subProjectInfo;

        public static PopListAITryOnJobsResponseBodyDataSubTasks build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyDataSubTasks self = new PopListAITryOnJobsResponseBodyDataSubTasks();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyDataSubTasks setFeedback(PopListAITryOnJobsResponseBodyDataSubTasksFeedback feedback) {
            this.feedback = feedback;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksFeedback getFeedback() {
            return this.feedback;
        }

        public PopListAITryOnJobsResponseBodyDataSubTasks setSubProjectInfo(PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo subProjectInfo) {
            this.subProjectInfo = subProjectInfo;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataSubTasksSubProjectInfo getSubProjectInfo() {
            return this.subProjectInfo;
        }

    }

    public static class PopListAITryOnJobsResponseBodyData extends TeaModel {
        @NameInMap("DummyProjectInfo")
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo dummyProjectInfo;

        @NameInMap("MaterialInfo")
        public PopListAITryOnJobsResponseBodyDataMaterialInfo materialInfo;

        @NameInMap("SubTasks")
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasks> subTasks;

        public static PopListAITryOnJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListAITryOnJobsResponseBodyData self = new PopListAITryOnJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListAITryOnJobsResponseBodyData setDummyProjectInfo(PopListAITryOnJobsResponseBodyDataDummyProjectInfo dummyProjectInfo) {
            this.dummyProjectInfo = dummyProjectInfo;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataDummyProjectInfo getDummyProjectInfo() {
            return this.dummyProjectInfo;
        }

        public PopListAITryOnJobsResponseBodyData setMaterialInfo(PopListAITryOnJobsResponseBodyDataMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public PopListAITryOnJobsResponseBodyDataMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public PopListAITryOnJobsResponseBodyData setSubTasks(java.util.List<PopListAITryOnJobsResponseBodyDataSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<PopListAITryOnJobsResponseBodyDataSubTasks> getSubTasks() {
            return this.subTasks;
        }

    }

}
