// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProjectDetailResponseBodyData data;

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

    public static QueryProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectDetailResponseBody self = new QueryProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProjectDetailResponseBody setData(QueryProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryProjectDetailResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public QueryProjectDetailResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectDetailResponseBodyDataBuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        public String completedTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EstimatedDuration")
        public Long estimatedDuration;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static QueryProjectDetailResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataBuildDetail self = new QueryProjectDetailResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public QueryProjectDetailResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryProjectDetailResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public QueryProjectDetailResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public QueryProjectDetailResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class QueryProjectDetailResponseBodyDataDatasetPolicy extends TeaModel {
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

        public static QueryProjectDetailResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataDatasetPolicy self = new QueryProjectDetailResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public QueryProjectDetailResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class QueryProjectDetailResponseBodyDataDataset extends TeaModel {
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
        public String id;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public QueryProjectDetailResponseBodyDataDatasetPolicy policy;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static QueryProjectDetailResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataDataset self = new QueryProjectDetailResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectDetailResponseBodyDataDataset setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryProjectDetailResponseBodyDataDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryProjectDetailResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryProjectDetailResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectDetailResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryProjectDetailResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public QueryProjectDetailResponseBodyDataDataset setPolicy(QueryProjectDetailResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public QueryProjectDetailResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

        public QueryProjectDetailResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public QueryProjectDetailResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class QueryProjectDetailResponseBodyDataSourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        public static QueryProjectDetailResponseBodyDataSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataSourceClothes self = new QueryProjectDetailResponseBodyDataSourceClothes();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public QueryProjectDetailResponseBodyDataSourceClothes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectDetailResponseBodyDataSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProjectDetailResponseBodyDataSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public QueryProjectDetailResponseBodyDataSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryProjectDetailResponseBodyDataSourceFiles extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static QueryProjectDetailResponseBodyDataSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataSourceFiles self = new QueryProjectDetailResponseBodyDataSourceFiles();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryProjectDetailResponseBodyDataSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryProjectDetailResponseBodyDataSourcePolicy extends TeaModel {
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

        public static QueryProjectDetailResponseBodyDataSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataSourcePolicy self = new QueryProjectDetailResponseBodyDataSourcePolicy();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public QueryProjectDetailResponseBodyDataSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class QueryProjectDetailResponseBodyDataSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<QueryProjectDetailResponseBodyDataSourceClothes> clothes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Files")
        public java.util.List<QueryProjectDetailResponseBodyDataSourceFiles> files;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public QueryProjectDetailResponseBodyDataSourcePolicy policy;

        public static QueryProjectDetailResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyDataSource self = new QueryProjectDetailResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyDataSource setClothes(java.util.List<QueryProjectDetailResponseBodyDataSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<QueryProjectDetailResponseBodyDataSourceClothes> getClothes() {
            return this.clothes;
        }

        public QueryProjectDetailResponseBodyDataSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectDetailResponseBodyDataSource setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryProjectDetailResponseBodyDataSource setFiles(java.util.List<QueryProjectDetailResponseBodyDataSourceFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<QueryProjectDetailResponseBodyDataSourceFiles> getFiles() {
            return this.files;
        }

        public QueryProjectDetailResponseBodyDataSource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectDetailResponseBodyDataSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryProjectDetailResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public QueryProjectDetailResponseBodyDataSource setPolicy(QueryProjectDetailResponseBodyDataSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public QueryProjectDetailResponseBodyDataSourcePolicy getPolicy() {
            return this.policy;
        }

    }

    public static class QueryProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public QueryProjectDetailResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public QueryProjectDetailResponseBodyDataDataset dataset;

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
        public QueryProjectDetailResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static QueryProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectDetailResponseBodyData self = new QueryProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectDetailResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public QueryProjectDetailResponseBodyData setBuildDetail(QueryProjectDetailResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public QueryProjectDetailResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public QueryProjectDetailResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public QueryProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectDetailResponseBodyData setDataset(QueryProjectDetailResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public QueryProjectDetailResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public QueryProjectDetailResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryProjectDetailResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public QueryProjectDetailResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public QueryProjectDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectDetailResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public QueryProjectDetailResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public QueryProjectDetailResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryProjectDetailResponseBodyData setSource(QueryProjectDetailResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public QueryProjectDetailResponseBodyDataSource getSource() {
            return this.source;
        }

        public QueryProjectDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryProjectDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryProjectDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
