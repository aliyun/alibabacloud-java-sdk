// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoAnalysisRequest extends TeaModel {
    @NameInMap("autoRoleRecognitionVideoUrl")
    public String autoRoleRecognitionVideoUrl;

    @NameInMap("excludeGenerateOptions")
    public java.util.List<String> excludeGenerateOptions;

    @NameInMap("faceIdentitySimilarityMinScore")
    public Float faceIdentitySimilarityMinScore;

    @NameInMap("frameSampleMethod")
    public RunVideoAnalysisRequestFrameSampleMethod frameSampleMethod;

    @NameInMap("generateOptions")
    public java.util.List<String> generateOptions;

    /**
     * <strong>example:</strong>
     * <p>english</p>
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
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5ax</p>
     */
    @NameInMap("originalSessionId")
    public String originalSessionId;

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
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    @NameInMap("textProcessTasks")
    public java.util.List<RunVideoAnalysisRequestTextProcessTasks> textProcessTasks;

    @NameInMap("videoCaptionInfo")
    public RunVideoAnalysisRequestVideoCaptionInfo videoCaptionInfo;

    @NameInMap("videoExtraInfo")
    public String videoExtraInfo;

    @NameInMap("videoModelCustomPromptTemplate")
    public String videoModelCustomPromptTemplate;

    /**
     * <strong>example:</strong>
     * <p>qwen-vl-max</p>
     */
    @NameInMap("videoModelId")
    public String videoModelId;

    @NameInMap("videoRoles")
    public java.util.List<RunVideoAnalysisRequestVideoRoles> videoRoles;

    @NameInMap("videoShotFaceIdentityCount")
    public Integer videoShotFaceIdentityCount;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx.mp4">http://xxxx.mp4</a></p>
     */
    @NameInMap("videoUrl")
    public String videoUrl;

    public static RunVideoAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunVideoAnalysisRequest self = new RunVideoAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunVideoAnalysisRequest setAutoRoleRecognitionVideoUrl(String autoRoleRecognitionVideoUrl) {
        this.autoRoleRecognitionVideoUrl = autoRoleRecognitionVideoUrl;
        return this;
    }
    public String getAutoRoleRecognitionVideoUrl() {
        return this.autoRoleRecognitionVideoUrl;
    }

    public RunVideoAnalysisRequest setExcludeGenerateOptions(java.util.List<String> excludeGenerateOptions) {
        this.excludeGenerateOptions = excludeGenerateOptions;
        return this;
    }
    public java.util.List<String> getExcludeGenerateOptions() {
        return this.excludeGenerateOptions;
    }

    public RunVideoAnalysisRequest setFaceIdentitySimilarityMinScore(Float faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Float getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public RunVideoAnalysisRequest setFrameSampleMethod(RunVideoAnalysisRequestFrameSampleMethod frameSampleMethod) {
        this.frameSampleMethod = frameSampleMethod;
        return this;
    }
    public RunVideoAnalysisRequestFrameSampleMethod getFrameSampleMethod() {
        return this.frameSampleMethod;
    }

    public RunVideoAnalysisRequest setGenerateOptions(java.util.List<String> generateOptions) {
        this.generateOptions = generateOptions;
        return this;
    }
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    public RunVideoAnalysisRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunVideoAnalysisRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public RunVideoAnalysisRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public RunVideoAnalysisRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunVideoAnalysisRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunVideoAnalysisRequest setSnapshotInterval(Double snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public RunVideoAnalysisRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public RunVideoAnalysisRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunVideoAnalysisRequest setTextProcessTasks(java.util.List<RunVideoAnalysisRequestTextProcessTasks> textProcessTasks) {
        this.textProcessTasks = textProcessTasks;
        return this;
    }
    public java.util.List<RunVideoAnalysisRequestTextProcessTasks> getTextProcessTasks() {
        return this.textProcessTasks;
    }

    public RunVideoAnalysisRequest setVideoCaptionInfo(RunVideoAnalysisRequestVideoCaptionInfo videoCaptionInfo) {
        this.videoCaptionInfo = videoCaptionInfo;
        return this;
    }
    public RunVideoAnalysisRequestVideoCaptionInfo getVideoCaptionInfo() {
        return this.videoCaptionInfo;
    }

    public RunVideoAnalysisRequest setVideoExtraInfo(String videoExtraInfo) {
        this.videoExtraInfo = videoExtraInfo;
        return this;
    }
    public String getVideoExtraInfo() {
        return this.videoExtraInfo;
    }

    public RunVideoAnalysisRequest setVideoModelCustomPromptTemplate(String videoModelCustomPromptTemplate) {
        this.videoModelCustomPromptTemplate = videoModelCustomPromptTemplate;
        return this;
    }
    public String getVideoModelCustomPromptTemplate() {
        return this.videoModelCustomPromptTemplate;
    }

    public RunVideoAnalysisRequest setVideoModelId(String videoModelId) {
        this.videoModelId = videoModelId;
        return this;
    }
    public String getVideoModelId() {
        return this.videoModelId;
    }

    public RunVideoAnalysisRequest setVideoRoles(java.util.List<RunVideoAnalysisRequestVideoRoles> videoRoles) {
        this.videoRoles = videoRoles;
        return this;
    }
    public java.util.List<RunVideoAnalysisRequestVideoRoles> getVideoRoles() {
        return this.videoRoles;
    }

    public RunVideoAnalysisRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public RunVideoAnalysisRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class RunVideoAnalysisRequestFrameSampleMethod extends TeaModel {
        @NameInMap("interval")
        public Double interval;

        @NameInMap("methodName")
        public String methodName;

        @NameInMap("pixel")
        public Integer pixel;

        public static RunVideoAnalysisRequestFrameSampleMethod build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestFrameSampleMethod self = new RunVideoAnalysisRequestFrameSampleMethod();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestFrameSampleMethod setInterval(Double interval) {
            this.interval = interval;
            return this;
        }
        public Double getInterval() {
            return this.interval;
        }

        public RunVideoAnalysisRequestFrameSampleMethod setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public RunVideoAnalysisRequestFrameSampleMethod setPixel(Integer pixel) {
            this.pixel = pixel;
            return this;
        }
        public Integer getPixel() {
            return this.pixel;
        }

    }

    public static class RunVideoAnalysisRequestTextProcessTasks extends TeaModel {
        @NameInMap("modelCustomPromptTemplate")
        public String modelCustomPromptTemplate;

        @NameInMap("modelCustomPromptTemplateId")
        public String modelCustomPromptTemplateId;

        @NameInMap("modelId")
        public String modelId;

        public static RunVideoAnalysisRequestTextProcessTasks build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestTextProcessTasks self = new RunVideoAnalysisRequestTextProcessTasks();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestTextProcessTasks setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
            this.modelCustomPromptTemplate = modelCustomPromptTemplate;
            return this;
        }
        public String getModelCustomPromptTemplate() {
            return this.modelCustomPromptTemplate;
        }

        public RunVideoAnalysisRequestTextProcessTasks setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
            this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
            return this;
        }
        public String getModelCustomPromptTemplateId() {
            return this.modelCustomPromptTemplateId;
        }

        public RunVideoAnalysisRequestTextProcessTasks setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions extends TeaModel {
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

        public static RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions self = new RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunVideoAnalysisRequestVideoCaptionInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss:// | http://</p>
         */
        @NameInMap("videoCaptionFileUrl")
        public String videoCaptionFileUrl;

        @NameInMap("videoCaptions")
        public java.util.List<RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions> videoCaptions;

        public static RunVideoAnalysisRequestVideoCaptionInfo build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestVideoCaptionInfo self = new RunVideoAnalysisRequestVideoCaptionInfo();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestVideoCaptionInfo setVideoCaptionFileUrl(String videoCaptionFileUrl) {
            this.videoCaptionFileUrl = videoCaptionFileUrl;
            return this;
        }
        public String getVideoCaptionFileUrl() {
            return this.videoCaptionFileUrl;
        }

        public RunVideoAnalysisRequestVideoCaptionInfo setVideoCaptions(java.util.List<RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions> videoCaptions) {
            this.videoCaptions = videoCaptions;
            return this;
        }
        public java.util.List<RunVideoAnalysisRequestVideoCaptionInfoVideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

    }

    public static class RunVideoAnalysisRequestVideoRolesTimeIntervals extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        public static RunVideoAnalysisRequestVideoRolesTimeIntervals build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestVideoRolesTimeIntervals self = new RunVideoAnalysisRequestVideoRolesTimeIntervals();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestVideoRolesTimeIntervals setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisRequestVideoRolesTimeIntervals setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class RunVideoAnalysisRequestVideoRoles extends TeaModel {
        @NameInMap("isAutoRecognition")
        public Boolean isAutoRecognition;

        @NameInMap("roleInfo")
        public String roleInfo;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("timeIntervals")
        public java.util.List<RunVideoAnalysisRequestVideoRolesTimeIntervals> timeIntervals;

        @NameInMap("urls")
        public java.util.List<String> urls;

        public static RunVideoAnalysisRequestVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisRequestVideoRoles self = new RunVideoAnalysisRequestVideoRoles();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisRequestVideoRoles setIsAutoRecognition(Boolean isAutoRecognition) {
            this.isAutoRecognition = isAutoRecognition;
            return this;
        }
        public Boolean getIsAutoRecognition() {
            return this.isAutoRecognition;
        }

        public RunVideoAnalysisRequestVideoRoles setRoleInfo(String roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public String getRoleInfo() {
            return this.roleInfo;
        }

        public RunVideoAnalysisRequestVideoRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public RunVideoAnalysisRequestVideoRoles setTimeIntervals(java.util.List<RunVideoAnalysisRequestVideoRolesTimeIntervals> timeIntervals) {
            this.timeIntervals = timeIntervals;
            return this;
        }
        public java.util.List<RunVideoAnalysisRequestVideoRolesTimeIntervals> getTimeIntervals() {
            return this.timeIntervals;
        }

        public RunVideoAnalysisRequestVideoRoles setUrls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<String> getUrls() {
            return this.urls;
        }

    }

}
