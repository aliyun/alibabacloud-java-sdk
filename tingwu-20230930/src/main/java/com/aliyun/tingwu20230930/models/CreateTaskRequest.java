// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>The AppKey of the project that you created in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>JV1sRTisRMi****</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The basic input parameters for creating a task. The required parameters vary based on the task type.</p>
     * <ul>
     * <li><p>For an offline task (<code>type=&quot;offline&quot;</code>), you must specify the <code>SourceLanguage</code> and <code>FileUrl</code> parameters.</p>
     * </li>
     * <li><p>For a real-time task (<code>type=&quot;realtime&quot;</code>), you must also specify the <code>SourceLanguage</code>, <code>Format</code>, and <code>SampleRate</code> parameters.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Input")
    public CreateTaskRequestInput input;

    /**
     * <p>Algorithm-related parameters for customizing task processing.</p>
     */
    @NameInMap("Parameters")
    public CreateTaskRequestParameters parameters;

    /**
     * <p>The operation to perform. Valid values:</p>
     * <ul>
     * <li><p><strong>start</strong>: Creates a task. This is the default value and does not typically need to be set.</p>
     * </li>
     * <li><p><strong>stop</strong>: Stops a real-time recording task. This value is used only for real-time tasks. To end the recording, set this parameter to <code>stop</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>offline</strong>: An offline task, such as an offline transcription.</p>
     * </li>
     * <li><p><strong>realtime</strong>: A real-time task, such as a real-time recording.</p>
     * </li>
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
         * <p>Multi-channel audio or video processing mode.</p>
         */
        @NameInMap("AudioChannelMode")
        public String audioChannelMode;

        /**
         * <p>The HTTP or HTTPS URL of the source audio or video file. This parameter is required when you create an offline transcription task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/zzz/1.wav">http://xxx.com/zzz/1.wav</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The encoding format of the audio stream data. This parameter is required when you create a real-time recording task. The following values are supported:</p>
         * <ul>
         * <li><p><strong>pcm</strong></p>
         * </li>
         * <li><p><strong>opus</strong></p>
         * </li>
         * <li><p><strong>aac</strong></p>
         * </li>
         * <li><p><strong>speex</strong></p>
         * </li>
         * <li><p><strong>mp3</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pcm</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Preferred languages. This applies only when SourceLanguage is multilingual. It restricts the output language of the model.</p>
         */
        @NameInMap("LanguageHints")
        public java.util.List<String> languageHints;

        /**
         * <p>Specifies whether to enable multi-channel audio stream recognition. This parameter applies only to real-time recording scenarios. The default value is <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MultipleStreamsEnabled")
        public Boolean multipleStreamsEnabled;

        /**
         * <p>After you configure OSS settings in the console, specify an OSS path to save results directly to your OSS bucket.</p>
         */
        @NameInMap("OutputPath")
        public String outputPath;

        /**
         * <p>Specifies whether to enable callbacks. To receive callbacks, you must configure the callback type and URL in the console and set this parameter to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProgressiveCallbacksEnabled")
        public Boolean progressiveCallbacksEnabled;

        /**
         * <p>The sample rate of the audio stream data. This parameter is required when you create a real-time recording task. The supported values are 8000 and 16000.</p>
         * <ul>
         * <li><p><strong>8000</strong>: Suitable for telephony and customer service scenarios.</p>
         * </li>
         * <li><p><strong>16000</strong>: Suitable for real-time meeting audio capture scenarios.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16000</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        /**
         * <p>The language model for speech transcription. The following values are supported:</p>
         * <ul>
         * <li><p><strong>cn</strong>: Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * <li><p><strong>fspk</strong>: Chinese-English code-switching</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese</p>
         * </li>
         * <li><p><strong>yue</strong>: Cantonese</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The task ID that is returned when you create a real-time recording. This ID is required to stop the recording. Specify this parameter only when stopping a real-time recording.</p>
         * 
         * <strong>example:</strong>
         * <p>9922c84c087044eda18659c128b56c84</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>A custom identifier that you can set for the task.</p>
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
         * <p>Definition of the content extraction dimension.</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Identity")
        public String identity;

        /**
         * <p>Name of the content extraction dimension.</p>
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
         * <p>List of content extraction dimensions. Each dimension includes a name and definition.</p>
         */
        @NameInMap("ExtractionContents")
        public java.util.List<CreateTaskRequestParametersContentExtractionExtractionContents> extractionContents;

        /**
         * <p>Description of the conversation scenario for content extraction.</p>
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
         * <p>The model to use for the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>tingwu-turbo</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>A custom name for the prompt, used to identify the corresponding output.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>summary-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The content of the custom prompt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>总结一下下面的对话内容:{Transcription}</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>Specifies the format for the <code>{Transcription}</code> tag.</p>
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
         * <p>A list of custom prompt parameters.</p>
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
         * <p>Full-text summary format.</p>
         */
        @NameInMap("FullTextSummaryFormat")
        public String fullTextSummaryFormat;

        /**
         * <p>Maximum number of keywords.</p>
         */
        @NameInMap("MaxKeywords")
        public Integer maxKeywords;

        /**
         * <p>Specifies whether to enable nfix. You do not typically need to configure this parameter.</p>
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
         * <p>Identity description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Identity name.</p>
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
         * <p>List of identities, including identity name and description.</p>
         */
        @NameInMap("IdentityContents")
        public java.util.List<CreateTaskRequestParametersIdentityRecognitionIdentityContents> identityContents;

        /**
         * <p>Description of the scenario for identity recognition.</p>
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
         * <p>The types of analysis to perform when the intelligent minutes feature is enabled. Supported values: <code>Actions</code> (action items) and <code>KeyInformation</code> (key information, including keywords and key points).</p>
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
         * <p>Definition of the inspection dimension.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Name of the inspection dimension.</p>
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
         * <p>List of inspection dimensions for service quality inspection. Each dimension includes a name and definition, which tells the Large Language Model how to evaluate whether the dimension is met.</p>
         */
        @NameInMap("InspectionContents")
        public java.util.List<CreateTaskRequestParametersServiceInspectionInspectionContents> inspectionContents;

        /**
         * <p>Description of the inspection goals and focus areas for service quality inspection.</p>
         */
        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        /**
         * <p>Description of the conversation scenario for service quality inspection.</p>
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
         * <p>The types of summaries to generate. This parameter is required when summarization is enabled. Supported types include <code>Paragraph</code> (full-text summary), <code>Conversational</code> (speaker summary), and <code>QuestionsAnswering</code> (Q\&amp;A summary).</p>
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
         * <p>Specifies whether to generate and save an audio waveform from the source audio/video file or audio stream. This parameter is optional for offline transcription and real-time recording tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SpectrumEnabled")
        public Boolean spectrumEnabled;

        /**
         * <p>Specifies the target format for the transcoded audio. Set to <code>mp3</code> to transcode the source audio into MP3 format for storage. This parameter is optional for offline transcription and real-time recording tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("TargetAudioFormat")
        public String targetAudioFormat;

        /**
         * <p>Specifies the target format for the transcoded video. Set to <code>mp4</code> to transcode the source video into MP4 format for storage. This parameter applies only to offline transcription tasks with a video source file.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("TargetVideoFormat")
        public String targetVideoFormat;

        /**
         * <p>Specifies whether to extract and save video thumbnails from the source video file. This parameter applies only to offline transcription tasks with a video source file.</p>
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
         * <p>Specifies the number of speakers to identify.</p>
         * <p>If this parameter is not set, speakers are not differentiated in the transcript.</p>
         * <p>Set the value to <code>0</code> to identify an unknown number of speakers.</p>
         * <p>Set the value to <code>2</code> to identify two speakers.</p>
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
         * <p>Specifies the level of detail for speech transcription results for the active speaker in a real-time recording scenario.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results only when a complete sentence is recognized.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns both intermediate and final results as they are recognized.</p>
         * </li>
         * </ul>
         * <p>This parameter applies only to real-time recordings when <code>MultipleStreamsEnabled</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        /**
         * <p>Specifies whether to enable sound event detection, which identifies non-speech events in the audio, such as music.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioEventDetectionEnabled")
        public Boolean audioEventDetectionEnabled;

        /**
         * <p>Parameters for the speaker diarization feature.</p>
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

        @NameInMap("DisfluencyEnabled")
        public Boolean disfluencyEnabled;

        /**
         * <p>Set the speech transcription model to improve accuracy for specific domains.</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Specifies the level of detail for the speech transcription results. Default value: <code>1</code>.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results only when a complete sentence is recognized.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns both intermediate and final results as they are recognized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputLevel")
        public Integer outputLevel;

        /**
         * <p>The ID of the hotword list.</p>
         * 
         * <strong>example:</strong>
         * <p>ce9c2a34b6d847bf92a77d0a196f****</p>
         */
        @NameInMap("PhraseId")
        public String phraseId;

        /**
         * <p>Enable sensitive word filtering during speech transcription. Enabled by default.</p>
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
         * <p>Specifies the level of detail for real-time translation results for the active speaker.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results only for complete sentences.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns both intermediate and final results.</p>
         * </li>
         * </ul>
         * <p>This parameter applies only to real-time recordings when <code>MultipleStreamsEnabled</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdditionalStreamOutputLevel")
        public Integer additionalStreamOutputLevel;

        /**
         * <p>Specifies the level of detail for real-time translation results. Default value: <code>1</code>.</p>
         * <ul>
         * <li><p><strong>1</strong>: Returns results only for complete sentences.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns both intermediate and final results.</p>
         * </li>
         * </ul>
         * <p>This parameter applies only to real-time recordings.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputLevel")
        public Integer outputLevel;

        /**
         * <p>The target languages for translation. This parameter is required if translation is enabled. Supported languages include Chinese, English, and Japanese.</p>
         */
        @NameInMap("TargetLanguages")
        public java.util.List<String> targetLanguages;

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
         * <p>Specifies whether to generate a chapter summary, which includes chapter titles and summaries for each chapter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoChaptersEnabled")
        public Boolean autoChaptersEnabled;

        /**
         * <p>Conversation content extraction parameters.</p>
         */
        @NameInMap("ContentExtraction")
        public CreateTaskRequestParametersContentExtraction contentExtraction;

        @NameInMap("ContentExtractionEnabled")
        public Boolean contentExtractionEnabled;

        /**
         * <p>Parameters to control the custom prompt feature.</p>
         */
        @NameInMap("CustomPrompt")
        public CreateTaskRequestParametersCustomPrompt customPrompt;

        /**
         * <p>Specifies whether to enable the custom prompt feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomPromptEnabled")
        public Boolean customPromptEnabled;

        /**
         * <p>Extended parameters for advanced use cases. You do not typically need to configure these parameters.</p>
         */
        @NameInMap("ExtraParams")
        public CreateTaskRequestParametersExtraParams extraParams;

        /**
         * <p>Identity recognition parameters.</p>
         */
        @NameInMap("IdentityRecognition")
        public CreateTaskRequestParametersIdentityRecognition identityRecognition;

        /**
         * <p>Enable identity recognition.</p>
         */
        @NameInMap("IdentityRecognitionEnabled")
        public Boolean identityRecognitionEnabled;

        @NameInMap("LlmOutputLanguage")
        public String llmOutputLanguage;

        /**
         * <p>Parameters for the intelligent minutes feature, which supports processing for action items, keywords, and key points. If <code>MeetingAssistanceEnabled</code> is set to <code>true</code> but you do not specify this object, all analysis types are enabled by default.</p>
         */
        @NameInMap("MeetingAssistance")
        public CreateTaskRequestParametersMeetingAssistance meetingAssistance;

        /**
         * <p>Specifies whether to generate intelligent minutes, which include keywords, key points, and action items.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MeetingAssistanceEnabled")
        public Boolean meetingAssistanceEnabled;

        @NameInMap("Model")
        public String model;

        /**
         * <p>Specifies whether to enable PPT extraction. If enabled, the service extracts slides from the video file and generates corresponding summaries. This feature applies only to offline transcription tasks with a video source file and has no effect on other task types.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PptExtractionEnabled")
        public Boolean pptExtractionEnabled;

        /**
         * <p>Service quality inspection parameters.</p>
         */
        @NameInMap("ServiceInspection")
        public CreateTaskRequestParametersServiceInspection serviceInspection;

        /**
         * <p>Enable service quality inspection. Default is false.</p>
         */
        @NameInMap("ServiceInspectionEnabled")
        public Boolean serviceInspectionEnabled;

        /**
         * <p>Parameters for the summarization feature.</p>
         */
        @NameInMap("Summarization")
        public CreateTaskRequestParametersSummarization summarization;

        /**
         * <p>Specifies whether to enable the summarization feature, which can generate results such as a full-text summary and a speaker summary.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SummarizationEnabled")
        public Boolean summarizationEnabled;

        /**
         * <p>Specifies whether to enable the spoken-to-written conversion feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TextPolishEnabled")
        public Boolean textPolishEnabled;

        /**
         * <p>Parameters for transcoding source audio/video files or audio streams.</p>
         */
        @NameInMap("Transcoding")
        public CreateTaskRequestParametersTranscoding transcoding;

        /**
         * <p>Parameters to control the speech transcription process.</p>
         */
        @NameInMap("Transcription")
        public CreateTaskRequestParametersTranscription transcription;

        /**
         * <p>Parameters to control the translation feature.</p>
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
