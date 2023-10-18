// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The daily playback statistics on the video.</p>
     */
    @NameInMap("VideoPlayStatisDetails")
    public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails videoPlayStatisDetails;

    public static DescribePlayVideoStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisResponseBody self = new DescribePlayVideoStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayVideoStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayVideoStatisResponseBody setVideoPlayStatisDetails(DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails videoPlayStatisDetails) {
        this.videoPlayStatisDetails = videoPlayStatisDetails;
        return this;
    }
    public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails getVideoPlayStatisDetails() {
        return this.videoPlayStatisDetails;
    }

    public static class DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail extends TeaModel {
        /**
         * <p>The date. The date is displayed in the *yyyy-MM-dd* format.</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The playback duration. Unit: millisecond.</p>
         */
        @NameInMap("PlayDuration")
        public String playDuration;

        /**
         * <p>The distribution of the playback duration.</p>
         */
        @NameInMap("PlayRange")
        public String playRange;

        /**
         * <p>The video title.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The number of unique visitors.</p>
         */
        @NameInMap("UV")
        public String UV;

        /**
         * <p>The number of video views.</p>
         */
        @NameInMap("VV")
        public String VV;

        public static DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail self = new DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail();
            return TeaModel.build(map, self);
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setPlayDuration(String playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public String getPlayDuration() {
            return this.playDuration;
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setPlayRange(String playRange) {
            this.playRange = playRange;
            return this;
        }
        public String getPlayRange() {
            return this.playRange;
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setUV(String UV) {
            this.UV = UV;
            return this;
        }
        public String getUV() {
            return this.UV;
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail setVV(String VV) {
            this.VV = VV;
            return this;
        }
        public String getVV() {
            return this.VV;
        }

    }

    public static class DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails extends TeaModel {
        @NameInMap("VideoPlayStatisDetail")
        public java.util.List<DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail> videoPlayStatisDetail;

        public static DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails self = new DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails();
            return TeaModel.build(map, self);
        }

        public DescribePlayVideoStatisResponseBodyVideoPlayStatisDetails setVideoPlayStatisDetail(java.util.List<DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail> videoPlayStatisDetail) {
            this.videoPlayStatisDetail = videoPlayStatisDetail;
            return this;
        }
        public java.util.List<DescribePlayVideoStatisResponseBodyVideoPlayStatisDetailsVideoPlayStatisDetail> getVideoPlayStatisDetail() {
            return this.videoPlayStatisDetail;
        }

    }

}
