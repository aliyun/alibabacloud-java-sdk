// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("Participants")
    public MuteAudioResponseBodyParticipants participants;

    public static MuteAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioResponseBody self = new MuteAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public MuteAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MuteAudioResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAudioResponseBody setParticipants(MuteAudioResponseBodyParticipants participants) {
        this.participants = participants;
        return this;
    }
    public MuteAudioResponseBodyParticipants getParticipants() {
        return this.participants;
    }

    public static class MuteAudioResponseBodyParticipantsParticipant extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public String id;

        public static MuteAudioResponseBodyParticipantsParticipant build(java.util.Map<String, ?> map) throws Exception {
            MuteAudioResponseBodyParticipantsParticipant self = new MuteAudioResponseBodyParticipantsParticipant();
            return TeaModel.build(map, self);
        }

        public MuteAudioResponseBodyParticipantsParticipant setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MuteAudioResponseBodyParticipantsParticipant setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MuteAudioResponseBodyParticipantsParticipant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class MuteAudioResponseBodyParticipants extends TeaModel {
        @NameInMap("Participant")
        public java.util.List<MuteAudioResponseBodyParticipantsParticipant> participant;

        public static MuteAudioResponseBodyParticipants build(java.util.Map<String, ?> map) throws Exception {
            MuteAudioResponseBodyParticipants self = new MuteAudioResponseBodyParticipants();
            return TeaModel.build(map, self);
        }

        public MuteAudioResponseBodyParticipants setParticipant(java.util.List<MuteAudioResponseBodyParticipantsParticipant> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<MuteAudioResponseBodyParticipantsParticipant> getParticipant() {
            return this.participant;
        }

    }

}
