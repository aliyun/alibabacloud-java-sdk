// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UnmuteAudioAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("Participants")
    public UnmuteAudioAllResponseBodyParticipants participants;

    public static UnmuteAudioAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmuteAudioAllResponseBody self = new UnmuteAudioAllResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmuteAudioAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnmuteAudioAllResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public UnmuteAudioAllResponseBody setParticipants(UnmuteAudioAllResponseBodyParticipants participants) {
        this.participants = participants;
        return this;
    }
    public UnmuteAudioAllResponseBodyParticipants getParticipants() {
        return this.participants;
    }

    public static class UnmuteAudioAllResponseBodyParticipantsParticipant extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public String id;

        public static UnmuteAudioAllResponseBodyParticipantsParticipant build(java.util.Map<String, ?> map) throws Exception {
            UnmuteAudioAllResponseBodyParticipantsParticipant self = new UnmuteAudioAllResponseBodyParticipantsParticipant();
            return TeaModel.build(map, self);
        }

        public UnmuteAudioAllResponseBodyParticipantsParticipant setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnmuteAudioAllResponseBodyParticipantsParticipant setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnmuteAudioAllResponseBodyParticipantsParticipant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UnmuteAudioAllResponseBodyParticipants extends TeaModel {
        @NameInMap("Participant")
        public java.util.List<UnmuteAudioAllResponseBodyParticipantsParticipant> participant;

        public static UnmuteAudioAllResponseBodyParticipants build(java.util.Map<String, ?> map) throws Exception {
            UnmuteAudioAllResponseBodyParticipants self = new UnmuteAudioAllResponseBodyParticipants();
            return TeaModel.build(map, self);
        }

        public UnmuteAudioAllResponseBodyParticipants setParticipant(java.util.List<UnmuteAudioAllResponseBodyParticipantsParticipant> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<UnmuteAudioAllResponseBodyParticipantsParticipant> getParticipant() {
            return this.participant;
        }

    }

}
