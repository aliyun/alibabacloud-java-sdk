// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ChangeVideoSizeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C00C5A32-9F54-44F0-9778-0968DD9BF22A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeVideoSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeResponseBody self = new ChangeVideoSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeVideoSizeResponseBody setData(ChangeVideoSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeVideoSizeResponseBodyData getData() {
        return this.data;
    }

    public ChangeVideoSizeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeVideoSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeVideoSizeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-crop/2020-07-24-20/ZTZslWcU.jpg?Expires=1595597077&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=5cq1NNBEzS64U7RTXRBGlo7WPy">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-crop/2020-07-24-20/ZTZslWcU.jpg?Expires=1595597077&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=5cq1NNBEzS64U7RTXRBGlo7WPy</a>****</p>
         */
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-crop/2020-07-24-20/ZTZslWcU.mp4?Expires=1595597077&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=ZyvD9AXCT2IUFkVJngQdbXMwX6">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-crop/2020-07-24-20/ZTZslWcU.mp4?Expires=1595597077&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=ZyvD9AXCT2IUFkVJngQdbXMwX6</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ChangeVideoSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeVideoSizeResponseBodyData self = new ChangeVideoSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeVideoSizeResponseBodyData setVideoCoverUrl(String videoCoverUrl) {
            this.videoCoverUrl = videoCoverUrl;
            return this;
        }
        public String getVideoCoverUrl() {
            return this.videoCoverUrl;
        }

        public ChangeVideoSizeResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
