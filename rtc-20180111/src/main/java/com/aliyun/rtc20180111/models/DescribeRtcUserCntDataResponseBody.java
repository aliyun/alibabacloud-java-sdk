// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserCntDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserCntDataPerInterval")
    public DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval userCntDataPerInterval;

    public static DescribeRtcUserCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserCntDataResponseBody self = new DescribeRtcUserCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcUserCntDataResponseBody setUserCntDataPerInterval(DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval userCntDataPerInterval) {
        this.userCntDataPerInterval = userCntDataPerInterval;
        return this;
    }
    public DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval getUserCntDataPerInterval() {
        return this.userCntDataPerInterval;
    }

    public static class DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule extends TeaModel {
        @NameInMap("ActiveUserCnt")
        public Long activeUserCnt;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule self = new DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule setActiveUserCnt(Long activeUserCnt) {
            this.activeUserCnt = activeUserCnt;
            return this;
        }
        public Long getActiveUserCnt() {
            return this.activeUserCnt;
        }

        public DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval extends TeaModel {
        @NameInMap("UserCntModule")
        public java.util.List<DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule> userCntModule;

        public static DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval self = new DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserCntDataResponseBodyUserCntDataPerInterval setUserCntModule(java.util.List<DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule> userCntModule) {
            this.userCntModule = userCntModule;
            return this;
        }
        public java.util.List<DescribeRtcUserCntDataResponseBodyUserCntDataPerIntervalUserCntModule> getUserCntModule() {
            return this.userCntModule;
        }

    }

}
