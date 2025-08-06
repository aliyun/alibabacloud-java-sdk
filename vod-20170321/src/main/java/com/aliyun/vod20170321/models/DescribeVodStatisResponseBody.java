// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStatisResponseBody extends TeaModel {
    @NameInMap("CdnData")
    public DescribeVodStatisResponseBodyCdnData cdnData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageData")
    public DescribeVodStatisResponseBodyStorageData storageData;

    @NameInMap("TranscodeData")
    public DescribeVodStatisResponseBodyTranscodeData transcodeData;

    public static DescribeVodStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStatisResponseBody self = new DescribeVodStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodStatisResponseBody setCdnData(DescribeVodStatisResponseBodyCdnData cdnData) {
        this.cdnData = cdnData;
        return this;
    }
    public DescribeVodStatisResponseBodyCdnData getCdnData() {
        return this.cdnData;
    }

    public DescribeVodStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodStatisResponseBody setStorageData(DescribeVodStatisResponseBodyStorageData storageData) {
        this.storageData = storageData;
        return this;
    }
    public DescribeVodStatisResponseBodyStorageData getStorageData() {
        return this.storageData;
    }

    public DescribeVodStatisResponseBody setTranscodeData(DescribeVodStatisResponseBodyTranscodeData transcodeData) {
        this.transcodeData = transcodeData;
        return this;
    }
    public DescribeVodStatisResponseBodyTranscodeData getTranscodeData() {
        return this.transcodeData;
    }

    public static class DescribeVodStatisResponseBodyCdnData extends TeaModel {
        @NameInMap("Bps")
        public Float bps;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeVodStatisResponseBodyCdnData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStatisResponseBodyCdnData self = new DescribeVodStatisResponseBodyCdnData();
            return TeaModel.build(map, self);
        }

        public DescribeVodStatisResponseBodyCdnData setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeVodStatisResponseBodyCdnData setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeVodStatisResponseBodyStorageData extends TeaModel {
        @NameInMap("Size")
        public Long size;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeVodStatisResponseBodyStorageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStatisResponseBodyStorageData self = new DescribeVodStatisResponseBodyStorageData();
            return TeaModel.build(map, self);
        }

        public DescribeVodStatisResponseBodyStorageData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeVodStatisResponseBodyStorageData setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeVodStatisResponseBodyTranscodeData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        public static DescribeVodStatisResponseBodyTranscodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStatisResponseBodyTranscodeData self = new DescribeVodStatisResponseBodyTranscodeData();
            return TeaModel.build(map, self);
        }

        public DescribeVodStatisResponseBodyTranscodeData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

}
