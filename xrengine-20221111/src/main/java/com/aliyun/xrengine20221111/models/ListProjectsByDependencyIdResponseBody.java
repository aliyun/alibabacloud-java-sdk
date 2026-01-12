// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListProjectsByDependencyIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListProjectsByDependencyIdResponseBodyData> data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectsByDependencyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsByDependencyIdResponseBody self = new ListProjectsByDependencyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsByDependencyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectsByDependencyIdResponseBody setData(java.util.List<ListProjectsByDependencyIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectsByDependencyIdResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectsByDependencyIdResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public ListProjectsByDependencyIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectsByDependencyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsByDependencyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectsByDependencyIdResponseBodyDataBuildDetail extends TeaModel {
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

        public static ListProjectsByDependencyIdResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsByDependencyIdResponseBodyDataBuildDetail self = new ListProjectsByDependencyIdResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public ListProjectsByDependencyIdResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public ListProjectsByDependencyIdResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListProjectsByDependencyIdResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public ListProjectsByDependencyIdResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public ListProjectsByDependencyIdResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class ListProjectsByDependencyIdResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("GlbModelUrl")
        public String glbModelUrl;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static ListProjectsByDependencyIdResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsByDependencyIdResponseBodyDataDataset self = new ListProjectsByDependencyIdResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles extends TeaModel {
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

        public static ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles self = new ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles();
            return TeaModel.build(map, self);
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListProjectsByDependencyIdResponseBodyDataSource extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SourceFiles")
        public java.util.List<ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles> sourceFiles;

        public static ListProjectsByDependencyIdResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsByDependencyIdResponseBodyDataSource self = new ListProjectsByDependencyIdResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectsByDependencyIdResponseBodyDataSource setSourceFiles(java.util.List<ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles> sourceFiles) {
            this.sourceFiles = sourceFiles;
            return this;
        }
        public java.util.List<ListProjectsByDependencyIdResponseBodyDataSourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

    }

    public static class ListProjectsByDependencyIdResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public ListProjectsByDependencyIdResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public ListProjectsByDependencyIdResponseBodyDataDataset dataset;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public ListProjectsByDependencyIdResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static ListProjectsByDependencyIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsByDependencyIdResponseBodyData self = new ListProjectsByDependencyIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsByDependencyIdResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListProjectsByDependencyIdResponseBodyData setBuildDetail(ListProjectsByDependencyIdResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public ListProjectsByDependencyIdResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public ListProjectsByDependencyIdResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectsByDependencyIdResponseBodyData setDataset(ListProjectsByDependencyIdResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListProjectsByDependencyIdResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public ListProjectsByDependencyIdResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListProjectsByDependencyIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsByDependencyIdResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public ListProjectsByDependencyIdResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListProjectsByDependencyIdResponseBodyData setSource(ListProjectsByDependencyIdResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public ListProjectsByDependencyIdResponseBodyDataSource getSource() {
            return this.source;
        }

        public ListProjectsByDependencyIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectsByDependencyIdResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListProjectsByDependencyIdResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
