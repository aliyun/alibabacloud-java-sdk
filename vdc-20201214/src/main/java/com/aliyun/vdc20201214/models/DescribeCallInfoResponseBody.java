// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallInfoResponseBody extends TeaModel {
    @NameInMap("CallInfo")
    public DescribeCallInfoResponseBodyCallInfo callInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCallInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallInfoResponseBody self = new DescribeCallInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallInfoResponseBody setCallInfo(DescribeCallInfoResponseBodyCallInfo callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public DescribeCallInfoResponseBodyCallInfo getCallInfo() {
        return this.callInfo;
    }

    public DescribeCallInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCallInfoResponseBodyCallInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CallStatus")
        public String callStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        @NameInMap("Duration")
        public Long duration;

        public static DescribeCallInfoResponseBodyCallInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallInfoResponseBodyCallInfo self = new DescribeCallInfoResponseBodyCallInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCallInfoResponseBodyCallInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCallInfoResponseBodyCallInfo setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeCallInfoResponseBodyCallInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCallInfoResponseBodyCallInfo setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeCallInfoResponseBodyCallInfo setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeCallInfoResponseBodyCallInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

}
