// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameResponseBody extends TeaModel {
    @NameInMap("Data")
    public InterpolateVideoFrameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7EF85B5B-FB44-4C3E-9B8F-08C6CD912CEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InterpolateVideoFrameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameResponseBody self = new InterpolateVideoFrameResponseBody();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameResponseBody setData(InterpolateVideoFrameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InterpolateVideoFrameResponseBodyData getData() {
        return this.data;
    }

    public InterpolateVideoFrameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InterpolateVideoFrameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InterpolateVideoFrameResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-interp/20-12-22/mRsPNVunG7717nne_20-12-22-07-29-51.mp4?Expires=1608624020&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=NFjSLll8E7E1tkuLPFyTpr6ULi">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-interp/20-12-22/mRsPNVunG7717nne_20-12-22-07-29-51.mp4?Expires=1608624020&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=NFjSLll8E7E1tkuLPFyTpr6ULi</a>****</p>
         */
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
