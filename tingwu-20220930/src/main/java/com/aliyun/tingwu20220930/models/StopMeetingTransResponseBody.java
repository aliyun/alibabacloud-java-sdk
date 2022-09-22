// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class StopMeetingTransResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopMeetingTransResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StopMeetingTransResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopMeetingTransResponseBody self = new StopMeetingTransResponseBody();
        return TeaModel.build(map, self);
    }

    public StopMeetingTransResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopMeetingTransResponseBody setData(StopMeetingTransResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopMeetingTransResponseBodyData getData() {
        return this.data;
    }

    public StopMeetingTransResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopMeetingTransResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopMeetingTransResponseBodyData extends TeaModel {
        @NameInMap("MeetingId")
        public String meetingId;

        @NameInMap("MeetingKey")
        public String meetingKey;

        @NameInMap("MeetingStatus")
        public String meetingStatus;

        public static StopMeetingTransResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopMeetingTransResponseBodyData self = new StopMeetingTransResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopMeetingTransResponseBodyData setMeetingId(String meetingId) {
            this.meetingId = meetingId;
            return this;
        }
        public String getMeetingId() {
            return this.meetingId;
        }

        public StopMeetingTransResponseBodyData setMeetingKey(String meetingKey) {
            this.meetingKey = meetingKey;
            return this;
        }
        public String getMeetingKey() {
            return this.meetingKey;
        }

        public StopMeetingTransResponseBodyData setMeetingStatus(String meetingStatus) {
            this.meetingStatus = meetingStatus;
            return this;
        }
        public String getMeetingStatus() {
            return this.meetingStatus;
        }

    }

}
