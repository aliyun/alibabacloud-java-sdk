// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Long pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Long totalNum;

    @NameInMap("TopPlayVideos")
    @Validation(required = true)
    public DescribePlayTopVideosResponseTopPlayVideos topPlayVideos;

    public static DescribePlayTopVideosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosResponse self = new DescribePlayTopVideosResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePlayTopVideosResponseTopPlayVideosTopPlayVideoStatis extends TeaModel {
        @NameInMap("PlayDuration")
        @Validation(required = true)
        public String playDuration;

        @NameInMap("VV")
        @Validation(required = true)
        public String VV;

        @NameInMap("UV")
        @Validation(required = true)
        public String UV;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        public static DescribePlayTopVideosResponseTopPlayVideosTopPlayVideoStatis build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayTopVideosResponseTopPlayVideosTopPlayVideoStatis self = new DescribePlayTopVideosResponseTopPlayVideosTopPlayVideoStatis();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayTopVideosResponseTopPlayVideos extends TeaModel {
        @NameInMap("TopPlayVideoStatis")
        @Validation(required = true)
        public java.util.List<DescribePlayTopVideosResponseTopPlayVideosTopPlayVideoStatis> topPlayVideoStatis;

        public static DescribePlayTopVideosResponseTopPlayVideos build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayTopVideosResponseTopPlayVideos self = new DescribePlayTopVideosResponseTopPlayVideos();
            return TeaModel.build(map, self);
        }

    }

}
