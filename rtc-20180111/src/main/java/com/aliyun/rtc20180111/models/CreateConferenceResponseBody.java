// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateConferenceResponseBody extends TeaModel {
    @NameInMap("AuthInfo")
    public CreateConferenceResponseBodyAuthInfo authInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    public static CreateConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConferenceResponseBody self = new CreateConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConferenceResponseBody setAuthInfo(CreateConferenceResponseBodyAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public CreateConferenceResponseBodyAuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public CreateConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConferenceResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class CreateConferenceResponseBodyAuthInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("Timestamp")
        public Integer timestamp;

        public static CreateConferenceResponseBodyAuthInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateConferenceResponseBodyAuthInfo self = new CreateConferenceResponseBodyAuthInfo();
            return TeaModel.build(map, self);
        }

        public CreateConferenceResponseBodyAuthInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateConferenceResponseBodyAuthInfo setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public CreateConferenceResponseBodyAuthInfo setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

    }

}
