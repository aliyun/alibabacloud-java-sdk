// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcDurationByAppIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcDurationByAppIdResponseBodyData> data;

    @NameInMap("ReadyTs")
    public Long readyTs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcDurationByAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcDurationByAppIdResponseBody self = new DescribeMeterRtcDurationByAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcDurationByAppIdResponseBody setData(java.util.List<DescribeMeterRtcDurationByAppIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcDurationByAppIdResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcDurationByAppIdResponseBody setReadyTs(Long readyTs) {
        this.readyTs = readyTs;
        return this;
    }
    public Long getReadyTs() {
        return this.readyTs;
    }

    public DescribeMeterRtcDurationByAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcDurationByAppIdResponseBodyData extends TeaModel {
        @NameInMap("AudioDuration")
        public Long audioDuration;

        @NameInMap("ContentDuration")
        public Long contentDuration;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        @NameInMap("V1080Duration")
        public Long v1080Duration;

        @NameInMap("V360Duration")
        public Long v360Duration;

        @NameInMap("V720Duration")
        public Long v720Duration;

        public static DescribeMeterRtcDurationByAppIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcDurationByAppIdResponseBodyData self = new DescribeMeterRtcDurationByAppIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setContentDuration(Long contentDuration) {
            this.contentDuration = contentDuration;
            return this;
        }
        public Long getContentDuration() {
            return this.contentDuration;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setV1080Duration(Long v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setV360Duration(Long v360Duration) {
            this.v360Duration = v360Duration;
            return this;
        }
        public Long getV360Duration() {
            return this.v360Duration;
        }

        public DescribeMeterRtcDurationByAppIdResponseBodyData setV720Duration(Long v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Long getV720Duration() {
            return this.v720Duration;
        }

    }

}
