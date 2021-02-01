// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UnderstandVideoContentResponseBodyData data;

    public static UnderstandVideoContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentResponseBody self = new UnderstandVideoContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnderstandVideoContentResponseBody setData(UnderstandVideoContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnderstandVideoContentResponseBodyData getData() {
        return this.data;
    }

    public static class UnderstandVideoContentResponseBodyDataVideoInfo extends TeaModel {
        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Fps")
        public Float fps;

        public static UnderstandVideoContentResponseBodyDataVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            UnderstandVideoContentResponseBodyDataVideoInfo self = new UnderstandVideoContentResponseBodyDataVideoInfo();
            return TeaModel.build(map, self);
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public UnderstandVideoContentResponseBodyDataVideoInfo setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
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
