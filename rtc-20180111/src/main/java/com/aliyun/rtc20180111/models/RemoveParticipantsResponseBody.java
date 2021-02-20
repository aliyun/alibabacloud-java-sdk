// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveParticipantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("Participants")
    public RemoveParticipantsResponseBodyParticipants participants;

    public static RemoveParticipantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveParticipantsResponseBody self = new RemoveParticipantsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveParticipantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveParticipantsResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public RemoveParticipantsResponseBody setParticipants(RemoveParticipantsResponseBodyParticipants participants) {
        this.participants = participants;
        return this;
    }
    public RemoveParticipantsResponseBodyParticipants getParticipants() {
        return this.participants;
    }

    public static class RemoveParticipantsResponseBodyParticipantsParticipant extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public String id;

        public static RemoveParticipantsResponseBodyParticipantsParticipant build(java.util.Map<String, ?> map) throws Exception {
            RemoveParticipantsResponseBodyParticipantsParticipant self = new RemoveParticipantsResponseBodyParticipantsParticipant();
            return TeaModel.build(map, self);
        }

        public RemoveParticipantsResponseBodyParticipantsParticipant setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveParticipantsResponseBodyParticipantsParticipant setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveParticipantsResponseBodyParticipantsParticipant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class RemoveParticipantsResponseBodyParticipants extends TeaModel {
        @NameInMap("Participant")
        public java.util.List<RemoveParticipantsResponseBodyParticipantsParticipant> participant;

        public static RemoveParticipantsResponseBodyParticipants build(java.util.Map<String, ?> map) throws Exception {
            RemoveParticipantsResponseBodyParticipants self = new RemoveParticipantsResponseBodyParticipants();
            return TeaModel.build(map, self);
        }

        public RemoveParticipantsResponseBodyParticipants setParticipant(java.util.List<RemoveParticipantsResponseBodyParticipantsParticipant> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<RemoveParticipantsResponseBodyParticipantsParticipant> getParticipant() {
            return this.participant;
        }

    }

}
