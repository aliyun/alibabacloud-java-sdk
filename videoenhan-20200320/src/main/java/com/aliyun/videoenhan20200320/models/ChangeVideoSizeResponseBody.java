// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ChangeVideoSizeResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

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
