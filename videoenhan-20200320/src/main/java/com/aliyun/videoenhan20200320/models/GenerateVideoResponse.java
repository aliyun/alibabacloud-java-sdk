// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateVideoResponseData data;

    public static GenerateVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoResponse self = new GenerateVideoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVideoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateVideoResponse setData(GenerateVideoResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateVideoResponseData getData() {
        return this.data;
    }

    public static class GenerateVideoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("VideoCoverUrl")
        @Validation(required = true)
        public String videoCoverUrl;

        public static GenerateVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoResponseData self = new GenerateVideoResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateVideoResponseData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public GenerateVideoResponseData setVideoCoverUrl(String videoCoverUrl) {
            this.videoCoverUrl = videoCoverUrl;
            return this;
        }
        public String getVideoCoverUrl() {
            return this.videoCoverUrl;
        }

    }

}
