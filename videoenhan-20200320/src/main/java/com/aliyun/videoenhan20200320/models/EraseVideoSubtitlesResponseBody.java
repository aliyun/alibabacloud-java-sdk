// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponseBody extends TeaModel {
    @NameInMap("Data")
    public EraseVideoSubtitlesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CCB082BF-A6B1-4C28-9E49-562EEE7DE639</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-desubtitle/2021-04-13-10/41%3A57-TcFd6Zug7gXwbeqs.mp4?Expires=1618312317&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=LZnGSQ8019%2Br5rcR4vKOaaT2UE">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-desubtitle/2021-04-13-10/41%3A57-TcFd6Zug7gXwbeqs.mp4?Expires=1618312317&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=LZnGSQ8019%2Br5rcR4vKOaaT2UE</a>****</p>
         */
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
