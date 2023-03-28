// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhancePortraitVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnhancePortraitVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EnhancePortraitVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhancePortraitVideoResponseBody self = new EnhancePortraitVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhancePortraitVideoResponseBody setData(EnhancePortraitVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhancePortraitVideoResponseBodyData getData() {
        return this.data;
    }

    public EnhancePortraitVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnhancePortraitVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnhancePortraitVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static EnhancePortraitVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhancePortraitVideoResponseBodyData self = new EnhancePortraitVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhancePortraitVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
