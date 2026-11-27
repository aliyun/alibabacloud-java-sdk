// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUserInfoInChannelResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the channel exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The channel exists.</li>
     * <li><strong>false</strong>: The channel does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsChannelExist")
    public Boolean isChannelExist;

    /**
     * <p>Indicates whether the user is currently in the channel. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The user is in the channel.</li>
     * <li><strong>false</strong>: The user is not in the channel.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsInChannel")
    public Boolean isInChannel;

    /**
     * <p>The information of the user in the channel.</p>
     */
    @NameInMap("Property")
    public java.util.List<DescribeUserInfoInChannelResponseBodyProperty> property;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp of the current moment (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>1557909133</p>
     */
    @NameInMap("Timestamp")
    public Integer timestamp;

    public static DescribeUserInfoInChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoInChannelResponseBody self = new DescribeUserInfoInChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoInChannelResponseBody setIsChannelExist(Boolean isChannelExist) {
        this.isChannelExist = isChannelExist;
        return this;
    }
    public Boolean getIsChannelExist() {
        return this.isChannelExist;
    }

    public DescribeUserInfoInChannelResponseBody setIsInChannel(Boolean isInChannel) {
        this.isInChannel = isInChannel;
        return this;
    }
    public Boolean getIsInChannel() {
        return this.isInChannel;
    }

    public DescribeUserInfoInChannelResponseBody setProperty(java.util.List<DescribeUserInfoInChannelResponseBodyProperty> property) {
        this.property = property;
        return this;
    }
    public java.util.List<DescribeUserInfoInChannelResponseBodyProperty> getProperty() {
        return this.property;
    }

    public DescribeUserInfoInChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserInfoInChannelResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public static class DescribeUserInfoInChannelResponseBodyProperty extends TeaModel {
        /**
         * <p>The time when the user joined the meeting (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        @NameInMap("Join")
        public Integer join;

        /**
         * <p>The role type in the meeting. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The user role in communication mode.</p>
         * </li>
         * <li><p><strong>1</strong>: The interactive role.</p>
         * </li>
         * <li><p><strong>2</strong>: The live (view only) role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Role")
        public Integer role;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xa744sxx8rtobgj****</p>
         */
        @NameInMap("Session")
        public String session;

        public static DescribeUserInfoInChannelResponseBodyProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserInfoInChannelResponseBodyProperty self = new DescribeUserInfoInChannelResponseBodyProperty();
            return TeaModel.build(map, self);
        }

        public DescribeUserInfoInChannelResponseBodyProperty setJoin(Integer join) {
            this.join = join;
            return this;
        }
        public Integer getJoin() {
            return this.join;
        }

        public DescribeUserInfoInChannelResponseBodyProperty setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public DescribeUserInfoInChannelResponseBodyProperty setSession(String session) {
            this.session = session;
            return this;
        }
        public String getSession() {
            return this.session;
        }

    }

}
