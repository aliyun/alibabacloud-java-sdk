// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UnmuteAudioResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("Participants")
    public UnmuteAudioResponseBodyParticipants participants;

    public static UnmuteAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmuteAudioResponseBody self = new UnmuteAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmuteAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnmuteAudioResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public UnmuteAudioResponseBody setParticipants(UnmuteAudioResponseBodyParticipants participants) {
        this.participants = participants;
        return this;
    }
    public UnmuteAudioResponseBodyParticipants getParticipants() {
        return this.participants;
    }

    public static class UnmuteAudioResponseBodyParticipantsParticipant extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public String id;

        public static UnmuteAudioResponseBodyParticipantsParticipant build(java.util.Map<String, ?> map) throws Exception {
            UnmuteAudioResponseBodyParticipantsParticipant self = new UnmuteAudioResponseBodyParticipantsParticipant();
            return TeaModel.build(map, self);
        }

        public UnmuteAudioResponseBodyParticipantsParticipant setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnmuteAudioResponseBodyParticipantsParticipant setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnmuteAudioResponseBodyParticipantsParticipant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UnmuteAudioResponseBodyParticipants extends TeaModel {
        @NameInMap("Participant")
        public java.util.List<UnmuteAudioResponseBodyParticipantsParticipant> participant;

        public static UnmuteAudioResponseBodyParticipants build(java.util.Map<String, ?> map) throws Exception {
            UnmuteAudioResponseBodyParticipants self = new UnmuteAudioResponseBodyParticipants();
            return TeaModel.build(map, self);
        }

        public UnmuteAudioResponseBodyParticipants setParticipant(java.util.List<UnmuteAudioResponseBodyParticipantsParticipant> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<UnmuteAudioResponseBodyParticipantsParticipant> getParticipant() {
            return this.participant;
        }

    }

}
