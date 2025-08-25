// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorResponseBody extends TeaModel {
    @NameInMap("Data")
    public AdjustVideoColorResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C4EB5E0B-0718-42CC-9B2C-1FB149256874</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AdjustVideoColorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorResponseBody self = new AdjustVideoColorResponseBody();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorResponseBody setData(AdjustVideoColorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AdjustVideoColorResponseBodyData getData() {
        return this.data;
    }

    public AdjustVideoColorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AdjustVideoColorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AdjustVideoColorResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-recolor/2021-01-21-07/46%3A05-test.mov?Expires=1611216966&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=icKn5gEQ6rNlSHmCi2zAf2tC0L">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-recolor/2021-01-21-07/46%3A05-test.mov?Expires=1611216966&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=icKn5gEQ6rNlSHmCi2zAf2tC0L</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AdjustVideoColorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AdjustVideoColorResponseBodyData self = new AdjustVideoColorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AdjustVideoColorResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
