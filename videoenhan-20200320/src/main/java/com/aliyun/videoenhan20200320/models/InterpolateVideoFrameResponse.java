// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public InterpolateVideoFrameResponseData data;

    public static InterpolateVideoFrameResponse build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameResponse self = new InterpolateVideoFrameResponse();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InterpolateVideoFrameResponse setData(InterpolateVideoFrameResponseData data) {
        this.data = data;
        return this;
    }
    public InterpolateVideoFrameResponseData getData() {
        return this.data;
    }

    public static class InterpolateVideoFrameResponseData extends TeaModel {
        @NameInMap("VideoURL")
        @Validation(required = true)
        public String videoURL;

        public static InterpolateVideoFrameResponseData build(java.util.Map<String, ?> map) throws Exception {
            InterpolateVideoFrameResponseData self = new InterpolateVideoFrameResponseData();
            return TeaModel.build(map, self);
        }

        public InterpolateVideoFrameResponseData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
