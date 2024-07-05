// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4B0BCF9F-2FD5-4817-****-7BEBBE3AF90B&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The daily playback statistics on each top video.</p>
     */
    @NameInMap("TopPlayVideos")
    public DescribePlayTopVideosResponseBodyTopPlayVideos topPlayVideos;

    /**
     * <p>The total number of entries that were collected in playback statistics on top videos.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The playback duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4640369</p>
         */
        @NameInMap("PlayDuration")
        public String playDuration;

        /**
         * <p>The title of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>Four streams (two streams encrypted): LD-HLS-encrypted + SD-MP4 + HD-H</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The number of unique visitors.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UV")
        public String UV;

        /**
         * <p>The number of video views.</p>
         * 
         * <strong>example:</strong>
         * <p>107</p>
         */
        @NameInMap("VV")
        public String VV;

        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>2a8d4cb9ecbb487681473a15****8fda</p>
         */
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
