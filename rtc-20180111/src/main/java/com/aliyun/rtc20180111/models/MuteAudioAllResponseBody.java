// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("Participants")
    public MuteAudioAllResponseBodyParticipants participants;

    public static MuteAudioAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioAllResponseBody self = new MuteAudioAllResponseBody();
        return TeaModel.build(map, self);
    }

    public MuteAudioAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MuteAudioAllResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAudioAllResponseBody setParticipants(MuteAudioAllResponseBodyParticipants participants) {
        this.participants = participants;
        return this;
    }
    public MuteAudioAllResponseBodyParticipants getParticipants() {
        return this.participants;
    }

    public static class MuteAudioAllResponseBodyParticipantsParticipant extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public String id;

        public static MuteAudioAllResponseBodyParticipantsParticipant build(java.util.Map<String, ?> map) throws Exception {
            MuteAudioAllResponseBodyParticipantsParticipant self = new MuteAudioAllResponseBodyParticipantsParticipant();
            return TeaModel.build(map, self);
        }

        public MuteAudioAllResponseBodyParticipantsParticipant setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MuteAudioAllResponseBodyParticipantsParticipant setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MuteAudioAllResponseBodyParticipantsParticipant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class MuteAudioAllResponseBodyParticipants extends TeaModel {
        @NameInMap("Participant")
        public java.util.List<MuteAudioAllResponseBodyParticipantsParticipant> participant;

        public static MuteAudioAllResponseBodyParticipants build(java.util.Map<String, ?> map) throws Exception {
            MuteAudioAllResponseBodyParticipants self = new MuteAudioAllResponseBodyParticipants();
            return TeaModel.build(map, self);
        }

        public MuteAudioAllResponseBodyParticipants setParticipant(java.util.List<MuteAudioAllResponseBodyParticipantsParticipant> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<MuteAudioAllResponseBodyParticipantsParticipant> getParticipant() {
            return this.participant;
        }

    }

}
