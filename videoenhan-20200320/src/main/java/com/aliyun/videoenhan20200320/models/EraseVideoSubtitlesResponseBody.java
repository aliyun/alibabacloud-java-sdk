// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponseBody extends TeaModel {
    @NameInMap("Data")
    public EraseVideoSubtitlesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EraseVideoSubtitlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesResponseBody self = new EraseVideoSubtitlesResponseBody();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesResponseBody setData(EraseVideoSubtitlesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EraseVideoSubtitlesResponseBodyData getData() {
        return this.data;
    }

    public EraseVideoSubtitlesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EraseVideoSubtitlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EraseVideoSubtitlesResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static EraseVideoSubtitlesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoSubtitlesResponseBodyData self = new EraseVideoSubtitlesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EraseVideoSubtitlesResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
