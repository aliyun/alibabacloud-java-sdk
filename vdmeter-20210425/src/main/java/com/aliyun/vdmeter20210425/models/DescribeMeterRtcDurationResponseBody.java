// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcDurationResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcDurationResponseBodyData> data;

    @NameInMap("ReadyTs")
    public Long readyTs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcDurationResponseBody self = new DescribeMeterRtcDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcDurationResponseBody setData(java.util.List<DescribeMeterRtcDurationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcDurationResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcDurationResponseBody setReadyTs(Long readyTs) {
        this.readyTs = readyTs;
        return this;
    }
    public Long getReadyTs() {
        return this.readyTs;
    }

    public DescribeMeterRtcDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcDurationResponseBodyData extends TeaModel {
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

        @NameInMap("V480Duration")
        public Long v480Duration;

        @NameInMap("V720Duration")
        public Long v720Duration;

        public static DescribeMeterRtcDurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcDurationResponseBodyData self = new DescribeMeterRtcDurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcDurationResponseBodyData setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeMeterRtcDurationResponseBodyData setContentDuration(Long contentDuration) {
            this.contentDuration = contentDuration;
            return this;
        }
        public Long getContentDuration() {
            return this.contentDuration;
        }

        public DescribeMeterRtcDurationResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterRtcDurationResponseBodyData setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeMeterRtcDurationResponseBodyData setV1080Duration(Long v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeMeterRtcDurationResponseBodyData setV480Duration(Long v480Duration) {
            this.v480Duration = v480Duration;
            return this;
        }
        public Long getV480Duration() {
            return this.v480Duration;
        }

        public DescribeMeterRtcDurationResponseBodyData setV720Duration(Long v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Long getV720Duration() {
            return this.v720Duration;
        }

    }

}
