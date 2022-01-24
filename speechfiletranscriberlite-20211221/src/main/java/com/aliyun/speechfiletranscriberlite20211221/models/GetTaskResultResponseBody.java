// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class GetTaskResultResponseBody extends TeaModel {
    @NameInMap("BizDuration")
    public Integer bizDuration;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetTaskResultResponseBodyResult result;

    @NameInMap("SolveTime")
    public Long solveTime;

    @NameInMap("StatusCode")
    public Long statusCode;

    @NameInMap("StatusText")
    public String statusText;

    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponseBody self = new GetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponseBody setBizDuration(Integer bizDuration) {
        this.bizDuration = bizDuration;
        return this;
    }
    public Integer getBizDuration() {
        return this.bizDuration;
    }

    public GetTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResultResponseBody setResult(GetTaskResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTaskResultResponseBodyResult getResult() {
        return this.result;
    }

    public GetTaskResultResponseBody setSolveTime(Long solveTime) {
        this.solveTime = solveTime;
        return this;
    }
    public Long getSolveTime() {
        return this.solveTime;
    }

    public GetTaskResultResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public GetTaskResultResponseBody setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }
    public String getStatusText() {
        return this.statusText;
    }

    public GetTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetTaskResultResponseBodyResultParagraphs extends TeaModel {
        @NameInMap("BeginTIme")
        public Long beginTIme;

        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Text")
        public String text;

        public static GetTaskResultResponseBodyResultParagraphs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyResultParagraphs self = new GetTaskResultResponseBodyResultParagraphs();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyResultParagraphs setBeginTIme(Long beginTIme) {
            this.beginTIme = beginTIme;
            return this;
        }
        public Long getBeginTIme() {
            return this.beginTIme;
        }

        public GetTaskResultResponseBodyResultParagraphs setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public GetTaskResultResponseBodyResultParagraphs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskResultResponseBodyResultParagraphs setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetTaskResultResponseBodyResultSentences extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("EmotionValue")
        public Float emotionValue;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("SpeakerId")
        public String speakerId;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        public static GetTaskResultResponseBodyResultSentences build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyResultSentences self = new GetTaskResultResponseBodyResultSentences();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyResultSentences setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetTaskResultResponseBodyResultSentences setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public GetTaskResultResponseBodyResultSentences setEmotionValue(Float emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Float getEmotionValue() {
            return this.emotionValue;
        }

        public GetTaskResultResponseBodyResultSentences setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskResultResponseBodyResultSentences setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetTaskResultResponseBodyResultSentences setSpeakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }
        public String getSpeakerId() {
            return this.speakerId;
        }

        public GetTaskResultResponseBodyResultSentences setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetTaskResultResponseBodyResultSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetTaskResultResponseBodyResultWords extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Word")
        public String word;

        public static GetTaskResultResponseBodyResultWords build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyResultWords self = new GetTaskResultResponseBodyResultWords();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyResultWords setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetTaskResultResponseBodyResultWords setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public GetTaskResultResponseBodyResultWords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskResultResponseBodyResultWords setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class GetTaskResultResponseBodyResult extends TeaModel {
        @NameInMap("Paragraphs")
        public java.util.List<GetTaskResultResponseBodyResultParagraphs> paragraphs;

        @NameInMap("Sentences")
        public java.util.List<GetTaskResultResponseBodyResultSentences> sentences;

        @NameInMap("Words")
        public java.util.List<GetTaskResultResponseBodyResultWords> words;

        public static GetTaskResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyResult self = new GetTaskResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyResult setParagraphs(java.util.List<GetTaskResultResponseBodyResultParagraphs> paragraphs) {
            this.paragraphs = paragraphs;
            return this;
        }
        public java.util.List<GetTaskResultResponseBodyResultParagraphs> getParagraphs() {
            return this.paragraphs;
        }

        public GetTaskResultResponseBodyResult setSentences(java.util.List<GetTaskResultResponseBodyResultSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<GetTaskResultResponseBodyResultSentences> getSentences() {
            return this.sentences;
        }

        public GetTaskResultResponseBodyResult setWords(java.util.List<GetTaskResultResponseBodyResultWords> words) {
            this.words = words;
            return this;
        }
        public java.util.List<GetTaskResultResponseBodyResultWords> getWords() {
            return this.words;
        }

    }

}
