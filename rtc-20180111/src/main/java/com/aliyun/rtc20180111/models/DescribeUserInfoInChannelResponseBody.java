// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUserInfoInChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsInChannel")
    public Boolean isInChannel;

    @NameInMap("Timestamp")
    public Integer timestamp;

    @NameInMap("IsChannelExist")
    public Boolean isChannelExist;

    @NameInMap("Property")
    public java.util.List<DescribeUserInfoInChannelResponseBodyProperty> property;

    public static DescribeUserInfoInChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoInChannelResponseBody self = new DescribeUserInfoInChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoInChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserInfoInChannelResponseBody setIsInChannel(Boolean isInChannel) {
        this.isInChannel = isInChannel;
        return this;
    }
    public Boolean getIsInChannel() {
        return this.isInChannel;
    }

    public DescribeUserInfoInChannelResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public DescribeUserInfoInChannelResponseBody setIsChannelExist(Boolean isChannelExist) {
        this.isChannelExist = isChannelExist;
        return this;
    }
    public Boolean getIsChannelExist() {
        return this.isChannelExist;
    }

    public DescribeUserInfoInChannelResponseBody setProperty(java.util.List<DescribeUserInfoInChannelResponseBodyProperty> property) {
        this.property = property;
        return this;
    }
    public java.util.List<DescribeUserInfoInChannelResponseBodyProperty> getProperty() {
        return this.property;
    }

    public static class DescribeUserInfoInChannelResponseBodyProperty extends TeaModel {
        @NameInMap("Session")
        public String session;

        @NameInMap("Join")
        public Integer join;

        @NameInMap("Role")
        public Integer role;

        public static DescribeUserInfoInChannelResponseBodyProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserInfoInChannelResponseBodyProperty self = new DescribeUserInfoInChannelResponseBodyProperty();
            return TeaModel.build(map, self);
        }

        public DescribeUserInfoInChannelResponseBodyProperty setSession(String session) {
            this.session = session;
            return this;
        }
        public String getSession() {
            return this.session;
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

    }

}
