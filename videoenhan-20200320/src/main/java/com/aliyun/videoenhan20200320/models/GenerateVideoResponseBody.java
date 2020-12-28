// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateVideoResponseBodyData data;

    public static GenerateVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoResponseBody self = new GenerateVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateVideoResponseBody setData(GenerateVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateVideoResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

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
