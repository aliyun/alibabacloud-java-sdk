// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DialogueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogueResponseBody self = new DialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DialogueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DialogueResponseBody setData(DialogueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DialogueResponseBodyData getData() {
        return this.data;
    }

    public DialogueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DialogueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DialogueResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DialogueResponseBodyDataControlParamsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Voice</p>
         */
        @NameInMap("Type")
        public String type;

        public static DialogueResponseBodyDataControlParamsList build(java.util.Map<String, ?> map) throws Exception {
            DialogueResponseBodyDataControlParamsList self = new DialogueResponseBodyDataControlParamsList();
            return TeaModel.build(map, self);
        }

        public DialogueResponseBodyDataControlParamsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DialogueResponseBodyData extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        @NameInMap("ControlParamsList")
        public java.util.List<DialogueResponseBodyDataControlParamsList> controlParamsList;

        /**
         * <strong>example:</strong>
         * <p>1752283603978</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>1774858849987</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StreamEnd")
        public Boolean streamEnd;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamId")
        public String streamId;

        public static DialogueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DialogueResponseBodyData self = new DialogueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DialogueResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public DialogueResponseBodyData setControlParamsList(java.util.List<DialogueResponseBodyDataControlParamsList> controlParamsList) {
            this.controlParamsList = controlParamsList;
            return this;
        }
        public java.util.List<DialogueResponseBodyDataControlParamsList> getControlParamsList() {
            return this.controlParamsList;
        }

        public DialogueResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DialogueResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DialogueResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DialogueResponseBodyData setStreamEnd(Boolean streamEnd) {
            this.streamEnd = streamEnd;
            return this;
        }
        public Boolean getStreamEnd() {
            return this.streamEnd;
        }

        public DialogueResponseBodyData setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

    }

}
