// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>The AppKey of the project created in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>JV1sRTisRMi****</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The basic parameters set when creating a task. The required parameters vary depending on the task type.</p>
     * <ul>
     * <li><p>When type=offline (offline task), you must set the SourceLanguage and FileUrl parameters.</p>
     * </li>
     * <li><p>When type=realtime (real-time meeting task), you must additionally set the SourceLanguage, Format, and SampleRate parameters.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Input")
    public CreateTaskRequestInput input;

    /**
     * <p>The algorithm-related parameters set when creating a task. You can set these as needed.</p>
     */
    @NameInMap("Parameters")
    public CreateTaskRequestParameters parameters;

    /**
     * <p>The operation. Valid values:</p>
     * <ul>
     * <li>start: creates a task. This is the default value. In most cases, you do not need to explicitly set this parameter.</li>
     * <li>stop: stops a real-time meeting task. This value is used in real-time meeting scenarios. After a meeting ends, set this parameter to stop and trigger the call.</li>
     * </ul>
     * <blockquote>
     * <p>Note: When ending a real-time recording, you must set this parameter to stop.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>offline</strong>: offline task, such as offline transcription.</li>
     * <li><strong>realtime</strong>: real-time task, such as creating a real-time recording.</li>
     * </ul>
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
        /**
         * <p>The multi-channel audio and video processing mode.</p>
         */
        @NameInMap("AudioChannelMode")
        public String audioChannelMode;

        /**
         * <p>The HTTP or HTTPS URL of the original audio or video file. This parameter is required when you create an offline transcription task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/zzz/1.wav">http://xxx.com/zzz/1.wav</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The encoding format of the audio stream data when you create a real-time meeting, such as pcm. Valid values:</p>
         * <ul>
         * <li><strong>pcm</strong></li>
         * <li><strong>opus</strong></li>
         * <li><strong>aac</strong></li>
         * <li><strong>speex</strong></li>
         * <li><strong>mp3</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pcm</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The preferred languages. This parameter takes effect only when SourceLanguage is set to &quot;multilingual&quot;. It restricts the output languages of the model.</p>
         */
        @NameInMap("LanguageHints")
        public java.util.List<String> languageHints;

        /**
         * <p>Specifies whether to enable multi-channel audio stream recognition. This parameter needs to be set only in real-time recording scenarios. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MultipleStreamsEnabled")
        public Boolean multipleStreamsEnabled;

        /**
         * <p>After configuring OSS information in the console, you can specify an OSS write path to save results directly to your custom OSS bucket.</p>
         */
        @NameInMap("OutputPath")
        public String outputPath;

        /**
         * <p>Specifies whether to enable the callback feature.
         * To enable the callback feature, configure the callback type and address in the console, and set this parameter to true when creating a task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProgressiveCallbacksEnabled")
        public Boolean progressiveCallbacksEnabled;

        /**
         * <p>The sample rate of the audio stream data when you create a real-time meeting. Valid values: 8000 and 16000.</p>
         * <ul>
         * <li><strong>8000</strong>: telephone customer service scenarios.</li>
         * <li><strong>16000</strong>: real-time meeting audio capture scenarios.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16000</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        /**
         * <p>The language model used for audio transcription. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * <li><strong>fspk</strong>: Chinese-English free speaking</li>
         * <li><strong>ja</strong>: Japanese</li>
         * <li><strong>yue</strong>: Cantonese</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The TaskId returned when you create a real-time recording. You can use this ID to end the real-time recording. Set this parameter only when ending a real-time recording. Do not set it at other times.</p>
         * 
         * <strong>example:</strong>
         * <p>9922c84c087044eda18659c128b56c84</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The custom identifier set by the user to associate with this task.</p>
         * 
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

    public static class CreateTaskRequestParametersAutoChapters extends TeaModel {
        @NameInMap("ChapterGranularity")
        public String chapterGranularity;

        public static CreateTaskRequestParametersAutoChapters build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersAutoChapters self = new CreateTaskRequestParametersAutoChapters();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersAutoChapters setChapterGranularity(String chapterGranularity) {
            this.chapterGranularity = chapterGranularity;
            return this;
        }
        public String getChapterGranularity() {
            return this.chapterGranularity;
        }

    }

    public static class CreateTaskRequestParametersContentExtractionExtractionContents extends TeaModel {
        /**
         * <p>The extraction dimension definition for conversation content extraction.</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Identity")
        public String identity;

        /**
         * <p>The extraction dimension name for conversation content extraction.</p>
         */
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

        public CreateTaskRequestParametersContentExtractionExtractionContents setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
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
        /**
         * <p>The list of extraction dimensions for conversation content extraction, including the name and definition of each extraction item.</p>
         */
        @NameInMap("ExtractionContents")
        public java.util.List<CreateTaskRequestParametersContentExtractionExtractionContents> extractionContents;

        /**
         * <p>The scene description for conversation content extraction.</p>
         */
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
        /**
         * <p>The model specified for the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>tingwu-turbo</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The custom name of the prompt, used to match output results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>summary-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The custom content of the prompt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize the following conversation:{Transcription}</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The format of the {Transcription} tag.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
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
        /**
         * <p>The list of custom prompt parameters.</p>
         */
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

    public static class CreateTaskRequestParametersExtraParamsTranslationHotwordMap extends TeaModel {
        /**
         * <p>The business scenario type.</p>
         */
        @NameInMap("bizType")
        public String bizType;

        @NameInMap("bizUserId")
        public String bizUserId;

        public static CreateTaskRequestParametersExtraParamsTranslationHotwordMap build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersExtraParamsTranslationHotwordMap self = new CreateTaskRequestParametersExtraParamsTranslationHotwordMap();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersExtraParamsTranslationHotwordMap setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public CreateTaskRequestParametersExtraParamsTranslationHotwordMap setBizUserId(String bizUserId) {
            this.bizUserId = bizUserId;
            return this;
        }
        public String getBizUserId() {
            return this.bizUserId;
        }

    }

    public static class CreateTaskRequestParametersExtraParams extends TeaModel {
        @NameInMap("DomainEducationEnabled")
        public Boolean domainEducationEnabled;

        /**
         * <p>The return format of the full-text summary.</p>
         */
        @NameInMap("FullTextSummaryFormat")
        public String fullTextSummaryFormat;

        /**
         * <p>The number of keywords to extract.</p>
         */
        @NameInMap("MaxKeywords")
        public Integer maxKeywords;

        /**
         * <p>Specifies whether to enable Nfix. In most cases, you do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NfixEnabled")
        public Boolean nfixEnabled;

        @NameInMap("OcrAuxiliaryEnabled")
        public Boolean ocrAuxiliaryEnabled;

        @NameInMap("TranslateLlmSceneEnabled")
        public Boolean translateLlmSceneEnabled;

        /**
         * <p>The translation hotword configuration.</p>
         */
        @NameInMap("TranslationHotwordMap")
        public CreateTaskRequestParametersExtraParamsTranslationHotwordMap translationHotwordMap;

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

        public CreateTaskRequestParametersExtraParams setFullTextSummaryFormat(String fullTextSummaryFormat) {
            this.fullTextSummaryFormat = fullTextSummaryFormat;
            return this;
        }
        public String getFullTextSummaryFormat() {
            return this.fullTextSummaryFormat;
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

        public CreateTaskRequestParametersExtraParams setTranslationHotwordMap(CreateTaskRequestParametersExtraParamsTranslationHotwordMap translationHotwordMap) {
            this.translationHotwordMap = translationHotwordMap;
            return this;
        }
        public CreateTaskRequestParametersExtraParamsTranslationHotwordMap getTranslationHotwordMap() {
            return this.translationHotwordMap;
        }

    }

    public static class CreateTaskRequestParametersIdentityRecognitionIdentityContents extends TeaModel {
        /**
         * <p>The identity description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identity name.</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateTaskRequestParametersIdentityRecognitionIdentityContents build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersIdentityRecognitionIdentityContents self = new CreateTaskRequestParametersIdentityRecognitionIdentityContents();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersIdentityRecognitionIdentityContents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTaskRequestParametersIdentityRecognitionIdentityContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTaskRequestParametersIdentityRecognition extends TeaModel {
        /**
         * <p>The list of identity contents for identity recognition, including the identity name and description.</p>
         */
        @NameInMap("IdentityContents")
        public java.util.List<CreateTaskRequestParametersIdentityRecognitionIdentityContents> identityContents;

        /**
         * <p>The scene description for identity recognition.</p>
         */
        @NameInMap("SceneIntroduction")
        public String sceneIntroduction;

        public static CreateTaskRequestParametersIdentityRecognition build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParametersIdentityRecognition self = new CreateTaskRequestParametersIdentityRecognition();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParametersIdentityRecognition setIdentityContents(java.util.List<CreateTaskRequestParametersIdentityRecognitionIdentityContents> identityContents) {
            this.identityContents = identityContents;
            return this;
        }
        public java.util.List<CreateTaskRequestParametersIdentityRecognitionIdentityContents> getIdentityContents() {
            return this.identityContents;
        }

        public CreateTaskRequestParametersIdentityRecognition setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

    public static class CreateTaskRequestParametersMeetingAssistance extends TeaModel {
        /**
         * <p>When the intelligent meeting notes feature is enabled, pass in the expected feature parameter types. Supported types: action items (Actions) and key information (KeyInformation). Key information includes keywords and key content (key sentences).</p>
         */
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
        /**
         * <p>The inspection dimension definition for service inspection.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The inspection dimension name for service inspection.</p>
         */
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
        /**
         * <p>The list of inspection dimensions for service inspection, including the dimension name and definition. The definition specifies the criteria that the large language model uses to determine whether a dimension is matched.</p>
         */
        @NameInMap("InspectionContents")
        public java.util.List<CreateTaskRequestParametersServiceInspectionInspectionContents> inspectionContents;

        /**
         * <p>The description of the inspection target and focus for service inspection.</p>
         */
        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        /**
         * <p>The conversation scene description for service inspection.</p>
         */
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
         * <p>When the summarization feature is enabled, pass in the expected summarization types. Supported types: full-text summary (Paragraph), speaker summary (Conversational), and Q&amp;A review summary (QuestionsAnswering).</p>
         * 
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
         * <p>Specifies whether to generate an audio waveform from the original audio/video file or audio stream and save it. Currently, only MP3 format is supported. This parameter is optional when creating offline file transcription or real-time meetings.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SpectrumEnabled")
        public Boolean spectrumEnabled;

        /**
         * <p>Specifies whether to convert the original audio/video file or audio stream to MP3 format for storage. Currently, only MP3 format is supported. This parameter is optional when creating offline file transcription or real-time meetings.</p>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("TargetAudioFormat")
        public String targetAudioFormat;

        /**
         * <p>Specifies whether to convert the original video file to MP4 format for storage. Currently, only MP4 format is supported. This parameter is meaningful only when creating offline file transcription and the original file is in video format. Typically, you do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("TargetVideoFormat")
        public String targetVideoFormat;

        /**
         * <p>Specifies whether to extract video thumbnails from the original video file and save them. This parameter is meaningful only when creating offline file transcription and the original file is in video format. Typically, you do not need to set this parameter.</p>
         * 
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
         * <p>Sets the speaker diarization parameter.</p>
         * <p>If not set: speaker role differentiation is not used. </p>
         * <p>0: the number of speakers is undetermined.</p>
         * <p>2: the number of speakers is 2.</p>
         * 
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
        /**
         * <p>Sets the output level for speech recognition results of the active speaker in real-time recording scenarios.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results when a complete sentence is recognized.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns results for both intermediate results and complete sentences.</p>
         * </li>
         * </ul>
         * <p>Set this parameter as needed only in real-time recording scenarios when MultipleStreamsEnabled is set to true. This parameter does not need to be set for offline transcription scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        /**
         * <p>Specifies whether to enable audio event detection during speech transcription to determine whether events such as music exist in the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioEventDetectionEnabled")
        public Boolean audioEventDetectionEnabled;

        /**
         * <p>The speaker diarization parameters.</p>
         */
        @NameInMap("Diarization")
        public CreateTaskRequestParametersTranscriptionDiarization diarization;

        /**
         * <p>Specifies whether to enable speaker diarization.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DiarizationEnabled")
        public Boolean diarizationEnabled;

        /**
         * <p>Specifies whether to enable disfluency removal during speech transcription. Enabled by default.</p>
         */
        @NameInMap("DisfluencyEnabled")
        public Boolean disfluencyEnabled;

        /**
         * <p>Sets the speech transcription model to improve transcription accuracy in specific domains.</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Sets the output level for speech recognition results. Default value: 1.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results when a complete sentence is recognized.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns results for both intermediate results and complete sentences.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputLevel")
        public Integer outputLevel;

        @NameInMap("Phrase")
        public java.util.Map<String, ?> phrase;

        /**
         * <p>The vocabulary ID of the hot words.</p>
         * 
         * <strong>example:</strong>
         * <p>ce9c2a34b6d847bf92a77d0a196f****</p>
         */
        @NameInMap("PhraseId")
        public String phraseId;

        /**
         * <p>Specifies whether to enable profanity filtering during speech transcription. Enabled by default.</p>
         */
        @NameInMap("ProfanityFilterEnabled")
        public Boolean profanityFilterEnabled;

        @NameInMap("RealtimeDiarizationEnabled")
        public Boolean realtimeDiarizationEnabled;

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

        public CreateTaskRequestParametersTranscription setDisfluencyEnabled(Boolean disfluencyEnabled) {
            this.disfluencyEnabled = disfluencyEnabled;
            return this;
        }
        public Boolean getDisfluencyEnabled() {
            return this.disfluencyEnabled;
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

        public CreateTaskRequestParametersTranscription setPhrase(java.util.Map<String, ?> phrase) {
            this.phrase = phrase;
            return this;
        }
        public java.util.Map<String, ?> getPhrase() {
            return this.phrase;
        }

        public CreateTaskRequestParametersTranscription setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

        public CreateTaskRequestParametersTranscription setProfanityFilterEnabled(Boolean profanityFilterEnabled) {
            this.profanityFilterEnabled = profanityFilterEnabled;
            return this;
        }
        public Boolean getProfanityFilterEnabled() {
            return this.profanityFilterEnabled;
        }

        public CreateTaskRequestParametersTranscription setRealtimeDiarizationEnabled(Boolean realtimeDiarizationEnabled) {
            this.realtimeDiarizationEnabled = realtimeDiarizationEnabled;
            return this;
        }
        public Boolean getRealtimeDiarizationEnabled() {
            return this.realtimeDiarizationEnabled;
        }

    }

    public static class CreateTaskRequestParametersTranslation extends TeaModel {
        /**
         * <p>Sets the output level for translation results of the active speaker in real-time recording scenarios.</p>
         * <ul>
         * <li><strong>1</strong>: Returns results when a complete sentence is recognized.</li>
         * <li><strong>2</strong>: Returns results for both intermediate results and complete sentences.</li>
         * </ul>
         * <p>Set this parameter as needed only in real-time recording scenarios when MultipleStreamsEnabled is set to true. This parameter does not need to be set for offline transcription scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        /**
         * <p>Sets the output level for real-time translation results. Default value: 1.</p>
         * <ul>
         * <li><strong>1</strong>: Returns results when a complete sentence is recognized.</li>
         * <li><strong>2</strong>: Returns results for both intermediate results and complete sentences.</li>
         * </ul>
         * <p>Set this parameter as needed only in real-time recording scenarios. This parameter does not need to be set for offline transcription scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputLevel")
        public Integer outputLevel;

        /**
         * <p>The target languages to set when the translation feature is enabled. Chinese, English, and Japanese are supported.</p>
         */
        @NameInMap("TargetLanguages")
        public java.util.List<String> targetLanguages;

        /**
         * <p>Specifies whether to use large language model-based translation. Default value: false.</p>
         */
        @NameInMap("TranslateLlmSceneEnabled")
        public Boolean translateLlmSceneEnabled;

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

        public CreateTaskRequestParametersTranslation setTranslateLlmSceneEnabled(Boolean translateLlmSceneEnabled) {
            this.translateLlmSceneEnabled = translateLlmSceneEnabled;
            return this;
        }
        public Boolean getTranslateLlmSceneEnabled() {
            return this.translateLlmSceneEnabled;
        }

    }

    public static class CreateTaskRequestParameters extends TeaModel {
        @NameInMap("AutoChapters")
        public CreateTaskRequestParametersAutoChapters autoChapters;

        /**
         * <p>Specifies whether to enable the chapter overview feature. When enabled, chapter titles and chapter summaries are generated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoChaptersEnabled")
        public Boolean autoChaptersEnabled;

        /**
         * <p>The conversation content extraction parameter object.</p>
         */
        @NameInMap("ContentExtraction")
        public CreateTaskRequestParametersContentExtraction contentExtraction;

        /**
         * <p>The business user ID.</p>
         */
        @NameInMap("ContentExtractionEnabled")
        public Boolean contentExtractionEnabled;

        /**
         * <p>The custom prompt control parameter object.</p>
         */
        @NameInMap("CustomPrompt")
        public CreateTaskRequestParametersCustomPrompt customPrompt;

        /**
         * <p>Specifies whether to enable the custom prompt feature. When enabled, you can enter a personalized custom prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomPromptEnabled")
        public Boolean customPromptEnabled;

        /**
         * <p>The extra parameters. In most cases, you do not need to set this parameter.</p>
         */
        @NameInMap("ExtraParams")
        public CreateTaskRequestParametersExtraParams extraParams;

        /**
         * <p>The identity recognition parameter object.</p>
         */
        @NameInMap("IdentityRecognition")
        public CreateTaskRequestParametersIdentityRecognition identityRecognition;

        /**
         * <p>Specifies whether to enable the identity recognition feature.</p>
         */
        @NameInMap("IdentityRecognitionEnabled")
        public Boolean identityRecognitionEnabled;

        @NameInMap("LlmOutputLanguage")
        public String llmOutputLanguage;

        /**
         * <p>The control parameters for the intelligent meeting notes feature, which supports algorithm processing for action items, keywords, and key content. If you enable MeetingAssistanceEnabled but do not specify algorithm types through MeetingAssistance, all types are called and returned by default.</p>
         */
        @NameInMap("MeetingAssistance")
        public CreateTaskRequestParametersMeetingAssistance meetingAssistance;

        /**
         * <p>Specifies whether to enable the intelligent meeting notes feature. When enabled, results such as keywords, key content, and action items are generated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MeetingAssistanceEnabled")
        public Boolean meetingAssistanceEnabled;

        @NameInMap("Model")
        public String model;

        /**
         * <p>Specifies whether to enable PPT extraction and PPT summarization. When enabled, PPT frames are extracted from the video file and corresponding summaries are generated. Enable this parameter only for offline transcription when the source file is a video file. Results cannot be generated in real-time recording scenarios or offline transcription scenarios where the source file is audio only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PptExtractionEnabled")
        public Boolean pptExtractionEnabled;

        /**
         * <p>The service inspection parameter object.</p>
         */
        @NameInMap("ServiceInspection")
        public CreateTaskRequestParametersServiceInspection serviceInspection;

        /**
         * <p>Specifies whether to enable the service inspection feature. Default value: false.</p>
         */
        @NameInMap("ServiceInspectionEnabled")
        public Boolean serviceInspectionEnabled;

        /**
         * <p>The summarization control parameters.</p>
         */
        @NameInMap("Summarization")
        public CreateTaskRequestParametersSummarization summarization;

        /**
         * <p>Specifies whether to enable the summarization feature. When enabled, results such as full-text summaries and speaker summaries can be generated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SummarizationEnabled")
        public Boolean summarizationEnabled;

        /**
         * <p>Specifies whether to enable the spoken-to-written text conversion feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TextPolishEnabled")
        public Boolean textPolishEnabled;

        /**
         * <p>The audio/video or audio stream transcoding module.</p>
         */
        @NameInMap("Transcoding")
        public CreateTaskRequestParametersTranscoding transcoding;

        /**
         * <p>The speech transcription control parameters.</p>
         */
        @NameInMap("Transcription")
        public CreateTaskRequestParametersTranscription transcription;

        /**
         * <p>The translation control parameters.</p>
         */
        @NameInMap("Translation")
        public CreateTaskRequestParametersTranslation translation;

        /**
         * <p>Specifies whether to enable the translation feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TranslationEnabled")
        public Boolean translationEnabled;

        public static CreateTaskRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestParameters self = new CreateTaskRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestParameters setAutoChapters(CreateTaskRequestParametersAutoChapters autoChapters) {
            this.autoChapters = autoChapters;
            return this;
        }
        public CreateTaskRequestParametersAutoChapters getAutoChapters() {
            return this.autoChapters;
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

        public CreateTaskRequestParameters setIdentityRecognition(CreateTaskRequestParametersIdentityRecognition identityRecognition) {
            this.identityRecognition = identityRecognition;
            return this;
        }
        public CreateTaskRequestParametersIdentityRecognition getIdentityRecognition() {
            return this.identityRecognition;
        }

        public CreateTaskRequestParameters setIdentityRecognitionEnabled(Boolean identityRecognitionEnabled) {
            this.identityRecognitionEnabled = identityRecognitionEnabled;
            return this;
        }
        public Boolean getIdentityRecognitionEnabled() {
            return this.identityRecognitionEnabled;
        }

        public CreateTaskRequestParameters setLlmOutputLanguage(String llmOutputLanguage) {
            this.llmOutputLanguage = llmOutputLanguage;
            return this;
        }
        public String getLlmOutputLanguage() {
            return this.llmOutputLanguage;
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

        public CreateTaskRequestParameters setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
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
