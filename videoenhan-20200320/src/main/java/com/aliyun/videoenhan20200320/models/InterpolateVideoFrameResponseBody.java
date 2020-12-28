// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public InterpolateVideoFrameResponseBodyData data;

    public static InterpolateVideoFrameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameResponseBody self = new InterpolateVideoFrameResponseBody();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InterpolateVideoFrameResponseBody setData(InterpolateVideoFrameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InterpolateVideoFrameResponseBodyData getData() {
        return this.data;
    }

    public static class InterpolateVideoFrameResponseBodyData extends TeaModel {
        @NameInMap("VideoURL")
        public String videoURL;

        public static InterpolateVideoFrameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InterpolateVideoFrameResponseBodyData self = new InterpolateVideoFrameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InterpolateVideoFrameResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
