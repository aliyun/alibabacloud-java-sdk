// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class GetMeetingTransResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMeetingTransResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMeetingTransResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingTransResponseBody self = new GetMeetingTransResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMeetingTransResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMeetingTransResponseBody setData(GetMeetingTransResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMeetingTransResponseBodyData getData() {
        return this.data;
    }

    public GetMeetingTransResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMeetingTransResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMeetingTransResponseBodyData extends TeaModel {
        @NameInMap("MeetingId")
        public String meetingId;

        @NameInMap("MeetingKey")
        public String meetingKey;

        @NameInMap("MeetingStatus")
        public String meetingStatus;

        public static GetMeetingTransResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingTransResponseBodyData self = new GetMeetingTransResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMeetingTransResponseBodyData setMeetingId(String meetingId) {
            this.meetingId = meetingId;
            return this;
        }
        public String getMeetingId() {
            return this.meetingId;
        }

        public GetMeetingTransResponseBodyData setMeetingKey(String meetingKey) {
            this.meetingKey = meetingKey;
            return this;
        }
        public String getMeetingKey() {
            return this.meetingKey;
        }

        public GetMeetingTransResponseBodyData setMeetingStatus(String meetingStatus) {
            this.meetingStatus = meetingStatus;
            return this;
        }
        public String getMeetingStatus() {
            return this.meetingStatus;
        }

    }

}
