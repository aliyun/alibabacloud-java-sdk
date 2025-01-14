// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskRequest extends TeaModel {
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

    public SubmitVideoAnalysisTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
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

    public static class SubmitVideoAnalysisTaskRequestVideoRoles extends TeaModel {
        @NameInMap("roleInfo")
        public String roleInfo;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("urls")
        public java.util.List<String> urls;

        public static SubmitVideoAnalysisTaskRequestVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskRequestVideoRoles self = new SubmitVideoAnalysisTaskRequestVideoRoles();
            return TeaModel.build(map, self);
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

        public SubmitVideoAnalysisTaskRequestVideoRoles setUrls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<String> getUrls() {
            return this.urls;
        }

    }

}
