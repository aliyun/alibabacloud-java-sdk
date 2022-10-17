// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentVideoBodyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentVideoBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyResponseBody self = new SegmentVideoBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentVideoBodyResponseBody setData(SegmentVideoBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentVideoBodyResponseBodyData getData() {
        return this.data;
    }

    public SegmentVideoBodyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentVideoBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentVideoBodyResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static SegmentVideoBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentVideoBodyResponseBodyData self = new SegmentVideoBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentVideoBodyResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
