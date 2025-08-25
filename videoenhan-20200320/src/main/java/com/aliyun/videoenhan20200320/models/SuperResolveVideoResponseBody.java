// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public SuperResolveVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>186AC396-0EEC-46F1-AAA1-BF3585227427</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SuperResolveVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoResponseBody self = new SuperResolveVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoResponseBody setData(SuperResolveVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SuperResolveVideoResponseBodyData getData() {
        return this.data;
    }

    public SuperResolveVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SuperResolveVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SuperResolveVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-super-resolution/2020-03-20-12/12%3A11-UlLVELFzIy5EAyEh.mp4?Expires=1584708132&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=0V8yKrCVybC4KIPtRuGKJDJaQT">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-super-resolution/2020-03-20-12/12%3A11-UlLVELFzIy5EAyEh.mp4?Expires=1584708132&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=0V8yKrCVybC4KIPtRuGKJDJaQT</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static SuperResolveVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SuperResolveVideoResponseBodyData self = new SuperResolveVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SuperResolveVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
