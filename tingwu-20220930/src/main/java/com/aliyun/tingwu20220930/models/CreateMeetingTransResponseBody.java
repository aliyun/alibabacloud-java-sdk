// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateMeetingTransResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMeetingTransResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMeetingTransResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingTransResponseBody self = new CreateMeetingTransResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMeetingTransResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMeetingTransResponseBody setData(CreateMeetingTransResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMeetingTransResponseBodyData getData() {
        return this.data;
    }

    public CreateMeetingTransResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMeetingTransResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMeetingTransResponseBodyData extends TeaModel {
        @NameInMap("MeetingId")
        public String meetingId;

        @NameInMap("MeetingJoinUrl")
        public String meetingJoinUrl;

        @NameInMap("MeetingKey")
        public String meetingKey;

        public static CreateMeetingTransResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingTransResponseBodyData self = new CreateMeetingTransResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMeetingTransResponseBodyData setMeetingId(String meetingId) {
            this.meetingId = meetingId;
            return this;
        }
        public String getMeetingId() {
            return this.meetingId;
        }

        public CreateMeetingTransResponseBodyData setMeetingJoinUrl(String meetingJoinUrl) {
            this.meetingJoinUrl = meetingJoinUrl;
            return this;
        }
        public String getMeetingJoinUrl() {
            return this.meetingJoinUrl;
        }

        public CreateMeetingTransResponseBodyData setMeetingKey(String meetingKey) {
            this.meetingKey = meetingKey;
            return this;
        }
        public String getMeetingKey() {
            return this.meetingKey;
        }

    }

}
