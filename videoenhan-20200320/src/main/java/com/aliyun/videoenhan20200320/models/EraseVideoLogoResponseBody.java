// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponseBody extends TeaModel {
    @NameInMap("Data")
    public EraseVideoLogoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>95532F36-98FC-4DCD-815C-282BB26D2DA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EraseVideoLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponseBody self = new EraseVideoLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoResponseBody setData(EraseVideoLogoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EraseVideoLogoResponseBodyData getData() {
        return this.data;
    }

    public EraseVideoLogoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EraseVideoLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EraseVideoLogoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-delogo/2020-03-20-11/53%3A56-DGNUGG7AcRlAylhr.mp4?Expires=1584707036&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=7CvsX7X1rSU%2B%2FDxnw484lb3LCD">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-delogo/2020-03-20-11/53%3A56-DGNUGG7AcRlAylhr.mp4?Expires=1584707036&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=7CvsX7X1rSU%2B%2FDxnw484lb3LCD</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static EraseVideoLogoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoResponseBodyData self = new EraseVideoLogoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
