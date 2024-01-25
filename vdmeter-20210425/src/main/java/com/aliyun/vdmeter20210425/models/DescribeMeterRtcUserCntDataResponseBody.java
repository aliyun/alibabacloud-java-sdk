// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcUserCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcUserCntDataResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcUserCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcUserCntDataResponseBody self = new DescribeMeterRtcUserCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcUserCntDataResponseBody setData(java.util.List<DescribeMeterRtcUserCntDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcUserCntDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcUserCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcUserCntDataResponseBodyData extends TeaModel {
        @NameInMap("ActiveUserCnt")
        public Long activeUserCnt;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcUserCntDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcUserCntDataResponseBodyData self = new DescribeMeterRtcUserCntDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcUserCntDataResponseBodyData setActiveUserCnt(Long activeUserCnt) {
            this.activeUserCnt = activeUserCnt;
            return this;
        }
        public Long getActiveUserCnt() {
            return this.activeUserCnt;
        }

        public DescribeMeterRtcUserCntDataResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
