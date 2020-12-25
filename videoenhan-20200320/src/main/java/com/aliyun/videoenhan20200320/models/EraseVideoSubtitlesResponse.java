// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EraseVideoSubtitlesResponseData data;

    public static EraseVideoSubtitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesResponse self = new EraseVideoSubtitlesResponse();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EraseVideoSubtitlesResponse setData(EraseVideoSubtitlesResponseData data) {
        this.data = data;
        return this;
    }
    public EraseVideoSubtitlesResponseData getData() {
        return this.data;
    }

    public static class EraseVideoSubtitlesResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static EraseVideoSubtitlesResponseData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoSubtitlesResponseData self = new EraseVideoSubtitlesResponseData();
            return TeaModel.build(map, self);
        }

        public EraseVideoSubtitlesResponseData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
