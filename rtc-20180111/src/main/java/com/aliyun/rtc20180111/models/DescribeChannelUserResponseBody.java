// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserResponseBody extends TeaModel {
    @NameInMap("ChannelExist")
    public Boolean channelExist;

    @NameInMap("InChannel")
    public Boolean inChannel;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<DescribeChannelUserResponseBodySessions> sessions;

    public static DescribeChannelUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserResponseBody self = new DescribeChannelUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserResponseBody setChannelExist(Boolean channelExist) {
        this.channelExist = channelExist;
        return this;
    }
    public Boolean getChannelExist() {
        return this.channelExist;
    }

    public DescribeChannelUserResponseBody setInChannel(Boolean inChannel) {
        this.inChannel = inChannel;
        return this;
    }
    public Boolean getInChannel() {
        return this.inChannel;
    }

    public DescribeChannelUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelUserResponseBody setSessions(java.util.List<DescribeChannelUserResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeChannelUserResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public static class DescribeChannelUserResponseBodySessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        @NameInMap("Joined")
        public Long joined;

        /**
         * <strong>example:</strong>
         * <p>xa744sxx8rtobgj****</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>1811****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeChannelUserResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserResponseBodySessions self = new DescribeChannelUserResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserResponseBodySessions setJoined(Long joined) {
            this.joined = joined;
            return this;
        }
        public Long getJoined() {
            return this.joined;
        }

        public DescribeChannelUserResponseBodySessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeChannelUserResponseBodySessions setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
