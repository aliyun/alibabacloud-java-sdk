// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentGreenScreenVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentGreenScreenVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentGreenScreenVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentGreenScreenVideoResponseBody self = new SegmentGreenScreenVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentGreenScreenVideoResponseBody setData(SegmentGreenScreenVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentGreenScreenVideoResponseBodyData getData() {
        return this.data;
    }

    public SegmentGreenScreenVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentGreenScreenVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentGreenScreenVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoURL")
        public String videoURL;

        public static SegmentGreenScreenVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentGreenScreenVideoResponseBodyData self = new SegmentGreenScreenVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentGreenScreenVideoResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
