// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNo")
    public Long pageNo;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The daily playback statistics on each top video.
    @NameInMap("TopPlayVideos")
    public DescribePlayTopVideosResponseBodyTopPlayVideos topPlayVideos;

    // The total number of entries that were collected in playback statistics on top videos.
    @NameInMap("TotalNum")
    public Long totalNum;

    public static DescribePlayTopVideosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosResponseBody self = new DescribePlayTopVideosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayTopVideosResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayTopVideosResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayTopVideosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayTopVideosResponseBody setTopPlayVideos(DescribePlayTopVideosResponseBodyTopPlayVideos topPlayVideos) {
        this.topPlayVideos = topPlayVideos;
        return this;
    }
    public DescribePlayTopVideosResponseBodyTopPlayVideos getTopPlayVideos() {
        return this.topPlayVideos;
    }

    public DescribePlayTopVideosResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis extends TeaModel {
        // The playback duration. Unit: milliseconds.
        @NameInMap("PlayDuration")
        public String playDuration;

        // The title of the video.
        @NameInMap("Title")
        public String title;

        // The number of unique visitors.
        @NameInMap("UV")
        public String UV;

        // The number of video views.
        @NameInMap("VV")
        public String VV;

        // The ID of the video.
        @NameInMap("VideoId")
        public String videoId;

        public static DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis self = new DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis();
            return TeaModel.build(map, self);
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis setPlayDuration(String playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public String getPlayDuration() {
            return this.playDuration;
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis setUV(String UV) {
            this.UV = UV;
            return this;
        }
        public String getUV() {
            return this.UV;
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis setVV(String VV) {
            this.VV = VV;
            return this;
        }
        public String getVV() {
            return this.VV;
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class DescribePlayTopVideosResponseBodyTopPlayVideos extends TeaModel {
        @NameInMap("TopPlayVideoStatis")
        public java.util.List<DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis> topPlayVideoStatis;

        public static DescribePlayTopVideosResponseBodyTopPlayVideos build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayTopVideosResponseBodyTopPlayVideos self = new DescribePlayTopVideosResponseBodyTopPlayVideos();
            return TeaModel.build(map, self);
        }

        public DescribePlayTopVideosResponseBodyTopPlayVideos setTopPlayVideoStatis(java.util.List<DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis> topPlayVideoStatis) {
            this.topPlayVideoStatis = topPlayVideoStatis;
            return this;
        }
        public java.util.List<DescribePlayTopVideosResponseBodyTopPlayVideosTopPlayVideoStatis> getTopPlayVideoStatis() {
            return this.topPlayVideoStatis;
        }

    }

}
