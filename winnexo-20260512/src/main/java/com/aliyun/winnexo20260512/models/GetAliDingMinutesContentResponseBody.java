// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAliDingMinutesContentResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The DingTalk minutes ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76327569643231383535353939365f3436383537393431335f32</p>
     */
    @NameInMap("minutesId")
    public String minutesId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The intelligent meeting summary content.</p>
     * 
     * <strong>example:</strong>
     * <h1>Meeting Summary</h1>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The new session title.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly Project Meeting</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The to-do item details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dingtalkTodoList&quot;:[]}</p>
     */
    @NameInMap("todoContent")
    public String todoContent;

    /**
     * <p>The speech-type execution parameters.</p>
     */
    @NameInMap("transcription")
    public java.util.List<GetAliDingMinutesContentResponseBodyTranscription> transcription;

    public static GetAliDingMinutesContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliDingMinutesContentResponseBody self = new GetAliDingMinutesContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliDingMinutesContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliDingMinutesContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAliDingMinutesContentResponseBody setMinutesId(String minutesId) {
        this.minutesId = minutesId;
        return this;
    }
    public String getMinutesId() {
        return this.minutesId;
    }

    public GetAliDingMinutesContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAliDingMinutesContentResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetAliDingMinutesContentResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetAliDingMinutesContentResponseBody setTodoContent(String todoContent) {
        this.todoContent = todoContent;
        return this;
    }
    public String getTodoContent() {
        return this.todoContent;
    }

    public GetAliDingMinutesContentResponseBody setTranscription(java.util.List<GetAliDingMinutesContentResponseBodyTranscription> transcription) {
        this.transcription = transcription;
        return this;
    }
    public java.util.List<GetAliDingMinutesContentResponseBodyTranscription> getTranscription() {
        return this.transcription;
    }

    public static class GetAliDingMinutesContentResponseBodyTranscription extends TeaModel {
        /**
         * <p>The returned content.</p>
         * 
         * <strong>example:</strong>
         * <p>Meeting started</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The speaker.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("speaker")
        public String speaker;

        /**
         * <p>The avatar of the speaker. An empty string is returned if no avatar is available.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://robject.oss-cn-shanghai.aliyuncs.com/robject-daily1/">https://robject.oss-cn-shanghai.aliyuncs.com/robject-daily1/</a></p>
         */
        @NameInMap("speakerAvatar")
        public String speakerAvatar;

        /**
         * <p>The end time of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("timeEnd")
        public Long timeEnd;

        /**
         * <p>The start time of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("timeStart")
        public Long timeStart;

        public static GetAliDingMinutesContentResponseBodyTranscription build(java.util.Map<String, ?> map) throws Exception {
            GetAliDingMinutesContentResponseBodyTranscription self = new GetAliDingMinutesContentResponseBodyTranscription();
            return TeaModel.build(map, self);
        }

        public GetAliDingMinutesContentResponseBodyTranscription setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAliDingMinutesContentResponseBodyTranscription setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetAliDingMinutesContentResponseBodyTranscription setSpeakerAvatar(String speakerAvatar) {
            this.speakerAvatar = speakerAvatar;
            return this;
        }
        public String getSpeakerAvatar() {
            return this.speakerAvatar;
        }

        public GetAliDingMinutesContentResponseBodyTranscription setTimeEnd(Long timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }
        public Long getTimeEnd() {
            return this.timeEnd;
        }

        public GetAliDingMinutesContentResponseBodyTranscription setTimeStart(Long timeStart) {
            this.timeStart = timeStart;
            return this;
        }
        public Long getTimeStart() {
            return this.timeStart;
        }

    }

}
