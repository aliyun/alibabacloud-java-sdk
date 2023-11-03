// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Input")
    public CreateTaskRequestInput input;

    @NameInMap("Parameters")
    public CreateTaskRequestParameters parameters;

    @NameInMap("operation")
    public String operation;

    @NameInMap("type")
    public String type;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateTaskRequest setInput(CreateTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateTaskRequestInput getInput() {
        return this.input;
    }

    public CreateTaskRequest setParameters(CreateTaskRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public CreateTaskRequestParameters getParameters() {
        return this.parameters;
    }

    public CreateTaskRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CreateTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateTaskRequestInput extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Format")
        public String format;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("TaskKey")
        public String taskKey;

        public static CreateTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestInput self = new CreateTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestInput setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public CreateTaskRequestInput setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateTaskRequestInput setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public CreateTaskRequestInput setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public CreateTaskRequestInput setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

    }

    public static class CreateTaskRequestParametersSummarization extends TeaModel {
        @NameInMap("Types")
        public java.util.Map<String, ?> types;

        public static CreateTaskRequestParametersSummarization build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersSummarization self = new CreateTaskRequestParametersSummarization();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersSummarization setTypes(java.util.Map<String, ?> types) {
            this.types = types;
            return this;
        }
        public java.util.Map<String, ?> getTypes() {
            return this.types;
        }

    }

    public static class CreateTaskRequestParametersTranscoding extends TeaModel {
        @NameInMap("SpectrumEnabled")
        public Boolean spectrumEnabled;

        @NameInMap("TargetAudioFormat")
        public String targetAudioFormat;

        @NameInMap("TargetVideoFormat")
        public String targetVideoFormat;

        @NameInMap("VideoThumbnailEnabled")
        public Boolean videoThumbnailEnabled;

        public static CreateTaskRequestParametersTranscoding build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranscoding self = new CreateTaskRequestParametersTranscoding();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranscoding setSpectrumEnabled(Boolean spectrumEnabled) {
            this.spectrumEnabled = spectrumEnabled;
            return this;
        }
        public Boolean getSpectrumEnabled() {
            return this.spectrumEnabled;
        }

        public CreateTaskRequestParametersTranscoding setTargetAudioFormat(String targetAudioFormat) {
            this.targetAudioFormat = targetAudioFormat;
            return this;
        }
        public String getTargetAudioFormat() {
            return this.targetAudioFormat;
        }

        public CreateTaskRequestParametersTranscoding setTargetVideoFormat(String targetVideoFormat) {
            this.targetVideoFormat = targetVideoFormat;
            return this;
        }
        public String getTargetVideoFormat() {
            return this.targetVideoFormat;
        }

        public CreateTaskRequestParametersTranscoding setVideoThumbnailEnabled(Boolean videoThumbnailEnabled) {
            this.videoThumbnailEnabled = videoThumbnailEnabled;
            return this;
        }
        public Boolean getVideoThumbnailEnabled() {
            return this.videoThumbnailEnabled;
        }

    }

    public static class CreateTaskRequestParametersTranscriptionDiarization extends TeaModel {
        @NameInMap("SpeakerCount")
        public Integer speakerCount;

        public static CreateTaskRequestParametersTranscriptionDiarization build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranscriptionDiarization self = new CreateTaskRequestParametersTranscriptionDiarization();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranscriptionDiarization setSpeakerCount(Integer speakerCount) {
            this.speakerCount = speakerCount;
            return this;
        }
        public Integer getSpeakerCount() {
            return this.speakerCount;
        }

    }

    public static class CreateTaskRequestParametersTranscription extends TeaModel {
        @NameInMap("AudioEventDetectionEnabled")
        public Boolean audioEventDetectionEnabled;

        @NameInMap("Diarization")
        public CreateTaskRequestParametersTranscriptionDiarization diarization;

        @NameInMap("DiarizationEnabled")
        public Boolean diarizationEnabled;

        public static CreateTaskRequestParametersTranscription build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranscription self = new CreateTaskRequestParametersTranscription();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranscription setAudioEventDetectionEnabled(Boolean audioEventDetectionEnabled) {
            this.audioEventDetectionEnabled = audioEventDetectionEnabled;
            return this;
        }
        public Boolean getAudioEventDetectionEnabled() {
            return this.audioEventDetectionEnabled;
        }

        public CreateTaskRequestParametersTranscription setDiarization(CreateTaskRequestParametersTranscriptionDiarization diarization) {
            this.diarization = diarization;
            return this;
        }
        public CreateTaskRequestParametersTranscriptionDiarization getDiarization() {
            return this.diarization;
        }

        public CreateTaskRequestParametersTranscription setDiarizationEnabled(Boolean diarizationEnabled) {
            this.diarizationEnabled = diarizationEnabled;
            return this;
        }
        public Boolean getDiarizationEnabled() {
            return this.diarizationEnabled;
        }

    }

    public static class CreateTaskRequestParametersTranslation extends TeaModel {
        @NameInMap("TargetLanguages")
        public java.util.Map<String, ?> targetLanguages;

        public static CreateTaskRequestParametersTranslation build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranslation self = new CreateTaskRequestParametersTranslation();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranslation setTargetLanguages(java.util.Map<String, ?> targetLanguages) {
            this.targetLanguages = targetLanguages;
            return this;
        }
        public java.util.Map<String, ?> getTargetLanguages() {
            return this.targetLanguages;
        }

    }

    public static class CreateTaskRequestParameters extends TeaModel {
        @NameInMap("AutoChaptersEnabled")
        public Boolean autoChaptersEnabled;

        @NameInMap("MeetingAssistanceEnabled")
        public Boolean meetingAssistanceEnabled;

        @NameInMap("Summarization")
        public CreateTaskRequestParametersSummarization summarization;

        @NameInMap("SummarizationEnabled")
        public Boolean summarizationEnabled;

        @NameInMap("Transcoding")
        public CreateTaskRequestParametersTranscoding transcoding;

        @NameInMap("Transcription")
        public CreateTaskRequestParametersTranscription transcription;

        @NameInMap("Translation")
        public CreateTaskRequestParametersTranslation translation;

        @NameInMap("TranslationEnabled")
        public Boolean translationEnabled;

        public static CreateTaskRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParameters self = new CreateTaskRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParameters setAutoChaptersEnabled(Boolean autoChaptersEnabled) {
            this.autoChaptersEnabled = autoChaptersEnabled;
            return this;
        }
        public Boolean getAutoChaptersEnabled() {
            return this.autoChaptersEnabled;
        }

        public CreateTaskRequestParameters setMeetingAssistanceEnabled(Boolean meetingAssistanceEnabled) {
            this.meetingAssistanceEnabled = meetingAssistanceEnabled;
            return this;
        }
        public Boolean getMeetingAssistanceEnabled() {
            return this.meetingAssistanceEnabled;
        }

        public CreateTaskRequestParameters setSummarization(CreateTaskRequestParametersSummarization summarization) {
            this.summarization = summarization;
            return this;
        }
        public CreateTaskRequestParametersSummarization getSummarization() {
            return this.summarization;
        }

        public CreateTaskRequestParameters setSummarizationEnabled(Boolean summarizationEnabled) {
            this.summarizationEnabled = summarizationEnabled;
            return this;
        }
        public Boolean getSummarizationEnabled() {
            return this.summarizationEnabled;
        }

        public CreateTaskRequestParameters setTranscoding(CreateTaskRequestParametersTranscoding transcoding) {
            this.transcoding = transcoding;
            return this;
        }
        public CreateTaskRequestParametersTranscoding getTranscoding() {
            return this.transcoding;
        }

        public CreateTaskRequestParameters setTranscription(CreateTaskRequestParametersTranscription transcription) {
            this.transcription = transcription;
            return this;
        }
        public CreateTaskRequestParametersTranscription getTranscription() {
            return this.transcription;
        }

        public CreateTaskRequestParameters setTranslation(CreateTaskRequestParametersTranslation translation) {
            this.translation = translation;
            return this;
        }
        public CreateTaskRequestParametersTranslation getTranslation() {
            return this.translation;
        }

        public CreateTaskRequestParameters setTranslationEnabled(Boolean translationEnabled) {
            this.translationEnabled = translationEnabled;
            return this;
        }
        public Boolean getTranslationEnabled() {
            return this.translationEnabled;
        }

    }

}
