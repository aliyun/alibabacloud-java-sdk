// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoResponseBody self = new GenerateVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVideoResponseBody setData(GenerateVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateVideoResponseBodyData getData() {
        return this.data;
    }

    public GenerateVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-gen/2021-05-07-15/B9MGfwxu.mp4?Expires=1620372653&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=F9flL1n5GPYaae0dLl%2F8D%2Bn4j6">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-gen/2021-05-07-15/B9MGfwxu.mp4?Expires=1620372653&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=F9flL1n5GPYaae0dLl%2F8D%2Bn4j6</a>****</p>
         */
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-gen/2021-05-07-15/B9MGfwxu.jpg?Expires=1620372653&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=djBvGvdJu8bd%2FC%2BVHdg1d57U%2Bu">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-gen/2021-05-07-15/B9MGfwxu.jpg?Expires=1620372653&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=djBvGvdJu8bd%2FC%2BVHdg1d57U%2Bu</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GenerateVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoResponseBodyData self = new GenerateVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateVideoResponseBodyData setVideoCoverUrl(String videoCoverUrl) {
            this.videoCoverUrl = videoCoverUrl;
            return this;
        }
        public String getVideoCoverUrl() {
            return this.videoCoverUrl;
        }

        public GenerateVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
