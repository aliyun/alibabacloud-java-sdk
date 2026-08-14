// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("Data")
    public GetTaskInfoResponseBodyData data;

    /**
     * <p>Status description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, used only for joint debugging.</p>
     * 
     * <strong>example:</strong>
     * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfoResponseBody self = new GetTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskInfoResponseBody setData(GetTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTaskInfoResponseBodyDataResult extends TeaModel {
        /**
         * <p>Link to the result of the Auto Chapters feature.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_AutoChapters_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_AutoChapters_20231222101215.json?Expires=1706064016</a></p>
         */
        @NameInMap("AutoChapters")
        public String autoChapters;

        /**
         * <p>URL link to the result of conversation content extraction</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ ContentExtraction_20231222101215.json?Expires=1706064016</p>
         */
        @NameInMap("ContentExtraction")
        public String contentExtraction;

        /**
         * <p>Link to the result of the Custom prompt</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ CustomPrompt_20231222101215.json?Expires=1706064016</p>
         */
        @NameInMap("CustomPrompt")
        public String customPrompt;

        /**
         * <p>The URL link to the identity recognition result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ IdentityRecognition_20231222101215.json?Expires=1706064016</p>
         */
        @NameInMap("IdentityRecognition")
        public String identityRecognition;

        /**
         * <p>URL link to the result of Intelligent Meeting Summary</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_MeetingAssistance_20231222101112.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_MeetingAssistance_20231222101112.json?Expires=1706064016</a></p>
         */
        @NameInMap("MeetingAssistance")
        public String meetingAssistance;

        /**
         * <p>URL link to the result of video PPT extraction and summarization</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_PptExtraction_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_PptExtraction_20231222101215.json?Expires=1706064016</a></p>
         */
        @NameInMap("PptExtraction")
        public String pptExtraction;

        /**
         * <p>Link to the result of service inspection</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ ServiceInspection_20231222101215.json?Expires=1706064016</p>
         */
        @NameInMap("ServiceInspection")
        public String serviceInspection;

        /**
         * <p>Link to the result of LLM-based summarization.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Summarization_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Summarization_20231222101215.json?Expires=1706064016</a></p>
         */
        @NameInMap("Summarization")
        public String summarization;

        /**
         * <p>Link to the result of spoken-to-written text conversion</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_TextPolish_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_TextPolish_20231222101215.json?Expires=1706064016</a></p>
         */
        @NameInMap("TextPolish")
        public String textPolish;

        /**
         * <p>Link to the result of speech transcription.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Transcription_20231222101008.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Transcription_20231222101008.json?Expires=1706064016</a></p>
         */
        @NameInMap("Transcription")
        public String transcription;

        /**
         * <p>URL link to the result of text translation</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Translation_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Translation_20231222101215.json?Expires=1706064016</a></p>
         */
        @NameInMap("Translation")
        public String translation;

        public static GetTaskInfoResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfoResponseBodyDataResult self = new GetTaskInfoResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetTaskInfoResponseBodyDataResult setAutoChapters(String autoChapters) {
            this.autoChapters = autoChapters;
            return this;
        }
        public String getAutoChapters() {
            return this.autoChapters;
        }

        public GetTaskInfoResponseBodyDataResult setContentExtraction(String contentExtraction) {
            this.contentExtraction = contentExtraction;
            return this;
        }
        public String getContentExtraction() {
            return this.contentExtraction;
        }

        public GetTaskInfoResponseBodyDataResult setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public GetTaskInfoResponseBodyDataResult setIdentityRecognition(String identityRecognition) {
            this.identityRecognition = identityRecognition;
            return this;
        }
        public String getIdentityRecognition() {
            return this.identityRecognition;
        }

        public GetTaskInfoResponseBodyDataResult setMeetingAssistance(String meetingAssistance) {
            this.meetingAssistance = meetingAssistance;
            return this;
        }
        public String getMeetingAssistance() {
            return this.meetingAssistance;
        }

        public GetTaskInfoResponseBodyDataResult setPptExtraction(String pptExtraction) {
            this.pptExtraction = pptExtraction;
            return this;
        }
        public String getPptExtraction() {
            return this.pptExtraction;
        }

        public GetTaskInfoResponseBodyDataResult setServiceInspection(String serviceInspection) {
            this.serviceInspection = serviceInspection;
            return this;
        }
        public String getServiceInspection() {
            return this.serviceInspection;
        }

        public GetTaskInfoResponseBodyDataResult setSummarization(String summarization) {
            this.summarization = summarization;
            return this;
        }
        public String getSummarization() {
            return this.summarization;
        }

        public GetTaskInfoResponseBodyDataResult setTextPolish(String textPolish) {
            this.textPolish = textPolish;
            return this;
        }
        public String getTextPolish() {
            return this.textPolish;
        }

        public GetTaskInfoResponseBodyDataResult setTranscription(String transcription) {
            this.transcription = transcription;
            return this;
        }
        public String getTranscription() {
            return this.transcription;
        }

        public GetTaskInfoResponseBodyDataResult setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

    }

    public static class GetTaskInfoResponseBodyData extends TeaModel {
        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>TSC.AudioFormat</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Audio format invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>URL link to the MP3 conversion result</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp3?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp3?Expires=1706064016</a></p>
         */
        @NameInMap("OutputMp3Path")
        public String outputMp3Path;

        /**
         * <p>URL link to the MP4 conversion result</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp4?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp4?Expires=1706064016</a></p>
         */
        @NameInMap("OutputMp4Path")
        public String outputMp4Path;

        /**
         * <p>URL link to the audio waveform graph</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.spectrum?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.spectrum?Expires=1706064016</a></p>
         */
        @NameInMap("OutputSpectrumPath")
        public String outputSpectrumPath;

        /**
         * <p>URL link to the video thumbnail</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.png?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.png?Expires=1706064016</a></p>
         */
        @NameInMap("OutputThumbnailPath")
        public String outputThumbnailPath;

        /**
         * <p>A collection of results from various algorithm processing tasks. The result is returned as an HTTP link, which the user can use to parse the native result.</p>
         */
        @NameInMap("Result")
        public GetTaskInfoResponseBodyDataResult result;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c5394c6ee0fb474899d42215a3925c7e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The custom ID set by the user when creating the job.</p>
         * 
         * <strong>example:</strong>
         * <p>task_tingwu_123</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        /**
         * <p>Task Status.</p>
         * <ul>
         * <li>ONGOING: The job is in progress.</li>
         * <li>COMPLETED: The job is completed.</li>
         * <li>FAILED: The job has failed.</li>
         * <li>INVALID: The job is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfoResponseBodyData self = new GetTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskInfoResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTaskInfoResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTaskInfoResponseBodyData setOutputMp3Path(String outputMp3Path) {
            this.outputMp3Path = outputMp3Path;
            return this;
        }
        public String getOutputMp3Path() {
            return this.outputMp3Path;
        }

        public GetTaskInfoResponseBodyData setOutputMp4Path(String outputMp4Path) {
            this.outputMp4Path = outputMp4Path;
            return this;
        }
        public String getOutputMp4Path() {
            return this.outputMp4Path;
        }

        public GetTaskInfoResponseBodyData setOutputSpectrumPath(String outputSpectrumPath) {
            this.outputSpectrumPath = outputSpectrumPath;
            return this;
        }
        public String getOutputSpectrumPath() {
            return this.outputSpectrumPath;
        }

        public GetTaskInfoResponseBodyData setOutputThumbnailPath(String outputThumbnailPath) {
            this.outputThumbnailPath = outputThumbnailPath;
            return this;
        }
        public String getOutputThumbnailPath() {
            return this.outputThumbnailPath;
        }

        public GetTaskInfoResponseBodyData setResult(GetTaskInfoResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetTaskInfoResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetTaskInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskInfoResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public GetTaskInfoResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
