// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeConferenceAuthInfoResponseBody extends TeaModel {
    @NameInMap("AuthInfo")
    public DescribeConferenceAuthInfoResponseBodyAuthInfo authInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    public static DescribeConferenceAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConferenceAuthInfoResponseBody self = new DescribeConferenceAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConferenceAuthInfoResponseBody setAuthInfo(DescribeConferenceAuthInfoResponseBodyAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public DescribeConferenceAuthInfoResponseBodyAuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public DescribeConferenceAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConferenceAuthInfoResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class DescribeConferenceAuthInfoResponseBodyAuthInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("Timestamp")
        public Integer timestamp;

        public static DescribeConferenceAuthInfoResponseBodyAuthInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeConferenceAuthInfoResponseBodyAuthInfo self = new DescribeConferenceAuthInfoResponseBodyAuthInfo();
            return TeaModel.build(map, self);
        }

        public DescribeConferenceAuthInfoResponseBodyAuthInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeConferenceAuthInfoResponseBodyAuthInfo setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeConferenceAuthInfoResponseBodyAuthInfo setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

    }

}
