// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentHalfBodyResponseBodyData data;

    public static SegmentHalfBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyResponseBody self = new SegmentHalfBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHalfBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHalfBodyResponseBody setData(SegmentHalfBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHalfBodyResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentHalfBodyResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static SegmentHalfBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHalfBodyResponseBodyData self = new SegmentHalfBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHalfBodyResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
