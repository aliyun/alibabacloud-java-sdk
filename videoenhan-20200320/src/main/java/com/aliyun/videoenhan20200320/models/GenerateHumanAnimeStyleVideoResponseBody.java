// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateHumanAnimeStyleVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>d21a2afa-4d52-4bca-803b-e65028146603</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateHumanAnimeStyleVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleVideoResponseBody self = new GenerateHumanAnimeStyleVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleVideoResponseBody setData(GenerateHumanAnimeStyleVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateHumanAnimeStyleVideoResponseBodyData getData() {
        return this.data;
    }

    public GenerateHumanAnimeStyleVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateHumanAnimeStyleVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateHumanAnimeStyleVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-xstream-cn-shanghai.oss-cn-shanghai.aliyuncs.com/xstream-framework/upload_result_video_2023-02-10_09.45.55.mp4?Expires=1675995564&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=aIXTeM4IU4nARjy3SNA3YGhhqj">http://vibktprfx-prod-prod-xstream-cn-shanghai.oss-cn-shanghai.aliyuncs.com/xstream-framework/upload_result_video_2023-02-10_09.45.55.mp4?Expires=1675995564&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=aIXTeM4IU4nARjy3SNA3YGhhqj</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GenerateHumanAnimeStyleVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateHumanAnimeStyleVideoResponseBodyData self = new GenerateHumanAnimeStyleVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateHumanAnimeStyleVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
