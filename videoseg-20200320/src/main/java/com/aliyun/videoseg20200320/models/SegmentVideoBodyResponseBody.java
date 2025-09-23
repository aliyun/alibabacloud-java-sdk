// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentVideoBodyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>49E2CC28-ED1D-4CC5-854D-7D0AE2B20976</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-human-segmentation/D86DDFBC-B8ED-4780-9E6A-E5BA98D7CC9F.mp4?Expires=1584709406&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=Fx5HVxvRjAMIjWL2OvhTlOO4cC">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-human-segmentation/D86DDFBC-B8ED-4780-9E6A-E5BA98D7CC9F.mp4?Expires=1584709406&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=Fx5HVxvRjAMIjWL2OvhTlOO4cC</a>****</p>
         */
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
