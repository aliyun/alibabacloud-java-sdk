// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentResponseBody extends TeaModel {
    @NameInMap("Data")
    public UnderstandVideoContentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UnderstandVideoContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentResponseBody self = new UnderstandVideoContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentResponseBody setData(UnderstandVideoContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnderstandVideoContentResponseBodyData getData() {
        return this.data;
    }

    public UnderstandVideoContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnderstandVideoContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnderstandVideoContentResponseBodyDataVideoInfo extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Fps")
        public Float fps;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Width")
        public Long width;

        public static UnderstandVideoContentResponseBodyDataVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            UnderstandVideoContentResponseBodyDataVideoInfo self = new UnderstandVideoContentResponseBodyDataVideoInfo();
            return TeaModel.build(map, self);
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setFps(Float fps) {
            this.fps = fps;
            return this;
        }
        public Float getFps() {
            return this.fps;
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class UnderstandVideoContentResponseBodyData extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.Map<String, ?> tagInfo;

        @NameInMap("VideoInfo")
        public UnderstandVideoContentResponseBodyDataVideoInfo videoInfo;

        public static UnderstandVideoContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnderstandVideoContentResponseBodyData self = new UnderstandVideoContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnderstandVideoContentResponseBodyData setTagInfo(java.util.Map<String, ?> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.Map<String, ?> getTagInfo() {
            return this.tagInfo;
        }

        public UnderstandVideoContentResponseBodyData setVideoInfo(UnderstandVideoContentResponseBodyDataVideoInfo videoInfo) {
            this.videoInfo = videoInfo;
            return this;
        }
        public UnderstandVideoContentResponseBodyDataVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

    }

}
