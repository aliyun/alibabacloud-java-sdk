// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AbstractEcommerceVideoResponseBodyData data;

    public static AbstractEcommerceVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoResponseBody self = new AbstractEcommerceVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbstractEcommerceVideoResponseBody setData(AbstractEcommerceVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbstractEcommerceVideoResponseBodyData getData() {
        return this.data;
    }

    public static class AbstractEcommerceVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AbstractEcommerceVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbstractEcommerceVideoResponseBodyData self = new AbstractEcommerceVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbstractEcommerceVideoResponseBodyData setVideoCoverUrl(String videoCoverUrl) {
            this.videoCoverUrl = videoCoverUrl;
            return this;
        }
        public String getVideoCoverUrl() {
            return this.videoCoverUrl;
        }

        public AbstractEcommerceVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
