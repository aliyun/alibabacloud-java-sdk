// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QoeInfoList")
    public java.util.List<DescribeVodMediaPlayDataResponseBodyQoeInfoList> qoeInfoList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DAU")
        public Float DAU;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("PlayDuration")
        public Float playDuration;

        @NameInMap("PlayDurationPerUv")
        public Float playDurationPerUv;

        @NameInMap("PlayPerVv")
        public Float playPerVv;

        @NameInMap("PlaySuccessVv")
        public Float playSuccessVv;

        @NameInMap("VideoDuration")
        public Float videoDuration;

        @NameInMap("VideoTitle")
        public Float videoTitle;

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

        public DescribeVodMediaPlayDataResponseBodyQoeInfoList setVideoTitle(Float videoTitle) {
            this.videoTitle = videoTitle;
            return this;
        }
        public Float getVideoTitle() {
            return this.videoTitle;
        }

    }

}
