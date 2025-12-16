// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskRequest extends TeaModel {
    @NameInMap("addDocumentParam")
    public SubmitVideoAnalysisTaskRequestAddDocumentParam addDocumentParam;

    @NameInMap("autoRoleRecognitionVideoUrl")
    public String autoRoleRecognitionVideoUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deduplicationId")
    public String deduplicationId;

    @NameInMap("excludeGenerateOptions")
    public java.util.List<String> excludeGenerateOptions;

    @NameInMap("faceIdentitySimilarityMinScore")
    public Float faceIdentitySimilarityMinScore;

    @NameInMap("frameSampleMethod")
    public SubmitVideoAnalysisTaskRequestFrameSampleMethod frameSampleMethod;

    @NameInMap("generateOptions")
    public java.util.List<String> generateOptions;

    /**
     * <strong>example:</strong>
     * <p>chinese</p>
     */
    @NameInMap("language")
    public String language;

    @NameInMap("modelCustomPromptTemplate")
    public String modelCustomPromptTemplate;

    /**
     * <strong>example:</strong>
     * <p>PlotDetail</p>
     */
    @NameInMap("modelCustomPromptTemplateId")
    public String modelCustomPromptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("snapshotInterval")
    public Double snapshotInterval;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("splitInterval")
    public Integer splitInterval;

    /**
     * <strong>example:</strong>
     * <p>fixDuration</p>
     */
    @NameInMap("splitType")
    public String splitType;

    @NameInMap("textProcessTasks")
    public java.util.List<SubmitVideoAnalysisTaskRequestTextProcessTasks> textProcessTasks;

    @NameInMap("videoCaptionInfo")
    public SubmitVideoAnalysisTaskRequestVideoCaptionInfo videoCaptionInfo;

    @NameInMap("videoExtraInfo")
    public String videoExtraInfo;

    @NameInMap("videoModelCustomPromptTemplate")
    public String videoModelCustomPromptTemplate;

    /**
     * <strong>example:</strong>
     * <p>qwen-vl-max-latest</p>
     */
    @NameInMap("videoModelId")
    public String videoModelId;

    @NameInMap("videoRoles")
    public java.util.List<SubmitVideoAnalysisTaskRequestVideoRoles> videoRoles;

    @NameInMap("videoShotFaceIdentityCount")
    public Integer videoShotFaceIdentityCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx.mp4">http://xxxx.mp4</a></p>
     */
    @NameInMap("videoUrl")
    public String videoUrl;

    public static SubmitVideoAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAnalysisTaskRequest self = new SubmitVideoAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAnalysisTaskRequest setAddDocumentParam(SubmitVideoAnalysisTaskRequestAddDocumentParam addDocumentParam) {
        this.addDocumentParam = addDocumentParam;
        return this;
    }
    public SubmitVideoAnalysisTaskRequestAddDocumentParam getAddDocumentParam() {
        return this.addDocumentParam;
    }

    public SubmitVideoAnalysisTaskRequest setAutoRoleRecognitionVideoUrl(String autoRoleRecognitionVideoUrl) {
        this.autoRoleRecognitionVideoUrl = autoRoleRecognitionVideoUrl;
        return this;
    }
    public String getAutoRoleRecognitionVideoUrl() {
        return this.autoRoleRecognitionVideoUrl;
    }

    public SubmitVideoAnalysisTaskRequest setDeduplicationId(String deduplicationId) {
        this.deduplicationId = deduplicationId;
        return this;
    }
    public String getDeduplicationId() {
        return this.deduplicationId;
    }

    public SubmitVideoAnalysisTaskRequest setExcludeGenerateOptions(java.util.List<String> excludeGenerateOptions) {
        this.excludeGenerateOptions = excludeGenerateOptions;
        return this;
    }
    public java.util.List<String> getExcludeGenerateOptions() {
        return this.excludeGenerateOptions;
    }

    public SubmitVideoAnalysisTaskRequest setFaceIdentitySimilarityMinScore(Float faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Float getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public SubmitVideoAnalysisTaskRequest setFrameSampleMethod(SubmitVideoAnalysisTaskRequestFrameSampleMethod frameSampleMethod) {
        this.frameSampleMethod = frameSampleMethod;
        return this;
    }
    public SubmitVideoAnalysisTaskRequestFrameSampleMethod getFrameSampleMethod() {
        return this.frameSampleMethod;
    }

    public SubmitVideoAnalysisTaskRequest setGenerateOptions(java.util.List<String> generateOptions) {
        this.generateOptions = generateOptions;
        return this;
    }
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    public SubmitVideoAnalysisTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubmitVideoAnalysisTaskRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public SubmitVideoAnalysisTaskRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public SubmitVideoAnalysisTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitVideoAnalysisTaskRequest setSnapshotInterval(Double snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public SubmitVideoAnalysisTaskRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public SubmitVideoAnalysisTaskRequest setSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }
    public String getSplitType() {
        return this.splitType;
    }

    public SubmitVideoAnalysisTaskRequest setTextProcessTasks(java.util.List<SubmitVideoAnalysisTaskRequestTextProcessTasks> textProcessTasks) {
        this.textProcessTasks = textProcessTasks;
        return this;
    }
    public java.util.List<SubmitVideoAnalysisTaskRequestTextProcessTasks> getTextProcessTasks() {
        return this.textProcessTasks;
    }

    public SubmitVideoAnalysisTaskRequest setVideoCaptionInfo(SubmitVideoAnalysisTaskRequestVideoCaptionInfo videoCaptionInfo) {
        this.videoCaptionInfo = videoCaptionInfo;
        return this;
    }
    public SubmitVideoAnalysisTaskRequestVideoCaptionInfo getVideoCaptionInfo() {
        return this.videoCaptionInfo;
    }

    public SubmitVideoAnalysisTaskRequest setVideoExtraInfo(String videoExtraInfo) {
        this.videoExtraInfo = videoExtraInfo;
        return this;
    }
    public String getVideoExtraInfo() {
        return this.videoExtraInfo;
    }

    public SubmitVideoAnalysisTaskRequest setVideoModelCustomPromptTemplate(String videoModelCustomPromptTemplate) {
        this.videoModelCustomPromptTemplate = videoModelCustomPromptTemplate;
        return this;
    }
    public String getVideoModelCustomPromptTemplate() {
        return this.videoModelCustomPromptTemplate;
    }

    public SubmitVideoAnalysisTaskRequest setVideoModelId(String videoModelId) {
        this.videoModelId = videoModelId;
        return this;
    }
    public String getVideoModelId() {
        return this.videoModelId;
    }

    public SubmitVideoAnalysisTaskRequest setVideoRoles(java.util.List<SubmitVideoAnalysisTaskRequestVideoRoles> videoRoles) {
        this.videoRoles = videoRoles;
        return this;
    }
    public java.util.List<SubmitVideoAnalysisTaskRequestVideoRoles> getVideoRoles() {
        return this.videoRoles;
    }

    public SubmitVideoAnalysisTaskRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public SubmitVideoAnalysisTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class SubmitVideoAnalysisTaskRequestAddDocumentParamDocument extends TeaModel {
        @NameInMap("docId")
        public String docId;

        @NameInMap("title")
        public String title;

        public static SubmitVideoAnalysisTaskRequestAddDocumentParamDocument build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestAddDocumentParamDocument self = new SubmitVideoAnalysisTaskRequestAddDocumentParamDocument();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestAddDocumentParamDocument setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public SubmitVideoAnalysisTaskRequestAddDocumentParamDocument setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestAddDocumentParam extends TeaModel {
        @NameInMap("datasetId")
        public Long datasetId;

        @NameInMap("datasetName")
        public String datasetName;

        @NameInMap("document")
        public SubmitVideoAnalysisTaskRequestAddDocumentParamDocument document;

        public static SubmitVideoAnalysisTaskRequestAddDocumentParam build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestAddDocumentParam self = new SubmitVideoAnalysisTaskRequestAddDocumentParam();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestAddDocumentParam setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public SubmitVideoAnalysisTaskRequestAddDocumentParam setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public SubmitVideoAnalysisTaskRequestAddDocumentParam setDocument(SubmitVideoAnalysisTaskRequestAddDocumentParamDocument document) {
            this.document = document;
            return this;
        }
        public SubmitVideoAnalysisTaskRequestAddDocumentParamDocument getDocument() {
            return this.document;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestFrameSampleMethod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("interval")
        public Double interval;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("methodName")
        public String methodName;

        /**
         * <strong>example:</strong>
         * <p>768</p>
         */
        @NameInMap("pixel")
        public Integer pixel;

        public static SubmitVideoAnalysisTaskRequestFrameSampleMethod build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestFrameSampleMethod self = new SubmitVideoAnalysisTaskRequestFrameSampleMethod();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestFrameSampleMethod setInterval(Double interval) {
            this.interval = interval;
            return this;
        }
        public Double getInterval() {
            return this.interval;
        }

        public SubmitVideoAnalysisTaskRequestFrameSampleMethod setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public SubmitVideoAnalysisTaskRequestFrameSampleMethod setPixel(Integer pixel) {
            this.pixel = pixel;
            return this;
        }
        public Integer getPixel() {
            return this.pixel;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestTextProcessTasks extends TeaModel {
        @NameInMap("modelCustomPromptTemplate")
        public String modelCustomPromptTemplate;

        @NameInMap("modelCustomPromptTemplateId")
        public String modelCustomPromptTemplateId;

        @NameInMap("modelId")
        public String modelId;

        public static SubmitVideoAnalysisTaskRequestTextProcessTasks build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestTextProcessTasks self = new SubmitVideoAnalysisTaskRequestTextProcessTasks();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestTextProcessTasks setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
            this.modelCustomPromptTemplate = modelCustomPromptTemplate;
            return this;
        }
        public String getModelCustomPromptTemplate() {
            return this.modelCustomPromptTemplate;
        }

        public SubmitVideoAnalysisTaskRequestTextProcessTasks setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
            this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
            return this;
        }
        public String getModelCustomPromptTemplateId() {
            return this.modelCustomPromptTemplateId;
        }

        public SubmitVideoAnalysisTaskRequestTextProcessTasks setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("speaker")
        public String speaker;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("text")
        public String text;

        public static SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions self = new SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestVideoCaptionInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss:// | http://</p>
         */
        @NameInMap("videoCaptionFileUrl")
        public String videoCaptionFileUrl;

        @NameInMap("videoCaptions")
        public java.util.List<SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions> videoCaptions;

        public static SubmitVideoAnalysisTaskRequestVideoCaptionInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestVideoCaptionInfo self = new SubmitVideoAnalysisTaskRequestVideoCaptionInfo();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfo setVideoCaptionFileUrl(String videoCaptionFileUrl) {
            this.videoCaptionFileUrl = videoCaptionFileUrl;
            return this;
        }
        public String getVideoCaptionFileUrl() {
            return this.videoCaptionFileUrl;
        }

        public SubmitVideoAnalysisTaskRequestVideoCaptionInfo setVideoCaptions(java.util.List<SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions> videoCaptions) {
            this.videoCaptions = videoCaptions;
            return this;
        }
        public java.util.List<SubmitVideoAnalysisTaskRequestVideoCaptionInfoVideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        public static SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals self = new SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitVideoAnalysisTaskRequestVideoRoles extends TeaModel {
        @NameInMap("isAutoRecognition")
        public Boolean isAutoRecognition;

        @NameInMap("roleInfo")
        public String roleInfo;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("timeIntervals")
        public java.util.List<SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals> timeIntervals;

        @NameInMap("urls")
        public java.util.List<String> urls;

        public static SubmitVideoAnalysisTaskRequestVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestVideoRoles self = new SubmitVideoAnalysisTaskRequestVideoRoles();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskRequestVideoRoles setIsAutoRecognition(Boolean isAutoRecognition) {
            this.isAutoRecognition = isAutoRecognition;
            return this;
        }
        public Boolean getIsAutoRecognition() {
            return this.isAutoRecognition;
        }

        public SubmitVideoAnalysisTaskRequestVideoRoles setRoleInfo(String roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public String getRoleInfo() {
            return this.roleInfo;
        }

        public SubmitVideoAnalysisTaskRequestVideoRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public SubmitVideoAnalysisTaskRequestVideoRoles setTimeIntervals(java.util.List<SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals> timeIntervals) {
            this.timeIntervals = timeIntervals;
            return this;
        }
        public java.util.List<SubmitVideoAnalysisTaskRequestVideoRolesTimeIntervals> getTimeIntervals() {
            return this.timeIntervals;
        }

        public SubmitVideoAnalysisTaskRequestVideoRoles setUrls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<String> getUrls() {
            return this.urls;
        }

    }

}
