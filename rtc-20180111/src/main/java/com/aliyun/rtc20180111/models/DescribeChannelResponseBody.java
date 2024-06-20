// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelResponseBody extends TeaModel {
    /**
     * <p>channel</p>
     */
    @NameInMap("Channel")
    public DescribeChannelResponseBodyChannel channel;

    @NameInMap("ChannelExist")
    public Boolean channelExist;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelResponseBody self = new DescribeChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelResponseBody setChannel(DescribeChannelResponseBodyChannel channel) {
        this.channel = channel;
        return this;
    }
    public DescribeChannelResponseBodyChannel getChannel() {
        return this.channel;
    }

    public DescribeChannelResponseBody setChannelExist(Boolean channelExist) {
        this.channelExist = channelExist;
        return this;
    }
    public Boolean getChannelExist() {
        return this.channelExist;
    }

    public DescribeChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelResponseBodyChannel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testid</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeChannelResponseBodyChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelResponseBodyChannel self = new DescribeChannelResponseBodyChannel();
            return TeaModel.build(map, self);
        }

        public DescribeChannelResponseBodyChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeChannelResponseBodyChannel setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
