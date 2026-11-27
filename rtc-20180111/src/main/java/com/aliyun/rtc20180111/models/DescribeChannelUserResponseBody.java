// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the channel exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The channel exists.</li>
     * <li><strong>false</strong>: The channel does not exist.</li>
     * </ul>
     */
    @NameInMap("ChannelExist")
    public Boolean channelExist;

    /**
     * <p>Indicates whether the user is currently in the channel. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The user is in the channel.</li>
     * <li><strong>false</strong>: The user is not in the channel.</li>
     * </ul>
     */
    @NameInMap("InChannel")
    public Boolean inChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of session information.</p>
     */
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
         * <p>The UNIX timestamp in seconds when the user joined the channel. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        @NameInMap("Joined")
        public Long joined;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xa744sxx8rtobgj****</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The user ID.</p>
         * 
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
