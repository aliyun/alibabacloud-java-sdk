// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>JV1sRTisRMi****</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Input")
    public CreateTaskRequestInput input;

    @NameInMap("Parameters")
    public CreateTaskRequestParameters parameters;

    /**
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>offline</p>
     */
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
        @NameInMap("AudioChannelMode")
        public String audioChannelMode;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/zzz/1.wav">http://xxx.com/zzz/1.wav</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>pcm</p>
         */
        @NameInMap("Format")
        public String format;

        @NameInMap("LanguageHints")
        public java.util.List<String> languageHints;

        @NameInMap("MultipleStreamsEnabled")
        public Boolean multipleStreamsEnabled;

        @NameInMap("OutputPath")
        public String outputPath;

        @NameInMap("ProgressiveCallbacksEnabled")
        public Boolean progressiveCallbacksEnabled;

        /**
         * <strong>example:</strong>
         * <p>16000</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>task_tingwu_123</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        public static CreateTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestInput self = new CreateTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestInput setAudioChannelMode(String audioChannelMode) {
            this.audioChannelMode = audioChannelMode;
            return this;
        }
        public String getAudioChannelMode() {
            return this.audioChannelMode;
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

        public CreateTaskRequestInput setLanguageHints(java.util.List<String> languageHints) {
            this.languageHints = languageHints;
            return this;
        }
        public java.util.List<String> getLanguageHints() {
            return this.languageHints;
        }

        public CreateTaskRequestInput setMultipleStreamsEnabled(Boolean multipleStreamsEnabled) {
            this.multipleStreamsEnabled = multipleStreamsEnabled;
            return this;
        }
        public Boolean getMultipleStreamsEnabled() {
            return this.multipleStreamsEnabled;
        }

        public CreateTaskRequestInput setOutputPath(String outputPath) {
            this.outputPath = outputPath;
            return this;
        }
        public String getOutputPath() {
            return this.outputPath;
        }

        public CreateTaskRequestInput setProgressiveCallbacksEnabled(Boolean progressiveCallbacksEnabled) {
            this.progressiveCallbacksEnabled = progressiveCallbacksEnabled;
            return this;
        }
        public Boolean getProgressiveCallbacksEnabled() {
            return this.progressiveCallbacksEnabled;
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

        public CreateTaskRequestInput setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateTaskRequestInput setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

    }

    public static class CreateTaskRequestParametersContentExtractionExtractionContents extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Title")
        public String title;

        public static CreateTaskRequestParametersContentExtractionExtractionContents build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersContentExtractionExtractionContents self = new CreateTaskRequestParametersContentExtractionExtractionContents();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersContentExtractionExtractionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTaskRequestParametersContentExtractionExtractionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateTaskRequestParametersContentExtraction extends TeaModel {
        @NameInMap("ExtractionContents")
        public java.util.List<CreateTaskRequestParametersContentExtractionExtractionContents> extractionContents;

        @NameInMap("SceneIntroduction")
        public String sceneIntroduction;

        @NameInMap("SpeakerMap")
        public java.util.Map<String, ?> speakerMap;

        public static CreateTaskRequestParametersContentExtraction build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersContentExtraction self = new CreateTaskRequestParametersContentExtraction();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersContentExtraction setExtractionContents(java.util.List<CreateTaskRequestParametersContentExtractionExtractionContents> extractionContents) {
            this.extractionContents = extractionContents;
            return this;
        }
        public java.util.List<CreateTaskRequestParametersContentExtractionExtractionContents> getExtractionContents() {
            return this.extractionContents;
        }

        public CreateTaskRequestParametersContentExtraction setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        public CreateTaskRequestParametersContentExtraction setSpeakerMap(java.util.Map<String, ?> speakerMap) {
            this.speakerMap = speakerMap;
            return this;
        }
        public java.util.Map<String, ?> getSpeakerMap() {
            return this.speakerMap;
        }

    }

    public static class CreateTaskRequestParametersCustomPromptContents extends TeaModel {
        @NameInMap("Model")
        public String model;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("TransType")
        public String transType;

        public static CreateTaskRequestParametersCustomPromptContents build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersCustomPromptContents self = new CreateTaskRequestParametersCustomPromptContents();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersCustomPromptContents setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateTaskRequestParametersCustomPromptContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTaskRequestParametersCustomPromptContents setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CreateTaskRequestParametersCustomPromptContents setTransType(String transType) {
            this.transType = transType;
            return this;
        }
        public String getTransType() {
            return this.transType;
        }

    }

    public static class CreateTaskRequestParametersCustomPrompt extends TeaModel {
        @NameInMap("Contents")
        public java.util.List<CreateTaskRequestParametersCustomPromptContents> contents;

        public static CreateTaskRequestParametersCustomPrompt build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersCustomPrompt self = new CreateTaskRequestParametersCustomPrompt();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersCustomPrompt setContents(java.util.List<CreateTaskRequestParametersCustomPromptContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<CreateTaskRequestParametersCustomPromptContents> getContents() {
            return this.contents;
        }

    }

    public static class CreateTaskRequestParametersExtraParams extends TeaModel {
        @NameInMap("DomainEducationEnabled")
        public Boolean domainEducationEnabled;

        @NameInMap("MaxKeywords")
        public Integer maxKeywords;

        @NameInMap("NfixEnabled")
        public Boolean nfixEnabled;

        @NameInMap("OcrAuxiliaryEnabled")
        public Boolean ocrAuxiliaryEnabled;

        @NameInMap("TranslateLlmSceneEnabled")
        public Boolean translateLlmSceneEnabled;

        public static CreateTaskRequestParametersExtraParams build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersExtraParams self = new CreateTaskRequestParametersExtraParams();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersExtraParams setDomainEducationEnabled(Boolean domainEducationEnabled) {
            this.domainEducationEnabled = domainEducationEnabled;
            return this;
        }
        public Boolean getDomainEducationEnabled() {
            return this.domainEducationEnabled;
        }

        public CreateTaskRequestParametersExtraParams setMaxKeywords(Integer maxKeywords) {
            this.maxKeywords = maxKeywords;
            return this;
        }
        public Integer getMaxKeywords() {
            return this.maxKeywords;
        }

        public CreateTaskRequestParametersExtraParams setNfixEnabled(Boolean nfixEnabled) {
            this.nfixEnabled = nfixEnabled;
            return this;
        }
        public Boolean getNfixEnabled() {
            return this.nfixEnabled;
        }

        public CreateTaskRequestParametersExtraParams setOcrAuxiliaryEnabled(Boolean ocrAuxiliaryEnabled) {
            this.ocrAuxiliaryEnabled = ocrAuxiliaryEnabled;
            return this;
        }
        public Boolean getOcrAuxiliaryEnabled() {
            return this.ocrAuxiliaryEnabled;
        }

        public CreateTaskRequestParametersExtraParams setTranslateLlmSceneEnabled(Boolean translateLlmSceneEnabled) {
            this.translateLlmSceneEnabled = translateLlmSceneEnabled;
            return this;
        }
        public Boolean getTranslateLlmSceneEnabled() {
            return this.translateLlmSceneEnabled;
        }

    }

    public static class CreateTaskRequestParametersMeetingAssistance extends TeaModel {
        @NameInMap("Types")
        public java.util.List<String> types;

        public static CreateTaskRequestParametersMeetingAssistance build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersMeetingAssistance self = new CreateTaskRequestParametersMeetingAssistance();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersMeetingAssistance setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateTaskRequestParametersServiceInspectionInspectionContents extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Title")
        public String title;

        public static CreateTaskRequestParametersServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersServiceInspectionInspectionContents self = new CreateTaskRequestParametersServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTaskRequestParametersServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateTaskRequestParametersServiceInspection extends TeaModel {
        @NameInMap("InspectionContents")
        public java.util.List<CreateTaskRequestParametersServiceInspectionInspectionContents> inspectionContents;

        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        @NameInMap("SceneIntroduction")
        public String sceneIntroduction;

        @NameInMap("SpeakerMap")
        public java.util.Map<String, ?> speakerMap;

        public static CreateTaskRequestParametersServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersServiceInspection self = new CreateTaskRequestParametersServiceInspection();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersServiceInspection setInspectionContents(java.util.List<CreateTaskRequestParametersServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<CreateTaskRequestParametersServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public CreateTaskRequestParametersServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public CreateTaskRequestParametersServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        public CreateTaskRequestParametersServiceInspection setSpeakerMap(java.util.Map<String, ?> speakerMap) {
            this.speakerMap = speakerMap;
            return this;
        }
        public java.util.Map<String, ?> getSpeakerMap() {
            return this.speakerMap;
        }

    }

    public static class CreateTaskRequestParametersSummarization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Paragraph</p>
         */
        @NameInMap("Types")
        public java.util.List<String> types;

        public static CreateTaskRequestParametersSummarization build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersSummarization self = new CreateTaskRequestParametersSummarization();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersSummarization setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateTaskRequestParametersTranscoding extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SpectrumEnabled")
        public Boolean spectrumEnabled;

        /**
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("TargetAudioFormat")
        public String targetAudioFormat;

        /**
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("TargetVideoFormat")
        public String targetVideoFormat;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioEventDetectionEnabled")
        public Boolean audioEventDetectionEnabled;

        @NameInMap("Diarization")
        public CreateTaskRequestParametersTranscriptionDiarization diarization;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DiarizationEnabled")
        public Boolean diarizationEnabled;

        @NameInMap("Model")
        public String model;

        @NameInMap("OutputLevel")
        public Integer outputLevel;

        @NameInMap("PhraseId")
        public String phraseId;

        public static CreateTaskRequestParametersTranscription build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranscription self = new CreateTaskRequestParametersTranscription();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranscription setAdditionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
            this.additionalStreamOutputLevel = additionalStreamOutputLevel;
            return this;
        }
        public Integer getAdditionalStreamOutputLevel() {
            return this.additionalStreamOutputLevel;
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

        public CreateTaskRequestParametersTranscription setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateTaskRequestParametersTranscription setOutputLevel(Integer outputLevel) {
            this.outputLevel = outputLevel;
            return this;
        }
        public Integer getOutputLevel() {
            return this.outputLevel;
        }

        public CreateTaskRequestParametersTranscription setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

    }

    public static class CreateTaskRequestParametersTranslation extends TeaModel {
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        @NameInMap("OutputLevel")
        public Integer outputLevel;

        @NameInMap("TargetLanguages")
        public java.util.List<String> targetLanguages;

        public static CreateTaskRequestParametersTranslation build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersTranslation self = new CreateTaskRequestParametersTranslation();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersTranslation setAdditionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
            this.additionalStreamOutputLevel = additionalStreamOutputLevel;
            return this;
        }
        public Integer getAdditionalStreamOutputLevel() {
            return this.additionalStreamOutputLevel;
        }

        public CreateTaskRequestParametersTranslation setOutputLevel(Integer outputLevel) {
            this.outputLevel = outputLevel;
            return this;
        }
        public Integer getOutputLevel() {
            return this.outputLevel;
        }

        public CreateTaskRequestParametersTranslation setTargetLanguages(java.util.List<String> targetLanguages) {
            this.targetLanguages = targetLanguages;
            return this;
        }
        public java.util.List<String> getTargetLanguages() {
            return this.targetLanguages;
        }

    }

    public static class CreateTaskRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoChaptersEnabled")
        public Boolean autoChaptersEnabled;

        @NameInMap("ContentExtraction")
        public CreateTaskRequestParametersContentExtraction contentExtraction;

        @NameInMap("ContentExtractionEnabled")
        public Boolean contentExtractionEnabled;

        @NameInMap("CustomPrompt")
        public CreateTaskRequestParametersCustomPrompt customPrompt;

        @NameInMap("CustomPromptEnabled")
        public Boolean customPromptEnabled;

        @NameInMap("ExtraParams")
        public CreateTaskRequestParametersExtraParams extraParams;

        @NameInMap("MeetingAssistance")
        public CreateTaskRequestParametersMeetingAssistance meetingAssistance;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MeetingAssistanceEnabled")
        public Boolean meetingAssistanceEnabled;

        @NameInMap("PptExtractionEnabled")
        public Boolean pptExtractionEnabled;

        @NameInMap("ServiceInspection")
        public CreateTaskRequestParametersServiceInspection serviceInspection;

        @NameInMap("ServiceInspectionEnabled")
        public Boolean serviceInspectionEnabled;

        @NameInMap("Summarization")
        public CreateTaskRequestParametersSummarization summarization;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SummarizationEnabled")
        public Boolean summarizationEnabled;

        @NameInMap("TextPolishEnabled")
        public Boolean textPolishEnabled;

        @NameInMap("Transcoding")
        public CreateTaskRequestParametersTranscoding transcoding;

        @NameInMap("Transcription")
        public CreateTaskRequestParametersTranscription transcription;

        @NameInMap("Translation")
        public CreateTaskRequestParametersTranslation translation;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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

        public CreateTaskRequestParameters setContentExtraction(CreateTaskRequestParametersContentExtraction contentExtraction) {
            this.contentExtraction = contentExtraction;
            return this;
        }
        public CreateTaskRequestParametersContentExtraction getContentExtraction() {
            return this.contentExtraction;
        }

        public CreateTaskRequestParameters setContentExtractionEnabled(Boolean contentExtractionEnabled) {
            this.contentExtractionEnabled = contentExtractionEnabled;
            return this;
        }
        public Boolean getContentExtractionEnabled() {
            return this.contentExtractionEnabled;
        }

        public CreateTaskRequestParameters setCustomPrompt(CreateTaskRequestParametersCustomPrompt customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public CreateTaskRequestParametersCustomPrompt getCustomPrompt() {
            return this.customPrompt;
        }

        public CreateTaskRequestParameters setCustomPromptEnabled(Boolean customPromptEnabled) {
            this.customPromptEnabled = customPromptEnabled;
            return this;
        }
        public Boolean getCustomPromptEnabled() {
            return this.customPromptEnabled;
        }

        public CreateTaskRequestParameters setExtraParams(CreateTaskRequestParametersExtraParams extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public CreateTaskRequestParametersExtraParams getExtraParams() {
            return this.extraParams;
        }

        public CreateTaskRequestParameters setMeetingAssistance(CreateTaskRequestParametersMeetingAssistance meetingAssistance) {
            this.meetingAssistance = meetingAssistance;
            return this;
        }
        public CreateTaskRequestParametersMeetingAssistance getMeetingAssistance() {
            return this.meetingAssistance;
        }

        public CreateTaskRequestParameters setMeetingAssistanceEnabled(Boolean meetingAssistanceEnabled) {
            this.meetingAssistanceEnabled = meetingAssistanceEnabled;
            return this;
        }
        public Boolean getMeetingAssistanceEnabled() {
            return this.meetingAssistanceEnabled;
        }

        public CreateTaskRequestParameters setPptExtractionEnabled(Boolean pptExtractionEnabled) {
            this.pptExtractionEnabled = pptExtractionEnabled;
            return this;
        }
        public Boolean getPptExtractionEnabled() {
            return this.pptExtractionEnabled;
        }

        public CreateTaskRequestParameters setServiceInspection(CreateTaskRequestParametersServiceInspection serviceInspection) {
            this.serviceInspection = serviceInspection;
            return this;
        }
        public CreateTaskRequestParametersServiceInspection getServiceInspection() {
            return this.serviceInspection;
        }

        public CreateTaskRequestParameters setServiceInspectionEnabled(Boolean serviceInspectionEnabled) {
            this.serviceInspectionEnabled = serviceInspectionEnabled;
            return this;
        }
        public Boolean getServiceInspectionEnabled() {
            return this.serviceInspectionEnabled;
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

        public CreateTaskRequestParameters setTextPolishEnabled(Boolean textPolishEnabled) {
            this.textPolishEnabled = textPolishEnabled;
            return this;
        }
        public Boolean getTextPolishEnabled() {
            return this.textPolishEnabled;
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
