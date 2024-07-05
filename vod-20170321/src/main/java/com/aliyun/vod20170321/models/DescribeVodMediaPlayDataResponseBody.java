// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("QoeInfoList")
    public java.util.List<DescribeVodMediaPlayDataResponseBodyQoeInfoList> qoeInfoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeVodMediaPlayDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMediaPlayDataResponseBody self = new DescribeVodMediaPlayDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodMediaPlayDataResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeVodMediaPlayDataResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodMediaPlayDataResponseBody setQoeInfoList(java.util.List<DescribeVodMediaPlayDataResponseBodyQoeInfoList> qoeInfoList) {
        this.qoeInfoList = qoeInfoList;
        return this;
    }
    public java.util.List<DescribeVodMediaPlayDataResponseBodyQoeInfoList> getQoeInfoList() {
        return this.qoeInfoList;
    }

    public DescribeVodMediaPlayDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodMediaPlayDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVodMediaPlayDataResponseBodyQoeInfoList extends TeaModel {
        /**
         * <p>The number of visits to the audio or video per day.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DAU")
        public Float DAU;

        /**
         * <p>The ID of the media file (VideoId).</p>
         * 
         * <strong>example:</strong>
         * <p>9ae2af636ca6c10412f44891fc****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The total playback duration of the audio or video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2400</p>
         */
        @NameInMap("PlayDuration")
        public Float playDuration;

        /**
         * <p>The average playback duration of the audio or video per viewer. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("PlayDurationPerUv")
        public Float playDurationPerUv;

        /**
         * <p>The average number of times that the audio or video was played per viewer.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PlayPerVv")
        public Float playPerVv;

        /**
         * <p>The total number of times the audio or video has been played.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PlaySuccessVv")
        public Float playSuccessVv;

        /**
         * <p>The duration of the audio or video file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>246</p>
         */
        @NameInMap("VideoDuration")
        public Float videoDuration;

        /**
         * <p>The name of the audio or video file.</p>
         */
        @NameInMap("VideoTitle")
        public String videoTitle;

        public static DescribeVodMediaPlayDataResponseBodyQoeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodMediaPlayDataResponseBodyQoeInfoList self = new DescribeVodMediaPlayDataResponseBodyQoeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setDAU(Float DAU) {
            this.DAU = DAU;
            return this;
        }
        public Float getDAU() {
            return this.DAU;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setPlayDuration(Float playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public Float getPlayDuration() {
            return this.playDuration;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setPlayDurationPerUv(Float playDurationPerUv) {
            this.playDurationPerUv = playDurationPerUv;
            return this;
        }
        public Float getPlayDurationPerUv() {
            return this.playDurationPerUv;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setPlayPerVv(Float playPerVv) {
            this.playPerVv = playPerVv;
            return this;
        }
        public Float getPlayPerVv() {
            return this.playPerVv;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setPlaySuccessVv(Float playSuccessVv) {
            this.playSuccessVv = playSuccessVv;
            return this;
        }
        public Float getPlaySuccessVv() {
            return this.playSuccessVv;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setVideoDuration(Float videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Float getVideoDuration() {
            return this.videoDuration;
        }

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setVideoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
            return this;
        }
        public String getVideoTitle() {
            return this.videoTitle;
        }

    }

}
